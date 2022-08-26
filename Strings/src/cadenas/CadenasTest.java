package cadenas;

import static org.junit.Assert.*;

import org.junit.Test;

public class CadenasTest {

	@Test
	public void esPalindromoTest() {
		assertTrue (Inversora.esPalindromo("neuquen"));
		assertTrue (Inversora.esPalindromo("oso"));
	}
	@Test
	public void unaLetraTest() {
		assertTrue (Inversora.esPalindromo("o"));
	}
	@Test
	public void fraseTest() {
		assertTrue(Inversora.esPalindromo("A la catalana banal atacala"));
	}
	
	@Test
	public void noEsPalindromoTest() {
		assertFalse (Inversora.esPalindromo("chimpum"));
	
	}
	
	@Test
	public void conAcentosTest() {
		//assertTrue (Inversora.esPalindromo("neuquén"));
	}
	
	@Test
	public void conMayusculasTest() {
		assertTrue (Inversora.esPalindromo("Neuquen"));
	
	}

}
