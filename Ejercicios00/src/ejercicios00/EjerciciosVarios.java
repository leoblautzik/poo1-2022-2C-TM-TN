package ejercicios00;

public class EjerciciosVarios {

	static boolean esPrimo(int x) {
		if (x == 1)
			return false;
		for (int i = 2; i < x; i++) {
			if (x % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(esPrimo(11));
		System.out.println(esPrimo(12));
		System.out.println(esPrimo(1));
		System.out.println(esPrimo(555));
		System.out.println(esPrimo(22));
		System.out.println(esPrimo(101));
		System.out.println(esPrimo(8));
	}

}
