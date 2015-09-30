package bonolotoKuadrila;

public class Bonoloto {

	int numeros[];
	int aciertos;

	public Bonoloto(int[] numeros) {
		super();
		this.numeros = numeros;
	}

	public int[] getNumeros() {
		return numeros;
	}

	public void setNumeros(int[] numeros) {
		this.numeros = numeros;
	}

	public int getAciertos() {
		return aciertos;
	}

	public void setAciertos(int aciertos) {
		this.aciertos = aciertos;
	}

	@Override
	public String toString() {
		return "Bonoloto [aciertos=" + aciertos + "]";
	}

	public void comparar(Bonoloto ganador) {
		int numerosAcertados = 0;

		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < ganador.getNumeros().length; j++) {
				if (numeros[i] == ganador.getNumeros()[j]) {
					numerosAcertados++;
				}

			}
		}
		this.aciertos = numerosAcertados;
	}

}
