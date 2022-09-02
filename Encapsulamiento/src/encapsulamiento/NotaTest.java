package encapsulamiento;

import static org.junit.Assert.*;

import org.junit.Test;

public class NotaTest {

	@Test
	public void constructorTest() {
		Nota miNota = new Nota(2);
		assertNotNull(miNota);
	}
	
	@Test
	public void obtenerValorTest() {
		Nota miNota = new Nota(2);
		assertEquals(2, miNota.obtenerValor());
	}
	
	@Test
	public void aprobadoValorTest() {
		Nota miNota = new Nota(7);
		assertTrue(miNota.aprobado());
	}
	
	@Test
	public void cuatroTest() {
		Nota miNota = new Nota(4);
		assertTrue(miNota.aprobado());
	}
	
	@Test(expected=Error.class)
	public void masDe10Test() {
		@SuppressWarnings("unused")
		Nota miNota = new Nota(11);		
	}
	
	
	@Test
	public void desaprobadoValorTest() {
		Nota miNota = new Nota(2);
		assertFalse(miNota.aprobado());
	}

}
