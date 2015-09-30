package ejercicioHora;

public class Hora {

	int hora = 0;
	int minutos = 0;
	
	
	public Hora(int hora, int minutos) {
		super();
		this.hora = hora;
		this.minutos = minutos;
	}

	public int compararDosHoras(Hora hora){
		if(this.hora < hora.hora){
			return -1;
		}
		if(this.hora == hora.hora){
			if(this.minutos < hora.minutos){
				return -1;
			}
			if(this.minutos == hora.minutos){
				return 0;
			}
			if(this.minutos > hora.minutos){
				return 1;
			}
		}
		return 1;
	}

	@Override
	public String toString() {
		return "Hora [hora=" + hora + ", minutos=" + minutos + "]";
	}

	
	
	
	
}
