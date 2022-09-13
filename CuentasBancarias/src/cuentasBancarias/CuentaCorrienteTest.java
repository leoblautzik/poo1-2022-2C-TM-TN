package cuentasBancarias;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentaCorrienteTest {

	@Test
	public void inicializacionTest() {
		CuentaCorriente miCuentaCorriente = new CuentaCorriente("Lucas", 5000);
		assertEquals(0, miCuentaCorriente.consultarSaldo(),0.001);
		miCuentaCorriente.depositar(10000);
		assertEquals(10000, miCuentaCorriente.consultarSaldo(),0.001);
			
	}
	
	@Test
	public void extraerMenosDelSaldoTest() {
		CuentaCorriente miCuentaCorriente = new CuentaCorriente("Lucas", 5000);
		assertEquals(0, miCuentaCorriente.consultarSaldo(),0.001);
		miCuentaCorriente.depositar(10000);
		assertEquals(10000, miCuentaCorriente.consultarSaldo(),0.001);
		miCuentaCorriente.extraer(9500);
		assertEquals(500, miCuentaCorriente.consultarSaldo(),0.001);
			
	}
	
	@Test
	public void extraerMasDelSaldoTest() {
		CuentaCorriente miCuentaCorriente = new CuentaCorriente("Lucas", 5000);
		assertEquals(0, miCuentaCorriente.consultarSaldo(),0.001);
		miCuentaCorriente.depositar(10000);
		assertEquals(10000, miCuentaCorriente.consultarSaldo(),0.001);
		miCuentaCorriente.extraer(10500);
		assertEquals(-500, miCuentaCorriente.consultarSaldo(),0.001);
			
	}
	
	@Test
	public void extraerHastaElDescubiertoTest() {
		CuentaCorriente miCuentaCorriente = new CuentaCorriente("Lucas", 5000);
		assertEquals(0, miCuentaCorriente.consultarSaldo(),0.001);
		miCuentaCorriente.depositar(10000);
		assertEquals(10000, miCuentaCorriente.consultarSaldo(),0.001);
		miCuentaCorriente.extraer(15000);
		assertEquals(-5000, miCuentaCorriente.consultarSaldo(),0.001);
			
	}
	
	@Test
	public void extraerMasDelDescubiertoTest() {
		CuentaCorriente miCuentaCorriente = new CuentaCorriente("Lucas", 5000);
		assertEquals(0, miCuentaCorriente.consultarSaldo(),0.001);
		miCuentaCorriente.depositar(10000);
		assertEquals(10000, miCuentaCorriente.consultarSaldo(),0.001);
		miCuentaCorriente.extraer(15500);
		assertEquals(10000, miCuentaCorriente.consultarSaldo(),0.001);
			
	}
	
	@Test
	public void extraerHastaElDescubiertoYDeposito1000Test() {
		CuentaCorriente miCuentaCorriente = new CuentaCorriente("Lucas", 5000);
		assertEquals(0, miCuentaCorriente.consultarSaldo(),0.001);
		miCuentaCorriente.depositar(10000);
		assertEquals(10000, miCuentaCorriente.consultarSaldo(),0.001);
		miCuentaCorriente.extraer(15000);
		assertEquals(-5000, miCuentaCorriente.consultarSaldo(),0.001);
		miCuentaCorriente.depositar(10000);	
		assertEquals(5000, miCuentaCorriente.consultarSaldo(),0.001);
		miCuentaCorriente.extraer(10000);
		assertEquals(-5000, miCuentaCorriente.consultarSaldo(),0.001);
		
	}

}
