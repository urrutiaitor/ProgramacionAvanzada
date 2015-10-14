package JuegoElfosOrcos;

public abstract class Artefacto {

	int vidas;
	String nombre;
	
	public Artefacto(int vidas, String nombre) {
		super();
		this.vidas = vidas;
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Artefacto [vidas=" + vidas + ", nombre=" + nombre + "]";
	}
	
	abstract public void accion(Criatura criaturaObjetivo);
	
}
