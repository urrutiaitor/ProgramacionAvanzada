package Buscaminas;

public class Casilla {

	boolean mina;
	int posicionX;
	int posicionY;
		
	
	public Casilla(boolean mina, int posicionX, int posicionY) {
		super();
		this.mina = mina;
		this.posicionX = posicionX;
		this.posicionY = posicionY;
	}
	
	
	public boolean isMina() {
		return mina;
	}
	public void setMina(boolean mina) {
		this.mina = mina;
	}
	public int getPosicionX() {
		return posicionX;
	}
	public void setPosicionX(int posicionX) {
		this.posicionX = posicionX;
	}
	public int getPosicionY() {
		return posicionY;
	}
	public void setPosicionY(int posicionY) {
		this.posicionY = posicionY;
	}
	
	@Override
	public String toString() {
		return "Casilla [mina=" + mina + ", posicionX=" + posicionX
				+ ", posicionY=" + posicionY + "]";
	}
	
	
}

