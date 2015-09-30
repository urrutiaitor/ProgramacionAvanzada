package agendaDeTelefonos;

import java.util.Scanner;

public class Main {

	Contacto contactos[];
	int nContacto = 0;

	public static void main(String[] args) {
		Main ejercicio = new Main();
		ejercicio.menu();

	}

	public void menu() {
		Scanner teclado = new Scanner(System.in);
		contactos = new Contacto[50];

		int opcion = 0;

		do {
			System.out.println("1-.Introducir un telefono:");
			System.out.println("2-.Buscar telefono");
			System.out.println("0-.Salir");

			opcion = teclado.nextInt();
			teclado.nextLine();

			switch (opcion) {
			case 1:
				introducirContacto();
				break;
			case 2:
				buscarContacto();
				break;

			default:
				break;
			}

		} while (opcion != 0);
	}

	private void introducirContacto() {
		Scanner teclado = new Scanner(System.in);
		Contacto contacto;

		if (nContacto < 50) {
			System.out.println("Nombre del contacto?");
			String nombre = teclado.nextLine();
			System.out.println("Numero de telefono?");
			long numero = teclado.nextInt();

			contacto = new Contacto(numero, nombre);
			contactos[nContacto] = contacto;
			nContacto++;
		}
	}

	private void buscarContacto() {
		Scanner teclado  = new Scanner(System.in);
		
		System.out.println("Introduce el nombre que quieres buscar");
		String nombre = teclado.nextLine();
				
		for(int i = 0 ; i< nContacto ; i++){
			if(contactos[i].comprobar(nombre)){
				System.out.println( contactos[i].toString());
			}
		}
	}
}
