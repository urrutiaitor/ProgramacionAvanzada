

import java.util.Scanner;


public class DiezNumerosEnteros {
	
	int numeros[];
	
	public void leer(){
		Scanner teclado;
		teclado = new Scanner(System.in);
		System.out.println("Introduce 10 enteros");
		for (int i = 0; i < 10; i++){
			numeros [i] = teclado.nextInt();
		}
		//System.out.println("nana");
	}
	
	public void escribir(){
		for (int i = 9 ; i >= 0 ; i--){
			//System.out.println(i);
			System.out.println(numeros[i]);
		}
	}
	
	
	public void miMain(){
		
		this.numeros= new int[10];
		leer();
		escribir();
	}
	public static void main(String[] args) {
		DiezNumerosEnteros ejercicio = new DiezNumerosEnteros();
		ejercicio.miMain();

	}

}
