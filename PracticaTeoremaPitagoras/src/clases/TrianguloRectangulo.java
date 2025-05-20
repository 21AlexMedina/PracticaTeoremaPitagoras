package clases;

public class TrianguloRectangulo {
	double catetoA;
	double catetoB;
	double hipotenusa;

	/**
	 * Este constructor recibe los valores de los catetos
	 * 
	 * @param Recibe el cateto A
	 * @param Recibe el cateto B
	 * @throws IllegalArgumentException Controla que los catetos no esten por debajo
	 *                                  de cero
	 */
	public TrianguloRectangulo(int catetoA, int catetoB) throws IllegalArgumentException {
		if (catetoA <= 0 || catetoB <= 0) {
			throw new IllegalArgumentException("Los catetos no pueden ser negativos");
		}
		this.catetoA = catetoA;
		this.catetoB = catetoB;
		hipotenusa = hipotenusa();
	}

	/**
	 * Constructor para crear un triangulo por defeto a 1.
	 */
	public TrianguloRectangulo() {
		this.catetoA = 1;
		this.catetoB = 1;
	}

	/**
	 * Funcion que calcula y devuelve el area del trianguloRectangulo
	 * 
	 * @return El area
	 */

	public double area() {
		double area = (this.catetoA * this.catetoB) / 2.0;
		return area;
	}

	/**
	 * Funcion que calcula la hipotenusa y devuelve el resultado
	 * 
	 * @return La hipotenusa
	 */

	public double hipotenusa() {
		double hipotenusa = Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));
		return hipotenusa;
	}

	/**
	 * Funcion que calcula el perimetro sumando catetos e hipotenusa
	 * 
	 * @return El perimetro
	 */
	public double perimetro() {
		double perimetro = catetoA + catetoB + hipotenusa();
		return perimetro;
	}

	public double getcatetoA() {
		return this.catetoA;
	}

	public double getcatetoB() {
		return this.catetoB;
	}

	public double getHipotenusa() {
		return hipotenusa;
	}

	@Override
	public String toString() {
		String mensaje;
		mensaje = "El cateto A es " + this.catetoA + " ,el cateto b es " + this.catetoB + " y la hipotenusa es "
				+ hipotenusa;
		return mensaje;
	}
}
