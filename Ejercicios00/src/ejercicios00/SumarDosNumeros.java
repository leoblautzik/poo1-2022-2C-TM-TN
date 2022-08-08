package ejercicios00;

import java.util.Scanner;

public class SumarDosNumeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Leo los numeros a sumar
		System.out.println("ingrese el primer número");
		int a = sc.nextInt();
		System.out.println("ingrese el segundo número");
		int b = sc.nextInt();
		int suma = a + b;
		double cociente = a * 1.0 / b;
		System.out.println("La suma es: " + suma );
		System.out.println("El cociente es: " + cociente);
		
		if( a % 2 == 0) {
			System.out.println("el primer valor es par");
		}
		else {
			System.out.println("el primer valor es impar");
		}
		
		if( b % 2 == 0) {
			System.out.println("el segundo valor es par");
		}
		else {
			System.out.println("el segundo valor es impar");
		}
		
		
		
		
		
		
	}

}
