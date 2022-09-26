package biblioteca;

import static org.junit.Assert.*;

import org.junit.Test;

public class BibliotecaTest {

	@Test
	public void libroEnLaPosicionTest() {

		Biblioteca elNegrito = new Biblioteca(8);
		elNegrito.agregarLibro("Moby-Dick", "Melville", Genero.AVENTURA, 823);
		elNegrito.agregarLibro("Crepusculo", "Mayer", Genero.NOVELA, 789);
		String esperado = "Moby-Dick";
		String obtenido = elNegrito.libroEnLaPosicion(1);
		assertEquals(esperado, obtenido);
		
	}
	@Test
	public void libroEnLaUltimaPosicionTest() {

		Biblioteca elNegrito = new Biblioteca(8);
		elNegrito.agregarLibro("Moby-Dick", "Melville", Genero.AVENTURA, 823);
		elNegrito.agregarLibro("Crepusculo", "Mayer", Genero.NOVELA, 789);
		String esperado = "Crepusculo";
		String obtenido = elNegrito.libroEnLaPosicion(2);
		assertEquals(esperado, obtenido);
		
	}
	
	@Test(expected = Error.class)
	public void libroaPosicionFueraDeRangoTest() {

		Biblioteca elNegrito = new Biblioteca(8);
		elNegrito.agregarLibro("Moby-Dick", "Melville", Genero.AVENTURA, 823);
		elNegrito.agregarLibro("Crepusculo", "Mayer", Genero.NOVELA, 789);
		String esperado = "Crepusculo";
		String obtenido = elNegrito.libroEnLaPosicion(3);
		assertEquals(esperado, obtenido);
		
	}
	
	@Test
	public void libroconMasPaginasTest() {

		Biblioteca elNegrito = new Biblioteca(8);
		elNegrito.agregarLibro("Moby-Dick", "Melville", Genero.AVENTURA, 823);
		elNegrito.agregarLibro("Crepusculo", "Mayer", Genero.NOVELA, 789);
		Libro esperado = new Libro("Moby-Dick", "Melville", Genero.AVENTURA, 823);
		Libro obtenido = elNegrito.libroConMasPaginas();
		assertEquals(esperado, obtenido);
		
	}
	
	@Test
	public void LibrosDelAutorTest() {

		Biblioteca elNegrito = new Biblioteca(8);
		elNegrito.agregarLibro("Moby-Dick", "Melville", Genero.AVENTURA, 823);
		elNegrito.agregarLibro("Crepusculo", "Mayer", Genero.NOVELA, 789);
		elNegrito.agregarLibro("Crepusculo - Nueva Luna", "Mayer", Genero.NOVELA, 689);
		Libro[] esperado = {
				new Libro("Crepusculo", "Mayer", Genero.NOVELA, 789),
				new Libro("Crepusculo - Nueva Luna", "Mayer", Genero.NOVELA, 689) };
		Libro[] obtenido = elNegrito.librosDelAutor("Mayer");
		
		assertArrayEquals(esperado, obtenido);
		
	}
	
	@Test
	public void librosPorGeneroTest() {

		Biblioteca elNegrito = new Biblioteca(8);
		elNegrito.agregarLibro("Moby-Dick", "Melville", Genero.AVENTURA, 823);
		elNegrito.agregarLibro("Crepusculo", "Mayer", Genero.NOVELA, 789);
		elNegrito.agregarLibro("Crepusculo - Nueva Luna", "Mayer", Genero.NOVELA, 689);
		elNegrito.agregarLibro("Crepusculo - Amanecer", "Mayer", Genero.TERROR, 889);
		elNegrito.librosPorGeneroLiterario();
	
	}
	
	@Test
	public void tiempoEnLeerTodosLosLibrosTest() {

		Biblioteca elNegrito = new Biblioteca(8);
		elNegrito.agregarLibro("Moby-Dick", "Melville", Genero.AVENTURA, 823);
		elNegrito.agregarLibro("Crepusculo", "Mayer", Genero.NOVELA, 789);
		elNegrito.agregarLibro("Crepusculo - Nueva Luna", "Mayer", Genero.NOVELA, 689);
		elNegrito.agregarLibro("Crepusculo - Amanecer", "Mayer", Genero.TERROR, 889);
		int esperado = 3190;
		int obtenido = elNegrito.tiempoEnLeetTodosLosLibros();
		assertEquals(esperado, obtenido);
	
	}
}
