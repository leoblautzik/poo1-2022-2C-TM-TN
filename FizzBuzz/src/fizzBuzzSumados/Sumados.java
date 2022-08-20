package fizzBuzzSumados;

public class Sumados {

	int suma(int i) {
		if (i == 1)
			return 1;
		return i + suma(i - 1);
	}

	public static void main(String[] args) {
		Sumados s = new Sumados();
		for (int i = 1; i <= 100000; i++) {
			System.out.println(s.suma(i));
		}
	}

}
