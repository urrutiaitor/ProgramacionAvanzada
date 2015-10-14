package FigurasGeometricas;

public class Cuadrado extends Figuras {

	int lado;
	
	public Cuadrado(int area, int x, int y, int lado) {
		super(area, x, y);
		this.lado = lado;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString() +"Cuadrado [lado=" + lado + "]";
	}
	
}
