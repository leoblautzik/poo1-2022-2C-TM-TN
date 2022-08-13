package ejercicios00;

public class Introduccion {

	static int sumar(int a, int b) {
		return a + b;
	}

	static double dividir(int a, int b) {
		return (double) a / b;
	}

	static boolean esPar(int a) {
		return (a % 2 == 0);
	}

	static void convertirFecha(int fecha) {
		int anio = fecha / 10000;
		int mes = fecha / 100 % 100;
		int dia = fecha % 100;
		System.out.println("Año: " + anio + ", Mes: " + mes + ", Día: " + dia);
	}

	static void mayorMenor(int a, int b) {
		if (a > b) {
			System.out.println("Mayor: " + a + ", Menor: " + b);
		} else {
			System.out.println("Mayor: " + b + ", Menor: " + a);
		}
	}

	static void mayorMedioMenor(int a, int b, int c) {
		int mayor, medio, menor;
		mayor = a;
		
		if (b > mayor) {
			medio = a;
			mayor = b;
		} else { medio = b; }

		if (c > mayor) {
			menor = medio;
			medio = mayor;
			mayor = c;
		} else {
			if (c > medio) {
				menor = medio;
				medio = c;
			} else { menor = c; }
		}
		System.out.println("Mayor: " + mayor + " Medio: " + medio + " Menor: " + menor);
	}

	public static void main(String[] args) {
		/*
		 * System.out.println(sumar(3, 5)); System.out.println(sumar(-3, -9));
		 * System.out.println(dividir(9, 3)); System.out.println(dividir(12, 3));
		 * System.out.println(dividir(10, 4)); System.out.println(dividir(10, 0));
		 

		System.out.println(esPar(32));
		System.out.println(esPar(17));
		System.out.println(esPar(0));
		convertirFecha(20220812);
		mayorMenor(23, 450);
		mayorMenor(230, -20);
		*/
		mayorMedioMenor(3, 2, 1);
		mayorMedioMenor(1, 2, 3);
		mayorMedioMenor(2, 3, 1);
		mayorMedioMenor(2, 1, 3);
		mayorMedioMenor(3, 1, 2);
		mayorMedioMenor(1, 3, 2);
		mayorMedioMenor(1, 1, 2);
		mayorMedioMenor(1, 3, 3);
		mayorMedioMenor(1, 1, 1);
		mayorMedioMenor(1, 3, 1);
		mayorMedioMenor(3, 1, 3);


	}

}
