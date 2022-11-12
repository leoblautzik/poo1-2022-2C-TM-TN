package segundoParcialInfractores;

public class Multado implements Comparable<Multado>{
	private String patente;
	private Integer multa;
	
	public Multado(String patente, Integer multa) {
		this.patente = patente;
		this.multa = multa;
	}

	@Override
	public int compareTo(Multado o) {
		return (-1) * Integer.compare(this.multa, o.multa);
	}

	@Override
	public String toString() {
		return this.patente + ", " + this.multa;
	}
	
	
	
	
	

}
