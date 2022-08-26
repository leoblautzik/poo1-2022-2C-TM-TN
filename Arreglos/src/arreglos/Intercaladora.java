package arreglos;

public class Intercaladora {

	public int[] intercalar(int [] a, int [] b) {
		int [] c = new int[a.length + b.length];
		int i = 0;
		int j = 0;
		int k = 0;

		for (k = 0; k < c.length; k++) {

			if (i < a.length && j < b.length && a[i] <= b[j]) {
				c[k] = a[i];
				i++;
			} 
			else if (j < b.length){
				c[k] = b[j];
				j++;
			}
		}
		return c;
	}

	public static void main(String[] args) {
		Intercaladora inter = new Intercaladora();
		int []a = {1,3};
		int []b = {2,7};
		int []c = inter.intercalar(b,a);
		Guia1Arreglos.mostrarArreglo(c);
		
		

	}

}
