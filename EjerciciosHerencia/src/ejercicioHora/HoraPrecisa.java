package ejercicioHora;

public class HoraPrecisa extends Hora {

	int segundos = 0;
	
	public HoraPrecisa(int hora, int minutos, int segundos) {
		super(hora, minutos);
		this.segundos = segundos;
	}

	@Override
	public String toString() {
		return "HoraPrecisa [segundos=" + segundos + ", hora=" + hora
				+ ", minutos=" + minutos + "]";
	}
	
	

}
