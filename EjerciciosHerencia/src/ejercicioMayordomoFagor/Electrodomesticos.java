package ejercicioMayordomoFagor;

public abstract class Electrodomesticos {
	protected boolean encendido = false;
	
	public abstract String toString();

	public boolean isEncendido() {
		return encendido;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}
	

}
