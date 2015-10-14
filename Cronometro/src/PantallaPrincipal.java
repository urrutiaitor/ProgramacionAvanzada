

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PantallaPrincipal implements ActionListener {
	JLabel lValor;
	int contador;
	Timer timer = null;
	
	public PantallaPrincipal(){
		JFrame pantalla = new JFrame("Cuenta Clicks"); //Creas la pantalla
		contador = 0;
		pantalla.setSize(300, 400);
		pantalla.setLocation(480, 100);
		
		pantalla.setContentPane(crearPanelVentana());//Coloca como panel el panel que te voy a pasar(colocar algo en la zona gris)
		pantalla.setVisible(true);//La haces visible
		pantalla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//El programa se termina
	}
	
	private Container crearPanelVentana() {
		JPanel panel = new JPanel(new BorderLayout());
		lValor = new JLabel(String.valueOf(contador));
		JButton boton = new JButton();
		
		lValor.setFont(new Font("Arial",Font.BOLD,250));
		lValor.setForeground(Color.CYAN);
		
		lValor.setHorizontalAlignment(JLabel.CENTER);//centrar cero
		
		boton.addActionListener(this);
		
		panel.add(lValor, BorderLayout.CENTER);
		panel.add(crearContenedorSur(), BorderLayout.SOUTH);
		return panel;
	}

	private Component crearContenedorSur() {
		JPanel sur = new JPanel(new GridLayout(1,2,10,0));
		sur.add(new JButton("Start"));
		sur.add(new JButton("Stop"));
		return sur;
	}
	
	/*public class MiTarea extends TimerTask{
		lValor.setText(String)
	}*/

	public static void main(String[] args) {
		PantallaPrincipal programa = new PantallaPrincipal();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		contador++;
		lValor.setText(String.valueOf(contador));
		
	}

}
