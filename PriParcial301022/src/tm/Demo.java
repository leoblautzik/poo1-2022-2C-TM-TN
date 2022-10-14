package tm;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		
		Dentista silvia = new Dentista("Silvia", "Perez");
		Medico juan = new Medico("Juan","Lopez");
		Cirujano luis = new Cirujano("Luis", "Alvarez");
		Endodoncista carla = new Endodoncista("Carla", "Fernandez");
		CirujanoCardiovascular ciro = new CirujanoCardiovascular("Ciro", "Latidos");
		
		Profesional [] profesionales = {silvia, juan, luis, carla, ciro};
		double montoTotal = 0;
		
		for (Profesional profesional : profesionales) {
			montoTotal += profesional.getSalario();
		}
		
		System.out.println("Monto total a abonar por salarios: " + montoTotal);
		
		
		Arrays.sort(profesionales);
		System.out.println("Ordenados de mayor a menor salrio");
		
		for (Profesional profesional : profesionales) {
			System.out.println(profesional.getSalario());;
		}
		
		
		

		
		
	}

}
