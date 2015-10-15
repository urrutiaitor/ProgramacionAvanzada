package circulo;

public class Circulo extends Forma {
	private int radio;
	public Circulo(int x, int y,int radio,int puntos) {
		super(x, y, puntos);
		this.radio=radio;
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean colisiona(int x, int y) {
		double dif;
		dif= Math.sqrt(Math.pow(getX()-x,2)+Math.pow(getY()-y, 2));
		if (dif <= radio){
			setDestruido(true);
			return true;
		}
		return false;
	}
	@Override
	public String toString() {
		return "Circulo de radio " + radio + " y centro en (" + getX() + "," + getY() + ") puntos"+getPuntos();
	}

}
