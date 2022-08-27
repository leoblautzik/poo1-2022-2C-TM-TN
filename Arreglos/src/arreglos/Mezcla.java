package arreglos;

public class Mezcla {

	static int[] mezcla(int[] a, int[] b) {
		int[] c = new int[a.length + b.length];
		int i = 0;
		int j = 0;
		int k = 0;
		for (k = 0; k < c.length; k++) {
			if (i < a.length && j < b.length) {
				if (a[i] <= b[j]) {
					c[k] = a[i];
					i++;
				} else {
					c[k] = b[j];
					j++;
				}
			} else {
				if (i < a.length) {
					c[k] = a[i];
					i++;
				} else {
					c[k] = b[j];
					j++;
				}
			}
		}
		return c;
	}

	public static void main(String[] args) {
		int[] a = { -5, 0, 0, 1, 5, 6, 7, 8, 9, 12, 23, 34, 45 };
		int[] b = { -10, -9, -7 };
//		int[] a = {1,3,5,7};
//		int[] b = {2,4,6,8};
		int[] nulo = {1};
		int[] nulo2 = {-3};
		int[] c = mezcla(b, a);
		Arreglos.mostrarArreglo(c);

	}

}
