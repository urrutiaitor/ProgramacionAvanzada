package laPorra;

public abstract class Jugador {
	int piezas;
	int apuesta;
	
	public int getApuesta() {
		return apuesta;
	}
	public int getPiezas() {
		return piezas;
	}

	public Jugador(int piezas, int apuesta) {
		super();
		this.piezas = piezas;
		this.apuesta = apuesta;
	}
	public abstract void realizarJugada();
}
