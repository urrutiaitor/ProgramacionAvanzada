package muertosYHeridos;

import java.util.Scanner;

public class Principal {

	static void insertarNumero1(){
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		int numero1 = 0;
		
		System.out.println("Mete un numero de cuatro cifras");
		numero1 = teclado.nextInt();
	}
	
	static void insertarNumero2(){
		Scanner teclado;
		teclado = new Scanner(System.in);
		int numero2 = 0;
		
		System.out.println("Mete un numero de cuatro cifras");
		numero2 = teclado.nextInt();
	}
	
	public static void main(String[] args){
	insertarNumero1();
	insertarNumero2();
	
	}

}
