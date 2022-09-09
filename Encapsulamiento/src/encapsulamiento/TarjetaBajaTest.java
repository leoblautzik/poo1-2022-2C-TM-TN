package encapsulamiento;

import static org.junit.Assert.*;

import org.junit.Test;

public class TarjetaBajaTest {

	@Test
	public void creoUnaTarjetaTest() {
		TarjetaBaja miTarjeta = new TarjetaBaja();
		assertNotNull(miTarjeta);
		assertEquals(0, miTarjeta.obtenerSaldo(), 0);
		
		TarjetaBaja otraTarjeta = new TarjetaBaja(500);
		assertNotNull(otraTarjeta);
		assertEquals(500, otraTarjeta.obtenerSaldo(), 0);
	}
	@Test
	public void viajarEnColectivoTest() {
		TarjetaBaja miTarjeta = new TarjetaBaja(100);
		miTarjeta.pagarViajeEnColectivo();
		double esperado = 100 - 21.50;
		assertEquals(esperado, miTarjeta.obtenerSaldo(), 0);
	}
	
	@Test(expected=Error.class)
	public void creoUnaTarjetaMontoInvalidoTest() {
		TarjetaBaja miTarjeta = new TarjetaBaja(-100);
				
	}

}
