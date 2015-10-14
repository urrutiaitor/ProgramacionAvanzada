package FigurasGeometricas;

public class Rectangulo extends Figuras{
	int lado1;
	int lado2;
	
	public Rectangulo(int area, int x, int y, int lado1, int lado2) {
		super(area, x, y);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	@Override
	public String toString() {
		return super.toString() + "Rectangulo [lado1=" + lado1 + ", lado2=" + lado2 + "]";
	}
	
	
}
