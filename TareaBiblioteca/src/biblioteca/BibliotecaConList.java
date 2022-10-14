package biblioteca;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BibliotecaConList {
	
		private List<Libro> libros;
		

		// 1. Se construya a partir de la máxima cantidad de libros que puede contener.
		public BibliotecaConList() {

			this.libros = new ArrayList<Libro>();

		}

		// 2. Se pueda consultar la cantidad de libros que contiene.
		public int cuantosLibros() {
			return this.libros.size();			
		}

		/*
		 * 3. Se pueda agregar un libro indicando su título, autor, Genero y cantidad de
		 * páginas, siempre y cuando haya
		 * 
		 * lugar en la Biblioteca. Los Generos literarios que le gustan a éste
		 * bibiotecario son: POESIA, CIENCIAFIC- CION, AVENTURA, NOVELA, HISTORIA,
		 * INFANTILES.
		 */
		public boolean agregarLibro(String titulo, String autor, Genero genero, int paginas) {
			libros.add(new Libro(titulo, autor, genero, paginas));
				return true;
			
		}

		// 4. Devuelva el título de un libro a partir de la posición.
		public String libroEnLaPosicion(int posicion) {
			if (posicion < 1 || posicion > this.cuantosLibros())
				throw new Error("Posicion invalida");
			return libros.get(posicion).getTitulo();
		}

		// 5. Devuelva el libro con más cantidad de páginas.
		public Libro libroConMasPaginas() {
			Libro libroConMasPaginas = libros.get(0);
			for (int i = 1; i < this.cuantosLibros(); i++) {
				if (libros.get(i).getPaginas() > libroConMasPaginas.getPaginas()) {
					libroConMasPaginas = libros.get(i);
				}
			}
			return libroConMasPaginas;
		}

		// 6. Se pueda consultar cuantos libros hay de determinado autor.
		public int cuantosLibrosDelAutor(String autor) {
			int contador = 0;
			for(Libro cadaLibro : this.libros) {
				if (cadaLibro.getAutor().equals(autor))
					contador++;
			}
			return contador;

		}

		// 7. Devuelva una Lista con todos los Libros de un autor que se pasa por
		// parámetro.
		public List<Libro> librosDelAutor(String autor) {
			List<Libro> aux = new LinkedList<Libro>();
			for(Libro cadaLibro : this.libros) {
				if (cadaLibro.getAutor().equals(autor))
					aux.add(cadaLibro);
			return aux;
		}}
		

		// 8. Calcule el tiempo (en minutos) que llevaría leer todos los libros,
		// asumiendo que se tarda 1 minuto por página.

		public int tiempoEnLeerTodosLosLibros() {
			int acumulador = 0;
			
			for(Libro cadaLibro : this.libros) {
				acumulador += cadaLibro.getPaginas();
			}

			return acumulador;

		}

		// 9. Informe por pantalla la cantidad de libros que hay
		// por cada Genero literario.

		public void librosPorGeneroLiterario() {

			Genero[] generos = Genero.values();
			int[] contadores = new int[generos.length];

			for(Libro cadaLibro : this.libros){
				contadores[cadaLibro.getGenero().ordinal()]++;
			}

			for (int i = 0; i < generos.length; i++)
				if (contadores[i] != 0) {
					System.out.println(generos[i] + "  " + contadores[i]);
				}

		}
		
		

	}

}
