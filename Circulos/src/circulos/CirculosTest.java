package circulos;

import static org.junit.Assert.*;

import org.junit.Test;

public class CirculosTest {
	Punto centro = new Punto(0,0);

	@Test
	public void creoUnCirculoTest() {
		Circulo circulito = new Circulo(2,centro);
		assertNotNull(circulito);
	}
	
	@Test(expected=Error.class)
	public void creoUnCirculoConRadioNegativoTest() {
		Circulo circulito = new Circulo(-2, centro);
	}
	
	@Test
	public void obtenerDiametroTest() {
		Circulo circulito = new Circulo(2, centro);
		double esperado = 4;
		double obtenido = circulito.obtenerDiametro();
		assertEquals(esperado, obtenido, 0);
	}
	
	@Test
	public void obtenerRadioTest() {
		Circulo circulito = new Circulo(2, centro);
		double esperado = 2;
		double obtenido = circulito.obtenerRadio();
		assertEquals(esperado, obtenido, 0);
	}
	@Test
	public void obtenerRadioConDecimalesTest() {
		Circulo circulito = new Circulo(2E-3, centro);
		double esperado = 2E-3;
		double obtenido = circulito.obtenerRadio();
		assertEquals(esperado, obtenido, 0);
	}
	
	@Test
	public void obtenerPerimetroTest() {
		Circulo circulito = new Circulo(1, centro);
		double esperado = 2 * Math.PI;
		double obtenido = circulito.obtenerPerimetro();
		assertEquals(esperado, obtenido, 0);
	}
	
	@Test
	public void cambiarPerimetroTest() {
		Circulo circulito = new Circulo(3, centro);
		circulito.cambiarPerimetro(2 * Math.PI);
		double esperado = 2;
		double obtenido = circulito.obtenerDiametro();
		assertEquals(esperado, obtenido, 0);
	}
	@Test
	public void circulosConcentricosTest() {
		Circulo c1 = new Circulo(3, new Punto(0,0));
		Circulo c2 = new Circulo(6, new Punto(0,0));
		assertTrue(c1.intersectaCon(c2));
	}
	
	@Test
	public void circulosConcentricosCoincidentesTest() {
		Circulo c1 = new Circulo(3, new Punto(0,0));
		Circulo c2 = new Circulo(3, new Punto(0,0));
		assertTrue(c1.intersectaCon(c2));
	}
	
	@Test
	public void circulosMuyDistantesTest() {
		Circulo c1 = new Circulo(3, new Punto(0,0));
		Circulo c2 = new Circulo(3, new Punto(10,10));
		assertFalse(c1.intersectaCon(c2));
	}
	
	@Test
	public void circuloscentrosAlineadosTest() {
		Circulo c1 = new Circulo(3, new Punto(0,0));
		Circulo c2 = new Circulo(4, new Punto(0,7));
		assertTrue(c1.intersectaCon(c2));
	}
}