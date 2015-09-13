

public class SumaNumerosParesUnoDiez {

	public boolean esPar(int i){
		return(i%2 == 0);
	}
	
	public void miMain(){
		int suma = 0;
		for(int i = 0 ; i <= 10 ; i++){
			if(esPar(i)){
			
				suma = suma + i;
			
			}
		}
		System.out.println("La suma de todos los pares es "+suma+".");
	}
	
	public static void main(String[] args) {
		SumaNumerosParesUnoDiez ejercicio = new SumaNumerosParesUnoDiez();
		ejercicio.miMain();
	}

}
