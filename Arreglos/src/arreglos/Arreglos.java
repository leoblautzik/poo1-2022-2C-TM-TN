package arreglos;

import java.util.Arrays;

public class Arreglos {

	boolean estaOrdenado(int v[]) {

		for (int i = 0; i < v.length - 1; i++) {
			if (v[i] < v[i + 1]) {
				return false;
			}
		}

		return true;

	}

	int sumar(int[] a) {
		int suma = 0;

		for (int cadaUno : a)
			suma += cadaUno;

		return suma;
	}

	int sumarPosicionesPares(int[] a) {
		int suma = 0;
		for (int i = 0; i < a.length; i += 2)
			suma += a[i];
		return suma;

	}

	int[][] sumarMatricesCuadradas(int[][] a, int[][] b) {
		int tam = a.length;
		int[][] resultado = new int[tam][tam];

		for (int i = 0; i < tam; i++)
			for (int j = 0; j < tam; j++)
				resultado[i][j] = a[i][j] + b[i][j];

		return resultado;
	}

	public static void mostrarArreglo(int[] a) {
		if (a.length > 0) {
			System.out.print("{");
			for (int i = 0; i < a.length - 1; i++)
				System.out.print(a[i] + ",");
			System.out.println(a[a.length - 1] + "}");
		}
		else System.out.println("array nulo");
	}

	public static void main(String[] args) {
		Arreglos ga1 = new Arreglos();
		int v1[] = { 0, 1, 2, 3, 4, 5, 6, 7 };
		int v2[] = { 7, 6, 5, 4, 3, 2, 1, 0 };
		int v3[] = { -7, -6, -5, -4, -3, -2, -1, 0 };
		int v4[] = { 0, -1, -2, -3, -4, -5, -6, -7 };
		int v5[] = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
		int v6[] = { 7, 6, 6, 5, 5, 4, 4, 3, 2, 2, 2, 2, 2, 1, 1, 1, 1, 0, 0, 0, 0, 0 };
		int v7[] = {};

		System.out.println(ga1.estaOrdenado(v1) + " Debe dar false");
		System.out.println(ga1.estaOrdenado(v2) + " Debe dar true");
		System.out.println(ga1.estaOrdenado(v3) + " Debe dar false");
		System.out.println(ga1.estaOrdenado(v4) + " Debe dar true");
		System.out.println(ga1.estaOrdenado(v5) + " Debe dar true");
		System.out.println(ga1.estaOrdenado(v6) + " Debe dar true");
		System.out.println(ga1.estaOrdenado(v7) + " Debe dar true");

		int a[] = { 3, 5, 1, 2, 9, 21, -5, 9 };

		mostrarArreglo(a);
		Arrays.sort(a);
		mostrarArreglo(a);

		System.out.println(ga1.sumar(a));

		int[][] m1 = { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };
		int[][] m2 = { { 2, 2, 2 }, { 2, 2, 2 }, { 2, 2, 2 } };

		int[][] c = ga1.sumarMatricesCuadradas(m1, m2);

		mostrarMatriz(c);

	}

	private static void mostrarMatriz(int[][] c) {
		for (int[] cadaFila : c)
			mostrarArreglo(cadaFila);
	}

}
