package figurasConHerencia;

public class Test {

	public static void main(String[] args) {
		/*
		 * Circulo c1 = new Circulo(Color.ROJO, 2); Figura c2 = new Circulo(Color.VERDE,
		 * 4); Circulo c3; if(c2 instanceof Circulo) { c3 = (Circulo)c2;
		 * System.out.println(c3.getRadio()); }
		 * 
		 * Circulo c5 = new Circulo(Color.ROJO, 2);
		 * 
		 * System.out.println("****" + c5.equals(c1));
		 * 
		 * System.out.println(c1.getRadio());
		 * 
		 * Figura cuadradito = new Cuadrado(Color.VIOLETA,5); Triangulo triangulito =
		 * new Triangulo(Color.AMARILLO, 4, 6);
		 * 
		 * Figura figuras [] = new Figura[3]; figuras[0] = c1; figuras[1] = cuadradito;
		 * figuras[2] = triangulito;
		 * 
		 * for (Figura cadaFigura : figuras) { System.out.println(cadaFigura.getArea() +
		 * " " + cadaFigura.getColor());
		 * 
		 * }
		 * 
		 * for (Figura cadaUna : figuras) { System.out.println(cadaUna.getPerimetro());
		 * }
		 */
		
		Triangulo t1 = new Triangulo(Color.AZUL, 3 ,4);
		Triangulo t2 = new Triangulo(Color.AZUL, 3 ,4);
		System.out.println(t1 == t2);
		System.out.println(t1.equals(t2));
		
	}

}
