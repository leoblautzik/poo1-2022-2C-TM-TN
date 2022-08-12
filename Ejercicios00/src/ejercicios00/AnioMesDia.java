package ejercicios00;

public class AnioMesDia {

	public static void main(String[] args) {

		descomponerFecha(20220808);
		descomponerFecha(19001201);
		descomponerFecha(20000112);
		descomponerFecha(20230101);

	}

	static void descomponerFecha(int fecha) {
		int anio = fecha / 10000;
		int dia = fecha % 100;
		int mes = fecha / 100 % 100;

		System.out.println("Año: " + anio);
		System.out.println("Mes: " + mes);
		System.out.println("Día: " + dia);

	}

}
