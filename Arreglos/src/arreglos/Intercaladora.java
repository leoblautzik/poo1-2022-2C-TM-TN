package arreglos;

public class Intercaladora {

	public int[] intercalar(int[] a, int[] b) {
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
				if (i == a.length) {
					c[k] = b[j];
					j++;
				} else if (j == b.length) {
					c[k] = a[i];
					i++;
				}
			}
		}
		return c;
	}

	public static void main(String[] args) {
		Intercaladora inter = new Intercaladora();
		int[] a = { 1, 3 };
		int[] b = { 2, 7 };
		int[] x = { 1, 3, 5, 9, 12, 23, 34, 45, 56, 67, 100 };
		int[] nulo = {};
		int[] deUno = { 2 };
		
		int[] c = inter.intercalar(nulo, nulo);
		Arreglos.mostrarArreglo(c);

	}

}
