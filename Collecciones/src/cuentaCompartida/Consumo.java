package cuentaCompartida;

public class Consumo {
	
	@Override
	public String toString() {
		return descripcion + "     " + precio;
	}

	private String descripcion;
	private double precio;
	
	public Consumo(String descripcion, double precio) {
		
		this.descripcion = descripcion;
		this.precio = precio;
	}

	protected String getDescripcion() {
		return descripcion;
	}

	protected double getPrecio() {
		return precio;
	}

}
