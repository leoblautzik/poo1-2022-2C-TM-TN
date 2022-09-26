package appGeometria;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppGeometriaTest {

	@Test
	public void moverCirculoTest() {
		Circulo c1 = new Circulo(2, new Punto(0,0));
		c1.desplazar(3, 2);
		Punto esperado = new Punto(3,2);
		Punto obtenido = c1.getCentro();
		
		assertEquals(esperado, obtenido);
	}
	
	@Test
	public void moverCuadradoTest() {
		Cuadrado c1 = new Cuadrado(2, new Punto(0,0));
		c1.desplazar(3, 2);
		Punto esperado = new Punto(3,2);
		Punto obtenido = c1.getInferiorIzquierdo();
		
		assertEquals(esperado, obtenido);
	}
	
	@Test
	public void segmentosParalelosTest() {
		Segmento s1 = new Segmento(new Punto( -1, -1), new Punto(3,3));
		Segmento s2 = new Segmento(new Punto( -1, -11), new Punto(3,-7));
		assertTrue(s1.esParalelo(s2));
		
		
	}

}
