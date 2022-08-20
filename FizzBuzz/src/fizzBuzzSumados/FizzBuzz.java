package fizzBuzzSumados;

public class FizzBuzz {

	public void fizzBuzzA() {
		for (int i = 1; i <= 20; i++) {
			if (i % 3 == 0 && i % 5 != 0)
				System.out.println("Fizz");
			else if (i % 3 != 0 && i % 5 == 0)
				System.out.println("Buzz");
			else if (i % 3 == 0 && i % 5 == 0)
				System.out.println("FizzBuzz");
			else
				System.out.println(i);
		}
	}

	public void fizzBuzzB() {
		for (int i = 1; i <= 20; i++) {
			if (i % 15 == 0)
				System.out.println("FizzBuzz");
			else if (i % 3 == 0)
				System.out.println("Fizz");
			else if (i % 5 == 0)
				System.out.println("Buzz");
			else
				System.out.println(i);
		}
	}

	public void fizzBuzzC() {
		String fizzy;
		Integer i;
		for (i = 1; i <= 20; i++) {
			if (i % 15 != 0)
				if (i % 3 == 0)
					fizzy = "Fizz";
				else if (i % 5 == 0)
					fizzy = "Buzz";
				else
					fizzy = i.toString();
			else
				fizzy = "FizzBuzz";
			System.out.println(fizzy);
		}
	}

	public void fizzBuzzOpT() {
		for (int i = 1; i <= 20; i++) {
			System.out.println((i % 15 == 0) ? "FizzBuzz" : (i % 3 == 0) ? "Fizz" : (i % 5 == 0) ? "Buzz" : i);
		}
	}

	public void fizzBuzzOpTcool() {
		for (int i = 1; i <= 20; i++) {
			boolean fi = (i % 3 == 0), bu = (i % 5 == 0);
			System.out.println(fi ? bu ? "FizzBuzz" : "Fizz" : bu ? "Buzz" : i);
		}
	}

	public static void main(String[] args) {
		FizzBuzz fb = new FizzBuzz();
		fb.fizzBuzzA();
		System.out.println("------------------------------------");
		fb.fizzBuzzB();
		System.out.println("------------------------------------");
		fb.fizzBuzzC();
		System.out.println("------------------------------------");
		fb.fizzBuzzOpT();
		System.out.println("------------------------------------");
		fb.fizzBuzzOpTcool();
	}

}
