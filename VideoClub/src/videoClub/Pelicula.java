package videoClub;

public class Pelicula extends Video {

	private int anio;
	private String director;

	public Pelicula(String titulo, String genero, int anio, String director) {
		super(titulo, genero);
		this.anio = anio;
		this.director = director;
	}

	public Pelicula(String titulo, String director) {
		this(titulo, "No definido", 0, director);
	}

	public Pelicula() {
		this(null, null);
	}

	protected int getAnio() {
		return anio;
	}

	protected void setAnio(int anio) {
		this.anio = anio;
	}

	protected String getDirector() {
		return director;
	}

	protected void setDirector(String director) {
		this.director = director;
	}

	@Override
	public String toString() {
		return "Pelicula " + super.toString() + ", anio=" + anio + ", director=" + director + "]";
	}

	@Override
	public int compareTo(Video o) {
		Pelicula peli = (Pelicula) o;
		/*
		 * if (this.getAnio() < peli.getAnio()) return -1; else if (this.getAnio() >
		 * peli.getAnio()) return 1; else return 0;
		 */
		
		return Integer.compare(this.getAnio(), peli.getAnio());
	}

	

}
