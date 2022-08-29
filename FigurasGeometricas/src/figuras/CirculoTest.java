package figuras;

import static org.junit.Assert.*;

import org.junit.Test;

public class CirculoTest {

	@Test
	public void obtenerRadioTest() {
		Circulo circulito = new Circulo(2);
		System.out.println(circulito);
		double esperado = 2.0;
		double obtenido = circulito.getRadio();
		assertEquals(esperado, obtenido, 0.001);
	}
	@Test
	public void obtenerDiametroTest() {
		Circulo circulito = new Circulo(3);
		System.out.println(circulito);
		double esperado = 6;
		double obtenido = circulito.getDiametro();
		assertEquals(esperado, obtenido, 0.001);
	}

}
