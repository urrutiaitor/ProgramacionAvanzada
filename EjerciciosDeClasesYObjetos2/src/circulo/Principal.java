package circulo;

import java.util.Random;

public class Principal {
	final int NUMERO_DE_PIEZAS = 10;
	private Random r;
	private Forma formas[];
	private int x, y;

	public Principal() {
		x = 50;
		y = 50;
		formas = new Forma[10];
		r = new Random();

	}

	private void disparar() {

		int colisiones = 0;
		int vx = 10, vy = 15;
		int puntos = 0;
		System.out.println("Proyectil (" + x + "," + y + ")");
		while (colisiones < 10) {

			for (int i = 0; i < formas.length; i++) {
				if (!formas[i].isDestruido() && formas[i].colisiona(x, y)) {
					formas[i].setDestruido(true);
					puntos += formas[i].getPuntos();
					colisiones = 0;
					System.out.println("Se ha destruido " + formas[i]);
					break;
				}
			}

			if (x + vx > 100) {
				vx = -vx;
				x = vx+(200-x) ;
				colisiones++;
				System.out.print(">");
			} else if (x + vx< 0) {
				vx = -vx;
				x = vx-x ;
				colisiones++;
				System.out.print(">");
			} else
				x += vx;
			if (y + vy> 100) {
				vy = -vy;
				y = vy+(200-y) ;
				colisiones++;
				System.out.print(">");
			} else if (y + vy< 0) {
				vy = -vy;
				y = vy-y ;
				colisiones++;
				System.out.print(">");
			}else
				y += vy;
			System.out.println("Proyectil (" + x + "," + y + ")");
		}
		System.out.println("Puntos " + puntos);

	}

	private void creaFormas() {

		for (int i = 0; i < formas.length; i++) {
			if (r.nextBoolean())
				formas[i] = new Circulo(r.nextInt(100), r.nextInt(100), r.nextInt(30), r.nextInt(100));
			else {
				formas[i] = new Cuadrado(r.nextInt(100), r.nextInt(100), r.nextInt(30), r.nextInt(100));
			}
		}
		for (Forma i : formas) {
			System.out.println(i);
		}

	}

	public static void main(String[] args) {
		Principal a = new Principal();
		a.creaFormas();
		a.disparar();
	}
}
