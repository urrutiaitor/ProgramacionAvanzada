package cuantosMinutos;

import java.util.Scanner;

public class Hora {

	int hora1;
	int min1;
	int hora2;
	int min2;
	
	public void leer(){
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		System.out.println("Introduce la primera hora (hh mm)");
		hora1 = teclado.nextInt();
		min1 = teclado.nextInt();
		teclado.nextLine();
		
		System.out.println("Introduce la segunda hora (hh mm)");
		hora2 = teclado.nextInt();
		min2 = teclado.nextInt();
		teclado.nextLine();
		
	}
	public int calcular(){
		int minutos = 0;
		int minutos2 = 0;
		int total = 0;
		
		minutos = min1 + (hora1*60);
		minutos2 = min2 + (hora2*60);
		total = minutos - minutos2;
				
		return Math.abs(total);
	}
	
	public void miMain(){
		
		int total = 0;
		
		leer();
		total = calcular();
		
		System.out.println(total+" minutos");		
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hora ejercicio = new Hora();
		ejercicio.miMain();
	}

}
