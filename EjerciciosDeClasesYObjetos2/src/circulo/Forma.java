package circulo;

public abstract class Forma {
	private int cX,cY,puntos;
	private boolean destruido;
	
	public boolean isDestruido() {
		return destruido;
	}

	public void setDestruido(boolean destruido) {
		this.destruido = destruido;
	}

	public Forma(int x,int y, int puntos) {
		cX=x;
		cY=y;
		this.puntos = puntos;
		destruido = false;
	}	
	
	public int getX() {
		return cX;
	}

	public int getY() {
		return cY;
	}
	public int getPuntos() {		
		return puntos;
	}
	public abstract boolean colisiona(int x,int y);
	
	@Override
	public abstract String toString();

	
	
	
}
