package circulos;

public class CoronaCircular {

	private Circulo grande;
	private Circulo chico;
	private Punto centro;

	public CoronaCircular(double radioMayor, double radioMenor, double x, double y) {
		this.centro = new Punto(x, y);
		this.grande = new Circulo(radioMayor, centro);
		this.chico = new Circulo(radioMenor, centro);
	}

	public double obtenerArea() {
		return grande.obtenerArea() - chico.obtenerArea();
	}

	public double obtenerRadioMayor() {
		return grande.obtenerRadio();
	}

	public double obtenerRadioMenor() {
		return chico.obtenerRadio();
	}

	public double obtenerPerimetroExterior() {
		return grande.obtenerPerimetro();
	}
	public double obtenerPerimetroInterior() {
		return chico.obtenerPerimetro();
	}

}
