package FigurasGeometricas;

import java.util.Comparator;

public class MiComparadorPosicion implements Comparator<Figuras>{

	@Override
	public int compare(Figuras f1, Figuras f2) {
		
		return Integer.compare((f1.getX()+f1.getY()), (f2.getX()+f2.getY()));
	}

}
