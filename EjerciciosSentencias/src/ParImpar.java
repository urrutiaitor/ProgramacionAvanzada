
import java.util.Scanner;

public class ParImpar {
	
	Scanner teclado;
	
	public boolean esImpar(int valor){
		return(valor%2 != 0);
	}
	
	public void miMain(){
		int valor;
		teclado = new Scanner(System.in);
		System.out.println("Introduce un entero:");
		valor =  teclado.nextInt();
		
		if(esImpar(valor)){
			System.out.println("El valor "+valor+" es impar");
		}else{
			System.out.println("El valor "+valor+" es par");
		}
	}

	public static void main(String[] args) {
	ParImpar ejercicio = new ParImpar();
	ejercicio.miMain();
	}

}
