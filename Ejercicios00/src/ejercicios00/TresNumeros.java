package ejercicios00;

public class TresNumeros {

	static void mayorMedioMenor(int a, int b, int c) {
		int mayor, medio, menor;

		mayor = a;
		if (b > mayor) {
			medio = a;
			mayor = b;
		} else {
			medio = b;
		}

		if (c > mayor) {
			menor = medio;
			medio = mayor;
			mayor = c;
		} else {
			if (c > medio) {
				menor = medio;
				medio = c;
			} else {
				menor = c;
			}

		}

		System.out.println("Mayor: " + mayor + " Medio: " + medio + " Menor: " + menor);

	}

	public static void main(String[] args) {

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
