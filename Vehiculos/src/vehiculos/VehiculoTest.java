package vehiculos;

import static org.junit.Assert.*;

import org.junit.Test;

public class VehiculoTest {

	@Test
	public void test() {
		Persona cacho = new Persona();
		Vehiculo ab = new Autobus();
		assertNotNull(ab);
		ab.asignarChofer(cacho);
		
		Persona tito = new Persona();
		assertFalse(ab.cambiarChofer(tito));
		
		Motocicleta moto = new Motocicleta();
		moto.asignarChofer(cacho);
		moto.agregarAcompaniante(tito);
		assertFalse(moto.cambiarChofer(tito));
		
	}

}
