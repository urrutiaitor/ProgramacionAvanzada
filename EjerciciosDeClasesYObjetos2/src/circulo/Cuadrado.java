package circulo;

public class Cuadrado extends Forma {
	private int lado;	
	public Cuadrado(int x, int y,int lado,int puntos) {
		super(x, y, puntos);
		this.lado = lado;
	}

	@Override
	public boolean colisiona(int x,int y) {
		if(x>(getX()-lado/2) && x<(getX()+lado/2) && y>(getY()-lado/2) && y>(getY()+lado/2) ){
			setDestruido(true);
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Cuadrado de lado " + lado + "y centro en (" + getX() + "," + getY() + ") puntos"+getPuntos();
	}

}
