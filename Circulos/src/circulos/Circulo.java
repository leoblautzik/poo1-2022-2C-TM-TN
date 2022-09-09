package circulos;

public class Circulo {

	private double diametro;
	private Punto centro;

	public Circulo(double radio, Punto centro) {
		setDiametro(radio * 2);
		this.centro = centro;
	}

	private void setDiametro(double diametro) {
		if (diametro <= 0)
			throw new Error("Valor inválido");
		this.diametro = diametro;
	}

	public double obtenerDiametro() {
		return this.diametro;
	}

	public double obtenerRadio() {
		// return this.diametro / 2;
		return this.obtenerDiametro() / 2;
	}

	public double obtenerPerimetro() {
		return Math.PI * this.obtenerDiametro();
	}

	public double obtenerArea() {
		return Math.PI * this.obtenerRadio() * this.obtenerRadio();
	}

	public void cambiarRadio(double nuevoRadio) {
		setDiametro(nuevoRadio * 2);
	}

	public void cambiarDiametro(double nuevoDiametro) {
		setDiametro(nuevoDiametro);
	}

	public void cambiarPerimetro(double nuevoPerimetro) {
		setDiametro(nuevoPerimetro / Math.PI);
	}

	public void cambiarArea(double nuevaArea) {
		setDiametro(Math.sqrt(4 * nuevaArea / Math.PI));
	}

	public boolean intersectaCon(Circulo c2) {

		double r1 = this.obtenerRadio();
		double r2 = c2.obtenerRadio();
		double distanciaEntreCentros = this.centro.distanciaAotroPunto(c2.centro);

		return((r1 + r2) >= distanciaEntreCentros);

	}

}
