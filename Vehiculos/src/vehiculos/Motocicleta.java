package vehiculos;

public class Motocicleta extends Vehiculo {

	private Persona acompaniante;

	@Override
	public boolean cambiarChofer(Persona nuevoChofer) {
		if (!hayAcompaniante()) {
			asignarChofer(nuevoChofer);
			return true;
		}
		return false;

	}

	public boolean agregarAcompaniante(Persona a) {
		if (!hayAcompaniante()) {
			this.acompaniante = a;
			return true;
		}
		return false;

	}

	private boolean hayAcompaniante() {
		return acompaniante != null;
	}

}
