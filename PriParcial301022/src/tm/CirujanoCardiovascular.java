package tm;

public class CirujanoCardiovascular extends Cirujano {
	
	public CirujanoCardiovascular(String nombre, String apellido) {
		super(nombre, apellido);
	}
	
	@Override
	public double getSalario() {
		return super.getSalario() * 1.25;
	}

}
