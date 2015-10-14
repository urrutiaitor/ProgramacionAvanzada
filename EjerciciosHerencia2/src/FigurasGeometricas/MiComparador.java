package FigurasGeometricas;

import java.util.Comparator;

public class MiComparador implements Comparator<Figuras>{

	@Override
	public int compare(Figuras f1, Figuras f2) {
	
		return Integer.compare(f1.getArea(), f2.getArea());
	}

}
