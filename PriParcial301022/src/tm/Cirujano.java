package tm;

public class Cirujano extends Medico{
	
	public Cirujano(String nombre, String apellido) {
		super(nombre, apellido);
	}
	
	@Override
	public double getSalario() {
		return super.getSalario() * 1.25;
	}

}
