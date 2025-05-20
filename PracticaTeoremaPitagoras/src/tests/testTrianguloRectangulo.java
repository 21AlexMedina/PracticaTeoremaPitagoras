package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import clases.TrianguloRectangulo;

class testTrianguloRectangulo {

	static TrianguloRectangulo t1;

	@BeforeAll
	static void setup() {
		t1 = new TrianguloRectangulo();
	}

	@Test
	void testAreaDefecto() {

		double resultadoObtenido = t1.area();
		double resultadoEsperado = 0.5;

		assertEquals(resultadoObtenido, resultadoEsperado);
	}

	@Test
	void testHipotenusaDefecto() {
		double resultadoObtenido = t1.hipotenusa();
		double resultadoEsperado = 1.414213;

		assertEquals(resultadoObtenido, resultadoEsperado,0.01);
	}

	@Test
	void testPerimetroDefecto() {
		double resultadoObtenido = t1.perimetro();
		double resultadoEsperado = 3.414213562373095;

		assertEquals(resultadoObtenido, resultadoEsperado);
	}

	@Test
	void testArea() {
		TrianguloRectangulo t2 = new TrianguloRectangulo(2, 4);
		double resultadoObtenido = t2.area();
		double resultadoEsperado = 4;

		assertEquals(resultadoObtenido, resultadoEsperado);
	}

	@Test
	void testHipotenusa() {
		TrianguloRectangulo t2 = new TrianguloRectangulo(2, 4);
		double resultadoObtenido = t2.hipotenusa();
		double resultadoEsperado = 4.47213595499958;

		assertEquals(resultadoObtenido, resultadoEsperado);
	}
    @Test
	void testPerimetro() {
    	TrianguloRectangulo t2 = new TrianguloRectangulo(2, 4);
		double resultadoObtenido = t2.perimetro();
		double resultadoEsperado = 10.47213595499958;

		assertEquals(resultadoObtenido, resultadoEsperado);
	}
	
	@Test
	void testExcepcion() {
		Exception E = assertThrows(IllegalArgumentException.class,() -> new TrianguloRectangulo(-1,-4) );
		String mensajeEsperado = "Los catetos no pueden ser negativos";
		String mensajeObtenido = E.getMessage();
		assertEquals(mensajeObtenido, mensajeEsperado);
	}

}

