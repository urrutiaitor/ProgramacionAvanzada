package ejercicioTorre;

import java.util.Scanner;

public class Main {
	
	Torre torre;

	public static void main(String[] args) {
		
		Main ejercicio = new Main();
		ejercicio.menu();

	}
	
	public void menu(){
		Scanner teclado = new Scanner (System.in);
		int opcion = 1;
		Torre torre = new Torre();
		
		do{
			System.out.println("Elija una opcion: ");
			System.out.println("1. Ver coordenadas torre");
			System.out.println("2. Mover torre");
			System.out.println("0. Salir");
			opcion = teclado.nextInt(); teclado.nextLine();
			
			switch(opcion){
			case 1: torre.get();
				break;
			case 2:torre.set();
				break;
			}
			
		}while(opcion!=0);
		
	}

}
