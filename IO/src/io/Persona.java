package io;

public class Persona implements Comparable<Persona>{
	
	private int dni;
	private String apellido;
	private int edad;

	public Persona(int dni, String apellido, int edad) {
		super();
		this.dni = dni;
		this.apellido = apellido;
		this.edad = edad;
	}

	protected int getEdad() {
		return edad;
	}

	@Override
	public String toString() {
		return dni + ", " + apellido + ", " + edad;
	}

	@Override
	public int compareTo(Persona o) {
		return this.apellido.compareTo(o.apellido);
	}
	
	

}
