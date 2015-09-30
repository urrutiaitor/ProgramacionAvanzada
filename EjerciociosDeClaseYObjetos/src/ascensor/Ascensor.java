package ascensor;
public class Ascensor {
	int piso;
	String nombre;
	boolean abrirPuerta;
	
	public Ascensor(int piso, String nombre, boolean abrirPuerta){
		this.piso = piso;
		this.nombre = nombre;
		this.abrirPuerta = abrirPuerta;
	}

	public int getFloor() {
		return piso;
	}

	public void setFloor(int piso) {
		if(this.abrirPuerta == true){
			System.out.println("Closing door");
			this.abrirPuerta = false;
		}
		
	
		while(piso!= this.piso){
			if(this.piso<piso){
				this.piso++;
			}
			else{
				this.piso--;
			}
			System.out.println(this.nombre+": floor "+this.piso);
			
			try {
			    Thread.sleep(1000);
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}
			
		}
		
		if(this.abrirPuerta == false){
			System.out.println("Opening door");
			this.abrirPuerta = true;
		}
		
		
	}
	
	public int distance(int floor){
		int distance = 0;
		
		distance = floor - this.piso;
		
		if(distance<0){
			distance = distance * (-1);
		}
		
		return distance;
	}
}
