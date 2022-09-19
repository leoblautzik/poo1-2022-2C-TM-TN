package videoClub;

public abstract class Video implements Comparable<Video>, Entregable {
	private String titulo;
	private String genero;
	private boolean entregado = false;
	
	public Video(String titulo, String genero) {
		super();
		this.titulo = titulo;
		this.genero = genero;
	}

	protected String getTitulo() {
		return titulo;
	}

	protected void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	protected String getGenero() {
		return genero;
	}

	protected void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "[titulo=" + titulo + ", genero=" + genero + ", entregado=" + entregado;
	}

	@Override
	public abstract int compareTo(Video o);
	
	
	@Override
	public void entregar() {
		this.entregado = true;
		
	}

	@Override
	public void devolver() {
		this.entregado = false;
		
	}

	@Override
	public boolean isEntregado() {
		return entregado;
	}

}
