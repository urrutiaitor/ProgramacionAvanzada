package bonolotoKuadrila;

import java.util.Scanner;

public class Princial {
	
	public int[] leer(){
		Scanner teclado = new Scanner(System.in);
		int numeros[] = new int [6];
		System.out.println("Introduze tu bonoloto: (N N N N N N)");
		for(int i = 0; i <6 ; i++){
			numeros[i] = teclado.nextInt();	
		}
		teclado.nextLine();
		return numeros;		
	}
	
	public void comparar(Bonoloto bonolotos[] , Bonoloto ganador){
		for(int i = 0; i < bonolotos.length; i++){
			bonolotos[i].comparar(ganador);		
		}
	}
	public void visualizarAciertos(Bonoloto bonolotos[]){
		for(int i = 0 ; i < bonolotos.length ; i++){
			System.out.println((i+1)+".- "+bonolotos[i].toString());
		}
	}
	
	public static void main(String[] args) {
		Princial ejercicio = new Princial();
		ejercicio.miMain();
	}

	private void miMain() {
		Bonoloto bonolotos[] = new Bonoloto[10];
		Bonoloto ganador = new Bonoloto(this.leer());
		
		for (int i = 0 ;  i < 10 ; i++){
			bonolotos[i] = new Bonoloto(this.leer());
		}
		comparar(bonolotos, ganador );
		visualizarAciertos(bonolotos);
	}

}
