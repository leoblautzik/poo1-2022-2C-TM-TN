package vehiculos;

public abstract class Vehiculo {

	private Persona chofer;
	private int kmRecorridos = 0;

	public int getKmRecorridos() {
		return this.kmRecorridos;
	}

	public void asignarChofer(Persona chofer) {
		if (this.chofer == null)
			this.chofer = chofer;
	}

	public abstract boolean cambiarChofer(Persona nuevoChofer);

}
