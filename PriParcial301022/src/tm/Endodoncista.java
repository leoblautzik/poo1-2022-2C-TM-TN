package tm;

public class Endodoncista extends Dentista {

	public Endodoncista(String nombre, String apellido) {
		super(nombre, apellido);
	}
	
	@Override
	public double getSalario() {
		return super.getSalario() * 1.25;
	}
}

