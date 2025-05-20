package clases;

public class TrianguloRectangulo {
double catetoA;
double catetoB;
double hipotenusa; 



public TrianguloRectangulo(int a, int b) throws IllegalArgumentException {
	if (a <= 0 || b <= 0) {
		throw new IllegalArgumentException("Los catetos no pueden ser negativos");
	}
	this.catetoA = catetoA;
	this.catetoB = catetoB;
	hipotenusa=hipotenusa();
}

public TrianguloRectangulo() {
	this.catetoA=1;
	this.catetoB=1;
}




}
