package biblioteca;

public class Biblioteca {

	private Libro[] libros;
	private int cantLibros = 0;

	// 1. Se construya a partir de la máxima cantidad de libros que puede contener.
	public Biblioteca(int maxCantidadDeLibros) {

		this.libros = new Libro[maxCantidadDeLibros];

	}

	// 2. Se pueda consultar la cantidad de libros que contiene.
	public int cuantosLibros() {
		return this.cantLibros;
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
		if (cantLibros >= libros.length)
			return false;
		else {
			libros[cantLibros] = new Libro(titulo, autor, genero, paginas);
			cantLibros++;
			return true;
		}
	}

	// 4. Devuelva el título de un libro a partir de la posición.
	public String libroEnLaPosicion(int posicion) {
		if (posicion < 1 || posicion > cantLibros)
			throw new Error("Posicion invalida");
		return libros[posicion - 1].getTitulo();
	}

	// 5. Devuelva el libro con más cantidad de páginas.
	public Libro libroConMasPaginas() {
		// int maxCantDePaginas = libros[0].getPaginas();
		// Libro libroConMasPaginas = libros[0];
		int posicionDelLibroConMasPaginas = 0;

		for (int i = 1; i < cantLibros; i++) {
			if (libros[i].getPaginas() > libros[posicionDelLibroConMasPaginas].getPaginas()) {
				// maxCantDePaginas = libros[i].getPaginas();
				posicionDelLibroConMasPaginas = i;
			}
		}
		return libros[posicionDelLibroConMasPaginas];
	}

	// 6. Se pueda consultar cuantos libros hay de determinado autor.
	public int cuantosLibrosDelAutor(String autor) {
		int contador = 0;
		for (int i = 0; i < cantLibros; i++) {
			if (libros[i].getAutor().equals(autor))
				contador++;
		}
		return contador;

	}

	// 7. Devuelva un arreglo con todos los Libros de un autor que se pasa por
	// parámetro.
	public Libro[] librosDelAutor(String autor) {
		int cantLibrosDelAutor = cuantosLibrosDelAutor(autor);
		Libro[] aux = new Libro[cantLibrosDelAutor];
		int j = 0;
		for (int i = 0; i < cantLibros; i++) {
			if (libros[i].getAutor().equals(autor)) {
				aux[j] = libros[i];
				j++;
			}
		}
		return aux;
	}

	// 8. Calcule el tiempo (en minutos) que llevaría leer todos los libros,
	// asumiendo que se tarda 1 minuto por página.

	public int tiempoEnLeetTodosLosLibros() {
		int acumulador = 0;
		for (int i = 0; i < cantLibros; i++) {
			acumulador += libros[i].getPaginas();
		}

		return acumulador;

	}

	// 9. Informe por pantalla la cantidad de libros que hay
	// por cada Genero literario.

	public void librosPorGeneroLiterario() {

		Genero[] generos = Genero.values();
		int[] contadores = new int[generos.length];

		for (int i = 0; i < cantLibros; i++) {
			contadores[libros[i].getGenero().ordinal()]++;
		}

		for (int i = 0; i < generos.length; i++)
			if (contadores[i] != 0) {
				System.out.println(generos[i] + "  " + contadores[i]);
			}

	}
	
	

}
