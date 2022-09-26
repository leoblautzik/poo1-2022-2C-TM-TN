package encapsulamiento;

import java.util.Arrays;
import java.util.Objects;

public class Nota implements Comparable<Nota> {

	private Integer valorNota;

	/**
	 * pre : valorInicial está comprendido entre 0 y 10. post: inicializa la Nota
	 * con el valor indicado.
	 */

	public Nota(int valorInicial) {
		if (valorInicial < 0 || valorInicial > 10)
			throw new Error("Nota inválida");
		valorNota = valorInicial;

	}

	/**
	 * post: devuelve el valor numérico de la Nota, comprendido entre 0 y 10.
	 */
	public Integer obtenerValor() {
		return this.valorNota;
	}

	/**
	 * post: indica si la Nota permite o no la aprobación.
	 */
	public boolean aprobado() {
		return this.obtenerValor() >= 4;
	}

	/**
	 * pre : nuevoValor está comprendido entre 0 y 10. post: modifica el valor
	 * numérico de la Nota, cambiándolo por nuevoValor, siempre y cuando nuevoValor
	 * sea superior al valor numérico actual de la Nota.
	 */
	public void recuperar(int nuevoValor) {
		if (nuevoValor < 0 || nuevoValor > 10)
			throw new Error("Nota inválida");

		if (nuevoValor > this.obtenerValor())
			this.valorNota = nuevoValor;

	}

	@Override
	public int hashCode() {
		return Objects.hash(valorNota);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Nota other = (Nota) obj;
		return valorNota == other.valorNota;
	}

	@Override
	public int compareTo(Nota o) {
		/*
		 * if(this.obtenerValor() < o.obtenerValor()) return -1; else
		 * if(this.obtenerValor() > o.obtenerValor()) return 1; else return 0;
		 */
		
		return -1 * Integer.compare(this.obtenerValor(), o.obtenerValor());
		
		//return this.obtenerValor().compareTo(o.obtenerValor());
		
	}

	
	public static void main(String[] args) {
		Nota [] notas = new Nota[4];
		notas[0] =  new Nota(10);
		notas[1] =  new Nota(6);
		notas[2] =  new Nota(7);
		notas[3] =  new Nota(9);
		
		for (Nota cadaNota : notas) {
			System.out.println(cadaNota.valorNota + " Aprobado: " + cadaNota.aprobado());
		}
		
		Arrays.sort(notas);
		System.out.println( "");
		for (Nota cadaNota : notas) {
			System.out.println(cadaNota.valorNota + " Aprobado: " + cadaNota.aprobado());
		}
		
		
	}
	


}
