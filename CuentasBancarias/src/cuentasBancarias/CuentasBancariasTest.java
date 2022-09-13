package cuentasBancarias;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentasBancariasTest {

	@Test
	public void inicializacionTest() {
		Cuenta miCuenta = new CajaDeAhorro("Lucas");
		assertEquals(0, miCuenta.consultarSaldo(),0.001);
		
	}
	
	@Test
	public void titularTest() {
		Cuenta miCuenta = new CajaDeAhorro("Lucas");
		assertEquals("Lucas", miCuenta.obtenerTitular());
		
	}
		
	@Test
	public void depositarTest() {
		Cuenta miCuenta = new CajaDeAhorro("Lucas");
		miCuenta.depositar(10000);
		assertEquals(10000, miCuenta.consultarSaldo(),0.001);
		
	}
	
	@Test(expected=Error.class)
	public void depositarNegativoTest() {
		Cuenta miCuenta = new CajaDeAhorro("Lucas");
		miCuenta.depositar(-10000);
		assertEquals(10000, miCuenta.consultarSaldo(),0.001);
		
	}
	
	@Test
	public void extraerMenosDelSaldoTest() {
		Cuenta miCuenta = new CajaDeAhorro("Lucas");
		miCuenta.depositar(10000);
		assertEquals(10000, miCuenta.consultarSaldo(),0.001);
		miCuenta.extraer(5000);
		assertEquals(5000, miCuenta.consultarSaldo(),0.001);
		
	}
	
	@Test
	public void extraerMasDelSaldoTest() {
		Cuenta miCuenta = new CajaDeAhorro("Lucas");
		miCuenta.depositar(10000);
		assertEquals(10000, miCuenta.consultarSaldo(),0.001);
		miCuenta.extraer(10001);
		assertEquals(10000, miCuenta.consultarSaldo(),0.001);
		
	}
	
	@Test
	public void extraerTodoElSaldoTest() {
		Cuenta miCuenta = new CajaDeAhorro("Lucas");
		miCuenta.depositar(10000);
		assertEquals(10000, miCuenta.consultarSaldo(),0.001);
		miCuenta.extraer(10000);
		assertEquals(0, miCuenta.consultarSaldo(),0.001);
			
	}
	
	@Test(expected=Error.class)
	public void extraerMontoNegativoTest() {
		Cuenta miCuenta = new CajaDeAhorro("Lucas");
		miCuenta.depositar(10000);
		miCuenta.extraer(-100);
	}
	
	@Test
	public void transferenciaTest() {
		Cuenta ca = new CajaDeAhorro("Ana");
		Cuenta cc = new CuentaCorriente("Luis", 4000);
		
		ca.depositar(10000);
		cc.depositar(5000);
		
		cc.transferir(2500, ca);
		
		assertEquals(12500, ca.consultarSaldo(), 0.001);
		assertEquals(2500, cc.consultarSaldo(), 0.001);
			
	}
	
	@Test
	public void transferenciaConDescubiertoTest() {
		Cuenta ca = new CajaDeAhorro("Ana");
		Cuenta cc = new CuentaCorriente("Luis", 4000);
		ca.depositar(10000);
		cc.depositar(5000);
		cc.transferir(7500, ca);
		assertEquals(17500, ca.consultarSaldo(), 0.001);
		assertEquals(-2500, cc.consultarSaldo(), 0.001);
		
		ca.transferir(10000, cc);
		
		assertEquals(7500, ca.consultarSaldo(), 0.001);
		assertEquals(7500, cc.consultarSaldo(), 0.001);
		
		
		
	}

}
