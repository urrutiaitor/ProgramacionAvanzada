package Buscaminas;

import java.util.Random;
import java.util.Scanner;

public class Main {

	Casilla matriz[][];
	final static int MAX = 10;
	final static int NUMEROMINAS = 10;

	public static void main(String[] args) {
		Main ejercicio = new Main();
		ejercicio.miMain();
	}

	private void miMain() {
		matriz = new Casilla[MAX][MAX];
		Random random = new Random();

		for (int i = 0; i < MAX; i++) {
			for (int j = 0; j < MAX; j++) {
				matriz[i][j] = new Casilla(false, i, j);
			}
		}
		for (int i = 0; i < NUMEROMINAS; i++) {
			matriz[random.nextInt(MAX)][random.nextInt(MAX)].setMina(true);
		}
		pedir();
	}

	private void pedir() {
		Scanner teclado = new Scanner(System.in);
		int posX;
		int posY;
		String mina;
		String opcion = null;
		int nMinas;

		do {
			System.out.println("Introduce casilla (x y (s/n):");
			posX = teclado.nextInt();
			posY = teclado.nextInt();
			mina = teclado.nextLine();

			if (matriz[posX][posY].isMina() == true) {
				System.out.println("La mina exploto!");
				break;
			} else {
				nMinas = numerosMinasAlrededor(posX, posY);
				System.out.println("posX: "+posX+" posY: "+posY+" minas "+ nMinas);
				}

			System.out.println("Quieres seguir? s/n");
			opcion = teclado.nextLine();
		} while (opcion.toLowerCase().equals("s"));

	}

	public int numerosMinasAlrededor(int posX, int posY) {
		int contador = 0;

		if (posX != 0) {
			if (matriz[(posX - 1)][posY].isMina() == true) {
				contador++;
			}
			if (posY != 0) {
				if (matriz[posX - 1][posY - 1].isMina() == true) {
					contador++;
				}

			} else if (posX != 9) {
				if (matriz[posX - 1][posY + 1].isMina() == true) {
					contador++;
				}

			} else {
				if (matriz[posX][posY + 1].isMina() == true) {
					contador++;
				}
				if (matriz[posX][posY - 1].isMina() == true) {
					contador++;
				}
			}

		} else if (posX != 9) {

			if (matriz[posX+1][posY].isMina() == true) {
				contador++;
			} 
			if (posY != 0) {
				if (matriz[posX+1][posY-1].isMina() == true) {
					contador++;
				} 
			} else if(posY !=9){
				if (matriz[posX+1][posY+1].isMina() == true) {
					contador++;
				} 
			}
		}

		return contador;
	}
}
