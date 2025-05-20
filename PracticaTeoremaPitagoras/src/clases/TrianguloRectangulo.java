package clases;

public class TrianguloRectangulo {
	double catetoA;
	double catetoB;
	double hipotenusa;

	public TrianguloRectangulo(int catetoA, int catetoB) throws IllegalArgumentException {
		if (catetoA <= 0 || catetoB <= 0) {
			throw new IllegalArgumentException("Los catetos no pueden ser negativos");
		}
		this.catetoA = catetoA;
		this.catetoB = catetoB;
		hipotenusa = hipotenusa();
	}

	public TrianguloRectangulo() {
		this.catetoA = 1;
		this.catetoB = 1;
	}

	public double area() {
		double area = (this.catetoA * this.catetoB) / 2.0;
		return area;
	}

	public double hipotenusa() {
		double hipotenusa = Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));
		return hipotenusa;
	}

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
