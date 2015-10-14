package edu.mondragon.pa.juegosimple;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Demo4 extends JComponent implements KeyListener{

    private final static int ANCHO = 512;

    private final static int ALTO = 384;

    private final static int DIAMETRO = 30;
    
    private final static int ANCHOPALA = 60;
    
    private final static int GROSORPALA = 20;
    
    private final static int POSINIPALAY = 344;
    
    private final static int POSINIPALAX = 240;
    private final static int ANCHOPROYECTIL = 5;
    private final static int LARGOPROYECTIL = 10;
    
    private float x, y;
    private int px,py,incX,incY;
    private float prx,pry;
    private float vx, vy;
    private float vpry;
    ArrayList<Disparo> disparos;
    boolean impacto;
    int numImg=0;
    int nImagenes = 5;
    String [] listaImagenes = {"icons/sb_boom0.gif","icons/sb_boom1.gif","icons/sb_boom2.gif",
    		"icons/sb_boom3.gif","icons/sb_boom3.gif"};
    
    public Demo4()  {
        setPreferredSize(new Dimension(ANCHO, ALTO));
        x = 10;
        y = 20;
        vx = 300;
        vy = 400;
        vpry = -1000;
        px = POSINIPALAX;
        py = POSINIPALAY;
        incX = 0;
        disparos = new ArrayList<Disparo>();
    }

    private void fisica(float dt) {
    	if (!impacto){
	        x += vx * dt;
	        y += vy * dt;
	        if (vx < 0 && x <= 0 || vx > 0 && x + DIAMETRO >= ANCHO)
	            vx = -vx;
	        
	        if (vy < 0 && y < 0 || vy > 0 && y + DIAMETRO >= ALTO 
	        		|| vy>0 && (y+DIAMETRO>=py&&(x>px&&x<px+ANCHOPALA)))
	            vy = -vy;
	        
	        if (incX<0){
	        	px = ((px+incX)<0 )? 0 : px+incX;
	        }
	        if (incX>0){
	        	px = ((px+incX+ANCHOPALA)>ANCHO)?ANCHO-ANCHOPALA : px+incX;
	        }
	        Iterator<Disparo> it = disparos.iterator();
	        while (it.hasNext()){
	        	Disparo disparo = it.next();
	        	float posY = disparo.getY()+dt*vpry;
	        	float posX = disparo.getX();
	        	if (posY <0){
	        		it.remove();
	        	}else{
	        		if ((posX>x&&posX<x+DIAMETRO)&&
	        		   (posY>y&&posY<y+DIAMETRO)){
	        			impacto = true;
	        	        it.remove();
	        		}
	        		disparo.setPosY(posY);
	        	}
	        	
	        	
	        }
    	}else{
    		numImg++;
    		if (numImg==nImagenes){
    			impacto = false;
    			
    			x = 10;
    	        y = 20;
    	        vx = 300;
    	        vy = 400;
    	        numImg =0;
    		}
    	}
    }

    public void paint(Graphics g) {
    	ImageIcon imagenObjetivo = new ImageIcon ("icons/sb_meteor.gif");
    	ImageIcon imagenNave = new ImageIcon ("icons/sb_ship.gif");
        g.setColor(Color.black);
        g.fillRect(0, 0, ANCHO, ALTO);
        g.drawImage(imagenObjetivo.getImage(),Math.round(x), Math.round(y), DIAMETRO, DIAMETRO, new Color(0.0f,0.0f,0.0f,0.0f),null);
        
       
        g.drawImage(imagenNave.getImage(),px,py,ANCHOPALA,GROSORPALA,new Color(0.0f,0.0f,0.0f,0.0f),null);
        if (impacto){
        	g.setColor(Color.BLACK);
        	g.drawImage (new ImageIcon(listaImagenes[numImg]).getImage(),
        			Math.round(x),Math.round(y),DIAMETRO,DIAMETRO,new  Color(0.0f,0.0f,0.0f,0.0f),null);
        	try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
       }else{
	        for (Disparo d :disparos){
	        	
	        	System.out.println ("x: "+d.getX()+ " y: "+d.getY());
	        	g.setColor(Color.RED);
	        	g.fillOval(Math.round(d.getX()),Math.round(d.getY()),ANCHOPROYECTIL,LARGOPROYECTIL);
	        	
	        }
       }
    }

    private void dibuja() throws Exception {
    	
        SwingUtilities.invokeAndWait(new Runnable() {
                public void run() {
                    paintImmediately(0, 0, ANCHO, ALTO);
                }
            });
        
    	
    }

    public void cicloPrincipalJuego() throws Exception {
        long tiempoViejo = System.nanoTime();
        while (true) {
            /*long tiempoNuevo = System.nanoTime();
            float dt = (tiempoNuevo - tiempoViejo) / 1000000000f;
            tiempoViejo = tiempoNuevo;
            */
        	Thread.sleep(10);
        	float dt = 0.01f;
        	fisica(dt);
            dibuja();
            
        }
    }

    public static void main(String[] args) throws Exception {
        JFrame jf = new JFrame("Demo1");
        jf.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });
        jf.setResizable(false);
        Demo4 demo1 = new Demo4();
        jf.setContentPane(demo1);
        jf.pack();
        jf.setVisible(true);
        demo1.setFocusable(true);
        demo1.addKeyListener(demo1);
        demo1.cicloPrincipalJuego();
    }

	@Override
	public void keyPressed(KeyEvent e) {
		
		
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
			incX = -20;
		if  (e.getKeyCode() == KeyEvent.VK_RIGHT)
			incX = 20;
		if (e.getKeyCode() == KeyEvent.VK_SPACE){
			Disparo disparo = new Disparo(py,(float)px+(ANCHOPALA/2));
			disparos.add(disparo);
			System.out.println ("disparo");
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
			incX = 0;
		if  (e.getKeyCode() == KeyEvent.VK_RIGHT)
			incX = 0;
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	public class Disparo{
		float posY;
		float posX;
		public Disparo (float posY, float posX){
			this.posY = posY;
			this.posX = posX;
		}
		public void setPosY(float y ){
			this.posY = y;
		}
		public float getX(){return posX;}
		public float getY(){return posY;}
	}
}
