package app;

import clases.TrianguloRectangulo;

public class Principal {

	public static void main(String[] args) {
		TrianguloRectangulo t1 = new TrianguloRectangulo(3, 1);
		TrianguloRectangulo t2 = new TrianguloRectangulo();

		double t1area = t1.area();
		double t1perimetro = t1.perimetro();
		double t2area = t2.area();
		double t2perimetro = t2.perimetro();

	}

}
