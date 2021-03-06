package administracionBanco;

import java.util.Scanner;

public class Main {

	final static int MAXNUMEROCUENTA = 100;
	CuentaBanco cuentas[];
	int numCuentas;

	public static void main(String[] args) {
		Main main = new Main();

		main.inicializar();
		main.menu();

	}

	public void menu() {
		Scanner teclado = new Scanner(System.in);
		int opcion = 0;

		do {
			System.out.println("1.Crear una cuenta");
			System.out.println("2.Ver el estado de las cuentas");
			System.out.println("3.Hacer una operación sobre una cuenta ");
			System.out.println("0.Salir");
			opcion = teclado.nextInt();
			teclado.nextLine();

			switch (opcion) {
			case 1:
				crearCuenta();
				break;
			case 2:
				estadoCuenta();
				break;
			case 3:
				menuCuenta();
				break;

			default:
				break;
			}
			
		} while (opcion != 0);

		
	}

	public void inicializar() {
		cuentas = new CuentaBanco[MAXNUMEROCUENTA];
		numCuentas = 0;
	}

	public void crearCuenta() {
		Scanner teclado = new Scanner(System.in);

		int numeroCuenta = 0, saldo = 0;
		String titular;
		System.out.println("titular?");
		titular = teclado.nextLine();
		System.out.println("Saldo?");
		saldo = teclado.nextInt();
		teclado.nextLine();

		if (saldo <= 0) {
			System.err.println("Tiene que meter saldo!");
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return;
		}
		CuentaBanco cuenta = new CuentaBanco(numCuentas + 1, titular, saldo);
		cuentas[numCuentas] = cuenta;
		System.out.println("Tu numero de cuenta es "+ (numCuentas+1));
	}

	public void estadoCuenta() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Cual es tu numero de cuenta?");
		int numeroCuenta = teclado.nextInt();
		teclado.nextLine();

		System.out.println(cuentas[numeroCuenta - 1].toString());
	}

	public void menuCuenta() {
		Scanner teclado = new Scanner(System.in);
		int cuenta = 0, erantzuna = 0;

		System.out.println("Cual es tu numero de cuenta?");
		cuenta = teclado.nextInt();

		do {
			System.out.println("1-Ingresar una cantidad");
			System.out.println("2-Sacar una cantidad");
			System.out.println("3-Ver el saldo de la cuenta");
			System.out.println("4-Transferir una cantidad de una cuenta a otra");

			erantzuna = teclado.nextInt();
			switch (erantzuna) {
			case 1:
				ingresarCantidad(cuenta);
				break;
			case 2:
				extraerCantidad(cuenta);
				break;
			case 3:
				verSaldo(cuenta);
				break;
			case 4:
				transferir(cuenta);
				break;

			default:
				break;
			}
			
		} while (erantzuna != 0);

		

	}

	public void ingresarCantidad(int cuenta) {
		Scanner teclado = new Scanner(System.in);
		int cantidad = 0;
		
		System.out.println("Cuanto dinero quiere ingrasar?");
		cantidad = teclado.nextInt();
		
		cuentas[(cuenta-1)].setSaldo(cuentas[cuenta-1].getSaldo() + cantidad);
	}

	public boolean extraerCantidad(int cuenta) {
		Scanner teclado = new Scanner(System.in);
		int cantidad = 0;
		
		System.out.println("Cuanto dinero quiere extraer?");
		cantidad = teclado.nextInt();
		
		
		if(cuentas[cuenta-1].getSaldo()> cantidad){
			cuentas[(cuenta-1)].setSaldo(cuentas[cuenta-1].getSaldo() - cantidad);
			return true;
		}
		else{
			System.err.println("Dinero insuficiente");
			return false;
		}
	}

	public void verSaldo(int cuenta) {
		System.out.println(cuentas[cuenta-1].getSaldo());
	}

	public void transferir(int cuenta) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Cuenta a la que quieres transferir?");
		int cuentaObjetivo = teclado.nextInt();
		teclado.nextLine();
		if(extraerCantidad(cuentaObjetivo)){
			ingresarCantidad(cuenta);
		}
	}
}
