package cuentasBancarias;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentasBancariasTest {

	@Test
	public void inicializacionTest() {
		CajaDeAhorro miCuenta = new CajaDeAhorro("Lucas");
		assertEquals(0, miCuenta.consultarSaldo(),0.001);
		
	}
	
	@Test
	public void depositarTest() {
		CajaDeAhorro miCuenta = new CajaDeAhorro("Lucas");
		miCuenta.depositar(10000);
		assertEquals(10000, miCuenta.consultarSaldo(),0.001);
		
	}
	
	@Test(expected=Error.class)
	public void depositarNegativoTest() {
		CajaDeAhorro miCuenta = new CajaDeAhorro("Lucas");
		miCuenta.depositar(-10000);
		assertEquals(10000, miCuenta.consultarSaldo(),0.001);
		
	}
	
	@Test
	public void extraerMenosDelSaldoTest() {
		CajaDeAhorro miCuenta = new CajaDeAhorro("Lucas");
		miCuenta.depositar(10000);
		assertEquals(10000, miCuenta.consultarSaldo(),0.001);
		miCuenta.extraer(5000);
		assertEquals(5000, miCuenta.consultarSaldo(),0.001);
		
	}
	
	@Test
	public void extraerMasDelSaldoTest() {
		CajaDeAhorro miCuenta = new CajaDeAhorro("Lucas");
		miCuenta.depositar(10000);
		assertEquals(10000, miCuenta.consultarSaldo(),0.001);
		miCuenta.extraer(5000);
		assertEquals(5000, miCuenta.consultarSaldo(),0.001);
		miCuenta.extraer(6000);
		assertEquals(5000, miCuenta.consultarSaldo(),0.001);
		
	}
	
	@Test
	public void extraerTodoElSaldoTest() {
		CajaDeAhorro miCuenta = new CajaDeAhorro("Lucas");
		miCuenta.depositar(10000);
		assertEquals(10000, miCuenta.consultarSaldo(),0.001);
		miCuenta.extraer(10000);
		assertEquals(0, miCuenta.consultarSaldo(),0.001);
			
	}
	
	@Test(expected=Error.class)
	public void extraerMontoNegativoTest() {
		CajaDeAhorro miCuenta = new CajaDeAhorro("Lucas");
		miCuenta.depositar(10000);
		miCuenta.extraer(-100);
	}

}
