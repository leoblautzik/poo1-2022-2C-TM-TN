package io;

public class Persona {
	
	private int dni;
	private String apellido;
	private int edad;

	public Persona(int dni, String apellido, int edad) {
		super();
		this.dni = dni;
		this.apellido = apellido;
		this.edad = edad;
	}

	protected int getDni() {
		return dni;
	}

	protected void setDni(int dni) {
		this.dni = dni;
	}

	protected String getApellido() {
		return apellido;
	}

	protected void setApellido(String apellido) {
		this.apellido = apellido;
	}

	protected int getEdad() {
		return edad;
	}

	@Override
	public String toString() {
		return dni + ", " + apellido + ", " + edad;
	}

	
	
	

}
