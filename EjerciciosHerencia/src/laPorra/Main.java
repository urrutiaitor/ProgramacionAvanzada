package laPorra;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main ejercicio = new Main();
		ejercicio.menu();
	}

	private void menu() {
		Scanner teclado = new Scanner(System.in);
		int opcion = -1;

		while (opcion != 0) {
			System.out.println("***Como quiere jugar?***");
			System.out.println("1-Humano VS Maquina");
			System.out.println("2-.Humano VS Humano");
			System.out.println("0-Salir");

			opcion = teclado.nextInt();
			teclado.nextLine();

			switch (opcion) {
			case 1:
				humVMaq();
				break;
			case 2:
				humVHum();
				break;

			default:
				break;
			}
		}
	}

	private void humVHum() {
		Scanner teclado = new Scanner(System.in);
		int ganador;
		
		System.out.println("Mete numero de piezas?");
		int piezas = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Cuantas piezas crees que hay en total?");
		int apuesta = teclado.nextInt();
		teclado.nextLine();
		Humano humano1 = new Humano(piezas, apuesta);
		
		System.out.println("Mete numero de piezas?");
		int piezas2 = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Cuantas piezas crees que hay en total?");
		int apuesta2 = teclado.nextInt();
		teclado.nextLine();
		Humano humano2 = new Humano(piezas2, apuesta2);
		
		ganador = jugar(humano1, humano2);
		
		if(ganador ==1){
			System.out.println("Humano1 ganador");
		}else if(ganador == 2){
			System.out.println("Humano2 ganador");
		}else{
			System.out.println("Habeis empatado");
		}
	}

	private void humVMaq() {
		Scanner teclado = new Scanner(System.in);
		int ganador;
		
		System.out.println("Mete numero de piezas?");
		int piezas = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Cuantas piezas crees que hay en total?");
		int apuesta = teclado.nextInt();
		teclado.nextLine();
		Humano humano1 = new Humano(piezas, apuesta);
		
		Random ran = new Random();
		int piezas2 = ran.nextInt(3);
		int apuesta2 = piezas2 + ran.nextInt(3);
		Maquina maquina = new Maquina(piezas2, apuesta2);
		
		ganador = jugar(humano1, maquina);
		
		if(ganador ==1){
			System.out.println("Humano1 ganador");
		}else if(ganador == 2){
			System.out.println("Humano2 ganador");
		}else if(ganador ==3){
			System.out.println("Habeis acertado los dos");
		}else{
			System.out.println("Habeis fallado los dos");
		}
	}
	
	private int jugar(Jugador jugador1, Jugador jugador2){
		int suma = jugador1.getPiezas()+jugador2.getPiezas();
		
		if(suma == jugador1.getApuesta() && suma == jugador2.getApuesta()){
			return 3;
		}
		if(suma == jugador1.getApuesta()){
			return 1;
		}
		if(suma == jugador2.getApuesta()){
			return 2;
		}
		return 4;
	}

}
