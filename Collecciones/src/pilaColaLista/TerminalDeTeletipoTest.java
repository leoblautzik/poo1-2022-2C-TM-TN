package pilaColaLista;

import static org.junit.Assert.*;

import org.junit.Test;

public class TerminalDeTeletipoTest {

	@Test
	public void enunciadoTest() {
		TerminalDeTeletipo ttt = new TerminalDeTeletipo();
		
		String esperado = "ae";
		String obtenido = ttt.terminal("abc/d//e");
		assertEquals(esperado, obtenido);
		
	}
	
	@Test
	public void empiezaConBarraTest() {
		TerminalDeTeletipo ttt = new TerminalDeTeletipo();
		
		String esperado = "ae";
		String obtenido = ttt.terminal("/abc/d//e");
		assertEquals(esperado, obtenido);
		
	}
	
	@Test
	public void empiezaConAmpersandTest() {
		TerminalDeTeletipo ttt = new TerminalDeTeletipo();
		
		String esperado = "ae";
		String obtenido = ttt.terminal("&abc/d//e");
		assertEquals(esperado, obtenido);
		
	}
	
	@Test
	public void borraTodoAlFinalTest() {
		TerminalDeTeletipo ttt = new TerminalDeTeletipo();
		
		String esperado = "";
		String obtenido = ttt.terminal("abc/d//e&");
		assertEquals(esperado, obtenido);
		
	}
	
	@Test
	public void soloBarrasTest() {
		TerminalDeTeletipo ttt = new TerminalDeTeletipo();
		
		String esperado = "";
		String obtenido = ttt.terminal("///////////");
		assertEquals(esperado, obtenido);
		
	}
	
	@Test
	public void sinRetrocesoNiAnulacionTest() {
		TerminalDeTeletipo ttt = new TerminalDeTeletipo();
		
		String esperado = "supercalifragilisticoespialidoso";
		String obtenido = ttt.terminal("supercalifragilisticoespialidoso");
		assertEquals(esperado, obtenido);
		
	}

}
