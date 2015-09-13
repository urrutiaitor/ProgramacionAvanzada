

import java.util.Scanner;

public class DiezNumerosNoRepetidos {
	
	int numeros[];
	
	public void leer(){
		Scanner teclado;
		teclado  = new Scanner(System.in);
		int numero=0;
		
		System.out.println("Escribir diez enteros");
		for(int i = 0; i < 10; i++){
			do{
				System.out.println((i + 1) + ".- ");
				numero = teclado.nextInt();
			} while (comprobarNumero(numero, i) == true);
			numeros[i] = numero;
			
		}
	}
	
	private boolean comprobarNumero(int numero, int posicion) {
		for(int i = 0; i < posicion ; i++){
			if(numeros[i] == numero){
				System.out.println("Numero repetido");
				return true;
			}
		}
		return false;
	}

	public void miMain(){
		this.numeros = new int[10];
		
		leer();
	}

	public static void main(String[] args) {
		DiezNumerosNoRepetidos ejercicio = new DiezNumerosNoRepetidos();
		ejercicio.miMain();
	}

}
