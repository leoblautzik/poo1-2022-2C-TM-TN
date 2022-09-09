package figuras;

public class CoronaCircular {
	private Circulo cChico;
	private Circulo cGrande;
	private Punto centro;

	public CoronaCircular(double radioMenor, double radioMayor, Punto centro) {
		this.cChico = new Circulo(radioMenor, centro);
		this.cGrande = new Circulo(radioMayor, centro);

	}
	
	public double getArea() {
		return cGrande.getArea() - cChico.getArea();
	}

	public double getPerimetroInterior() {
		return cChico.getPerimetro();
	}

	public double getPerimetroExterior() {
		return cGrande.getPerimetro();
	}

	public void cambiarRadioInterior(double nuevoRadio) {
		if (nuevoRadio >= this.cGrande.getRadio())
			throw new Error("El nevo radio es mayor al radio exterior");
		this.cChico = new Circulo(nuevoRadio, this.centro);

	}

	public void cambiarRadioExterior(double nuevoRadio) {
		if (nuevoRadio <= this.cChico.getRadio())
			throw new Error("El nevo radio es menor que el radio interior");
		this.cGrande = new Circulo(nuevoRadio, this.centro);

	}

}
