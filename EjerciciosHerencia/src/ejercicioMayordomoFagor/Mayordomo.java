package ejercicioMayordomoFagor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class Mayordomo {

	ArrayList<Electrodomesticos> electrodomesticos;

	public static void main(String[] args) {
		Mayordomo ejercicio = new Mayordomo();
		ejercicio.electrodomesticos = new ArrayList<>();
		ejercicio.menu();
	}

	public void menu() {
		Scanner teclado = new Scanner(System.in);
		int opcion = -1;
		while (opcion != 0) {
			System.out.println("***Que quieres hacer?***");
			System.out.println("1-.Dar de alta un electrodomestico");
			System.out.println("2-.Ver los electrodomesticos y su estado");
			System.out.println("3-Poner en marcha/parar electrodomestico");
			System.out.println("0-.Salir");

			opcion = teclado.nextInt();
			teclado.nextLine();

			switch (opcion) {
			case 1:
				altaElectrodomestico();
				break;
			case 2:
				verElectrodomestico();
				break;
			case 3:
				ponerMarchaParar();
				break;

			default:
				break;
			}
		}
	}

	private void altaElectrodomestico() {
		menuElectrodomestico();
	}

	public void menuElectrodomestico() {
		Scanner teclado = new Scanner(System.in);
		int opcion = 0;

		System.out.println("***Que electrodomestico quiere dar de alta?***");
		System.out.println("1-.Horno");
		System.out.println("2-.Lavadora");
		System.out.println("3-.Microondas");
		System.out.println("0-.Salir");

		opcion = teclado.nextInt();
		teclado.nextLine();

		switch (opcion) {
		case 1:
			Horno horno = new Horno();
			electrodomesticos.add(horno);
			break;
		case 2:
			Lavadora lavadora = new Lavadora();
			electrodomesticos.add(lavadora);
			break;
		case 3:
			Microondas microondas = new Microondas();
			electrodomesticos.add(microondas);
			break;

		default:
			break;
		}
	}

	private void verElectrodomestico() {
		int kont = 1;
		ListIterator<Electrodomesticos> it;
		it = electrodomesticos.listIterator();
		while (it.hasNext()) {
			System.out.println((kont++) + " " + it.next().toString());
		}

	}

	private void ponerMarchaParar() {
		Scanner teclado = new Scanner(System.in);
		int opcion = 0;

		System.out
				.println("****Que electrodomestico quiere poner en marcha/apagar?****");
		verElectrodomestico();

		opcion = teclado.nextInt();
		teclado.nextLine();

		if (electrodomesticos.get(opcion - 1).isEncendido()) {
			System.out
					.println("El electrodomestico esta encendido, quiere apagarlo?(S N)");
			if ("S".compareTo(teclado.nextLine().toUpperCase()) == 0) {
				electrodomesticos.get(opcion - 1).setEncendido(false);
			}
		} else {
			System.out
					.println("El electrodomestico esta apagado, quiere encenderlo?(S N)");
			if ("S".compareTo(teclado.nextLine().toUpperCase()) == 0) {
				electrodomesticos.get(opcion - 1).setEncendido(true);
			}
		}

	}

}
