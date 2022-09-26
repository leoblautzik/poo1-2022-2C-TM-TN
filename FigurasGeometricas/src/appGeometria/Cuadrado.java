package appGeometria;

public class Cuadrado extends Figura {
	
	private double lado;
	
	public Cuadrado( double lado, Punto punto) {
		super(punto);
		this.lado = lado;
	}

	@Override
	public double getArea() {
		return this.lado * this.lado;
	}

	public Punto getInferiorIzquierdo() {
		
		return super.getPunto();
	}

}
