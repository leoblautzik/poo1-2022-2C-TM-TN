package ejercicios00;

import java.util.Scanner;

public class MayorMenor {

	public static void main(String[] args) {
		int a, b, mayor, menor;
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese un valor");
		a = sc.nextInt();
		System.out.println("Ingrese otro valor");
		b = sc.nextInt();

		mayor = a;
		menor = b;
		
		if (a < b) {
			mayor = b;
			menor = a;
		} 

		System.out.println("El mayor es: " + mayor);
		System.out.println("El menor es: " + menor);

	}

}
