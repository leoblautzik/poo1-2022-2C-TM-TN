package ejercicios00;

public class PrimerosNaturales {

	static void imprimirLosPrimerosNaturales(int n) {
		for (int i = 0; i < n; i++) {
			if (i < n - 1)
				System.out.print(i + ",");
			else
				System.out.print(i);
		}
		System.out.print("\n");
	}

	public static void main(String[] args) {
		imprimirLosPrimerosNaturales(5);
		imprimirLosPrimerosNaturales(12);

	}

}
