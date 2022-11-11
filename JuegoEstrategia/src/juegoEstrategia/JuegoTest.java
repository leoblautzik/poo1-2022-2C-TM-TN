package juegoEstrategia;

import static org.junit.Assert.*;

import org.junit.Test;

public class JuegoTest {

	@Test
	public void soldadoAtacarPierdeEnergiasTest() {
		
		Soldado rambo = new Soldado(1,1);
		Soldado conan = new Soldado(1,1);
		rambo.atacar(conan);
		
		assertEquals(90, rambo.getEnergia());
		
	}
	
	@Test
	public void soldadoAtacadoPierdeSaludTest() {
		
		Soldado rambo = new Soldado(1,1);
		Soldado conan = new Soldado(1,1);
		rambo.atacar(conan);
		
		
		assertEquals(190, conan.getSalud());
		
	}
	
	@Test
	public void soldadoAtacarHastaQuedarSinEnergiaTest() {
		
		Soldado rambo = new Soldado(1,1);
		Soldado conan = new Soldado(1,1);
		for(int i = 1; i <=10; i++)
			rambo.atacar(conan);
		
		assertFalse(rambo.puedeAtacar(conan));
		
	}
	
	@Test
	public void soldadoAtacarHastaQuedarSinEnergiaYbebeAguaTest() {
		
		Soldado rambo = new Soldado(1,1);
		Soldado conan = new Soldado(1,1);
		for(int i = 1; i <=10; i++)
			rambo.atacar(conan);
		
		assertFalse(rambo.puedeAtacar(conan));
		
		rambo.beberAgua();
		
		assertTrue(rambo.puedeAtacar(conan));
		
	}

}
