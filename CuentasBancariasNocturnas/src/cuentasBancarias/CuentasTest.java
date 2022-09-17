package cuentasBancarias;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentasTest {

	@Test
	public void creoUnaCajaDeAhorrosTest() {
		CajaDeAhorro ca = new CajaDeAhorro("Ana");
		assertEquals(0, ca.consultarSaldo(),0.001);
		ca.depositar(10000);
		assertEquals(10000, ca.consultarSaldo(),0.001);
	}
	
	@Test
	public void extraerTest() {
		CajaDeAhorro ca = new CajaDeAhorro("Ana");
		ca.depositar(10000);
		ca.extraer(5000);
		assertEquals(5000, ca.consultarSaldo(),0.001);
	}
	
	@Test
	public void extraerTodoTest() {
		CajaDeAhorro ca = new CajaDeAhorro("Ana");
		ca.depositar(5000);
		ca.extraer(5000);
		assertEquals(0, ca.consultarSaldo(),0.001);
	}
	
	@Test(expected=Error.class)
	public void depositoNegativoTodoTest() {
		CajaDeAhorro ca = new CajaDeAhorro("Ana");
		ca.depositar(-5);
	}
	
	
	@Test
	public void extraerDeCtaCorrienteTest() {
		CuentaCorriente ca = new CuentaCorriente("Ana", 2000);
		ca.depositar(10000);
		ca.extraer(5000);
		assertEquals(5000, ca.consultarSaldo(),0.001);
	}
	
	@Test
	public void extraerDeCtaTest() {
		CuentaBancaria ca = new CuentaCorriente("Ana", 2000);
		ca.depositar(10000);
		ca.extraer(5000);
		assertEquals(5000, ca.consultarSaldo(),0.001);
		
	}
	
	@Test
	public void transferirTest() {
		CuentaCorriente cc = new CuentaCorriente("Ana", 2000);
		cc.depositar(10000);
		CajaDeAhorro ca = new CajaDeAhorro("Pipo");
		ca.depositar(10000);
		
		ca.transferir(7000, cc);
		
		assertEquals(3000, ca.consultarSaldo(),0.01);
		assertEquals(17000, cc.consultarSaldo(),0.01);
		
		cc.transferir(10000, ca);
		
		assertEquals(13000, ca.consultarSaldo(),0.01);
		assertEquals(7000, cc.consultarSaldo(),0.01);
		
		cc.transferir(10000, ca);
		
		assertEquals(13000, ca.consultarSaldo(),0.01);
		assertEquals(7000, cc.consultarSaldo(),0.01);
	}
	
	@Test
	public void transferirConDescubiertoTest() {
		CuentaCorriente cc = new CuentaCorriente("Ana", 2000);
		cc.depositar(10000);
		CajaDeAhorro ca = new CajaDeAhorro("Pipo");
		ca.depositar(10000);
		
		cc.transferir(12000, ca);
		
		assertEquals(22000, ca.consultarSaldo(),0.01);
		assertEquals(-2000, cc.consultarSaldo(),0.01);
			
	}

}
