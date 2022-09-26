package biblioteca;

import java.util.Objects;

/*título, autor, Genero y cantidad de páginas, siempre y cuando haya

lugar en la Biblioteca. Los Generos literarios que le gustan a éste bibiotecario son: 
POESIA, CIENCIAFIC-CION, AVENTURA, NOVELA, HISTORIA, INFANTILES.
*/
public class Libro {
	
	
	private String titulo;
	private String autor;
	private Genero genero;
	private int paginas;
	
	public Libro(String titulo, String autor, Genero genero, int paginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.paginas = paginas;
	}

	protected Genero getGenero() {
		return genero;
	}

	protected String getAutor() {
		return autor;
	}

	@Override
	public int hashCode() {
		return Objects.hash(autor, genero, paginas, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(autor, other.autor) && genero == other.genero && paginas == other.paginas
				&& Objects.equals(titulo, other.titulo);
	}

	protected int getPaginas() {
		return paginas;
	}

	protected String getTitulo() {
		return titulo;
	}
	
	

}


