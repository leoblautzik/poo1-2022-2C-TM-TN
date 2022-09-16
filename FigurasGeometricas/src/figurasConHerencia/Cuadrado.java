package figurasConHerencia;

public class Cuadrado extends Figura {
	
	private double lado;
	
	public Cuadrado(Color color, double lado) {
		super(color);
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	@Override
	public double getArea() {
		return this.getLado() * this.getLado();
	}

	@Override
	public double getPerimetro() {
		return 4 * this.getLado();
	}

}
