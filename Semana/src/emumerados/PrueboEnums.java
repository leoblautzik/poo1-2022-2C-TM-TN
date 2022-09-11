package emumerados;

public class PrueboEnums {

	public static void main(String[] args) {
		DiaDeLaSemana hoy = DiaDeLaSemana.VIERNES;
		
		System.out.println(hoy.name());
		System.out.println(hoy.ordinal());
		//ventas[DiaDeLaSemana.JUEVES.ordinal()]=+ importe
		System.out.println(DiaDeLaSemana.LUNES.ordinal());
		System.out.println(DiaDeLaSemana.values()[5]);
		/*
		 * DiaDeLaSemana [] vd = DiaDeLaSemana.values(); for (DiaDeLaSemana dia : vd) {
		 * System.out.println(dia);
		 * 
		 * }
		 */
		
		
		
	}
}
