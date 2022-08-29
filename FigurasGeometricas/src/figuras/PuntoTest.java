package figuras;

import static org.junit.Assert.*;

import org.junit.Test;

public class PuntoTest {

	@Test
	public void xTest() {
		Punto puntito = new Punto(2,3);
		double esperado = 2;
		double obtenido = puntito.getX();
		assertEquals(esperado, obtenido, 0);
	}
	
	@Test
	public void yTest() {
		Punto puntito = new Punto(2,3);
		double esperado = 3;
		double obtenido = puntito.getY();
		assertEquals(esperado, obtenido, 0);
	}
	
	@Test
	public void distanciaAlOrigenTest() {
		Punto puntito = new Punto(3,4);
		double esperado = 5;
		double obtenido = puntito.getDistanciaAlOrigen();
		assertEquals(esperado, obtenido, 0);
	}
	
	@Test
	public void distanciaAOtroPuntoTest() {
		Punto puntito = new Punto(3,4);
		Punto otroPunto = new Punto(0,0);
		double esperado = 5;
		double obtenido = puntito.distanciaAotroPunto(otroPunto);
		assertEquals(esperado, obtenido, 0);
	}
	
	@Test
	public void toStringTest() {
		Punto unPunto = new Punto(-2, 9);
		System.out.println(unPunto);
	}
	
	
	

}
