package tnoche;

import java.util.Arrays;

public class DemoFiguras {
	
	public static void main(String[] args) {
		Circulo circulito = new Circulo(2);
		Rectangulo rectangulito = new Rectangulo(4, 2);
		Triangulo triangulito = new Triangulo(4,2);
		Elipse elipsita = new Elipse(4, 2);
		Cuadrado cuadradito = new Cuadrado(4);
		
		/*
		 * Figura [] figuras = new Figura[5]; figuras[0] = circulito; figuras[1] =
		 * rectangulito; figuras[2] = triangulito; figuras[3] = elipsita; figuras[4] =
		 * cuadradito;
		 */
		
		Figura [] figuras = {circulito, rectangulito, triangulito, elipsita, cuadradito};
		
		for (Figura figura : figuras) 
			System.out.println(figura.getArea());
		
		
		double areaTotal = 0;
		for (Figura figura : figuras) 
				areaTotal += figura.getArea();
		System.out.println();
		System.out.println(areaTotal);
		
		Arrays.sort(figuras);
		System.out.println();
		for (Figura figura : figuras) 
			System.out.println(figura.getArea());
				
	}
	
	
	
	
	

}
