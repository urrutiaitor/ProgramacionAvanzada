package FigurasGeometricas;

public class Circulo extends Figuras{

	int radio;
	
	public Circulo(int area, int x, int y, int radio) {
		super(area, x, y);
		this.radio = radio;
	}

	@Override
	public String toString() {
		return super.toString() +"Circulo [radio=" + radio + "]";
	}
	
	
	
}
