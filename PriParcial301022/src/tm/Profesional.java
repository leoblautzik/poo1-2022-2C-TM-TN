package tm;

public abstract class Profesional implements Comparable<Profesional> {
	
	private String nombre;
	private String apellido;
	private static final double HONORARIO_BASICO = 110000;
	
	public Profesional(String nombre, String apellido) {
		this.apellido = apellido;
		this.nombre = nombre;
	}
	
	public double getSalario() {
		return HONORARIO_BASICO;
	}
	
	public int compareTo(Profesional p) {
		return (-1) * Double.compare(this.getSalario(), p.getSalario());
	}
	
	
	

}
