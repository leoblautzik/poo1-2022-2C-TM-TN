package vehiculos;

public class Autobus extends Vehiculo {

	private Persona [] pasajeros = {null, null, new Persona(), null};
	

	@Override
	public boolean cambiarChofer(Persona nuevoChofer) {
		if (!hayPasajeros()) {
			asignarChofer(nuevoChofer);
			return true;
		}
		return false;
	}


	private boolean hayPasajeros() {
		for (Persona asiento : pasajeros) {
			if (asiento != null)
				return true;
		}
		return false;				
		
	}

}
