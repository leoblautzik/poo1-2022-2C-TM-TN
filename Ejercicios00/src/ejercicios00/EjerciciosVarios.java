package ejercicios00;

import java.awt.Container;

public class EjerciciosVarios {

	static boolean esPrimoF(int x) {
		if (x == 1)
			return false;
		for (int i = 2; i < x; i++) {
			if (x % i == 0)
				return false;
		}
		return true;
	}

	static boolean esPrimoW(int x) {
		int i = 2;
		if (x == 1)
			return false;
		boolean primo = true;
		while (x % i != 0 && x > 2) {
			i++;
		}
		if (i != x)
			primo = false;

		return primo;
	}

	static void mostrarNprimos(int n) {

		int i = 1;
		int contadorDePrimos = 0;
		while (contadorDePrimos < n) {
			if (esPrimoW(i)) {
				System.out.println(i);
				contadorDePrimos++;

			}
			i++;
		}

	}

	public static void main(String[] args) {
//		System.out.println(esPrimoF(11) + "verdadero");
//		System.out.println(esPrimoF(12) + "falso");
//		System.out.println(esPrimoF(1) + "falso");
//		System.out.println(esPrimoF(555) + "falso");
//		System.out.println(esPrimoF(22) + "falso");
//		System.out.println(esPrimoF(101) + "verdadero");
//		System.out.println(esPrimoF(3) + "verdadero");
//		System.out.println(esPrimoF(1299709) + "verdadero");
//		System.out.println("-----------------");
//		System.out.println(esPrimoW(11));
//		System.out.println(esPrimoW(12));
//		System.out.println(esPrimoW(1));
//		System.out.println(esPrimoW(555));
//		System.out.println(esPrimoW(22));
//		System.out.println(esPrimoW(101));
//		System.out.println(esPrimoW(3));
//		System.out.println(esPrimoW(1299709));
		
		mostrarNprimos(100000);
	}

}
