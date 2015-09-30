package Concesionario;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main main = new Main();
		main.miMain();
	}

	private void miMain() {
		Scanner teclado;
		teclado = new Scanner(System.in);

		int puertasCoche = 0;
		int ruedasCoche = 0;

		do {
			System.out.println("Cuantas puertas tiene su vehiculo?");
			puertasCoche = teclado.nextInt();
		} while (puertasCoche <= 1);

		Puertas puertas[] = new Puertas[puertasCoche];
		for (int i = 0; i < puertasCoche; i++) {
			puertas[i] = new Puertas();
		}

		do {
			System.out.println("Cuantas ruedas tiene su coche?");
			ruedasCoche = teclado.nextInt();
		} while (ruedasCoche <= 1);

		Ruedas ruedas[] = new Ruedas[ruedasCoche];
		for(int i = 0 ; i < ruedasCoche ; i++){
			ruedas[i] = new Ruedas();
		}
	}

}
