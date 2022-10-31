package mapas;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExpresionBalanceadaTest {

	@Test
	public void dosParentesisBalanceadosTest() {
		ExpresionBalanceada eb = new ExpresionBalanceada();
		String expresion = "()";
		assertTrue(eb.estaBalanceada(expresion));
	}
	
	@Test
	public void dosParentesisDesbalanceadosTest() {
		ExpresionBalanceada eb = new ExpresionBalanceada();
		String expresion = ")(";
		assertFalse(eb.estaBalanceada(expresion));
	}
	
	
	@Test
	public void enunciadoBalanceadoTest() {
		ExpresionBalanceada eb = new ExpresionBalanceada();
		String expresion = "[()]{}{[()()]()}";
		assertTrue(eb.estaBalanceada(expresion));
	}
	
	@Test
	public void enunciadoDesBalanceadoTest() {
		ExpresionBalanceada eb = new ExpresionBalanceada();
		String expresion = "[(){}{[]()()]()}";
		assertFalse(eb.estaBalanceada(expresion));
	}
	
	@Test
	public void enunciadoMalignoDesBalanceadoAlFinalTest() {
		ExpresionBalanceada eb = new ExpresionBalanceada();
		String expresion = "[()]{}{[()()]()}(";
		assertFalse(eb.estaBalanceada(expresion));
	}
	
	@Test
	public void enunciadoMalignoDesBalanceadoAlInicioTest() {
		ExpresionBalanceada eb = new ExpresionBalanceada();
		String expresion = "{[()]{}{[()()]()}";
		assertFalse(eb.estaBalanceada(expresion));
	}
	@Test
	public void todosDeAperturaTest() {
		ExpresionBalanceada eb = new ExpresionBalanceada();
		String expresion = "[((((([[[[[{{{{{{";
		assertFalse(eb.estaBalanceada(expresion));
	}
	
	@Test
	public void todosDeCierreTest() {
		ExpresionBalanceada eb = new ExpresionBalanceada();
		String expresion = ")))))))]]]]]]]]}}}}}}}}))))";
		assertFalse(eb.estaBalanceada(expresion));
	}
	
	@Test
	public void unSoloSignoTest() {
		ExpresionBalanceada eb = new ExpresionBalanceada();
		String expresion = "(";
		assertFalse(eb.estaBalanceada(expresion));
	}
	@Test
	public void unSoloSignoCierreTest() {
		ExpresionBalanceada eb = new ExpresionBalanceada();
		String expresion = ")";
		assertFalse(eb.estaBalanceada(expresion));
	}
	
	@Test
	public void vaciaTest() {
		ExpresionBalanceada eb = new ExpresionBalanceada();
		String expresion = "";
		assertTrue(eb.estaBalanceada(expresion));
	}
	
}
