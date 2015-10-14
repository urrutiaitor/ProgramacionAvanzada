package FigurasGeometricas;

import java.util.Comparator;

public class Figuras {

	int area;
	int x;
	int y;
	
	
	public Figuras(int area, int x, int y) {
		super();
		this.area = area;
		this.x = x;
		this.y = y;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Figuras [area=" + area + ", x=" + x + ", y=" + y + "]";
	}
	
}
