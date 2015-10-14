package FigurasGeometricas;

public class Triangulo extends Figuras {

	int base;
	int altura;
	
	public Triangulo(int area, int x, int y, int base, int altura) {
		super(area, x, y);
		this.base = base;
		this.altura = altura;
	}

	@Override
	public String toString() {
		return super.toString() +"Triangulo [base=" + base + ", altura=" + altura + "]";
	}
	
	
	
}
