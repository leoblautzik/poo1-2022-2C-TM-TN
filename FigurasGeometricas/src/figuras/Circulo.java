package figuras;


public class Circulo {
	
	private double diametro;
	private Punto centro;
	
	public Circulo(double radio) { //r es el parametro
		setDiametro(radio *2);
		this.centro = new Punto(0,0);
	}
	
	public Circulo(double radio, Punto c) { //r es el parametro
		setDiametro(radio *2);
		this.centro = c;
	}
	
	private void setDiametro(double diametro) {
		this.diametro = diametro;
	}
	
	protected void setRadio(double nuevoRadio) {
		this.setDiametro(nuevoRadio * 2);
	}
	
	public double getRadio() {
		return getDiametro() / 2;
	}
	
	public double getDiametro() {
		return diametro;
	}
	
	public double getPerimetro() {
		return 2 * Math.PI * getRadio();
	}
	
	public double getArea() {
		return Math.PI * Math.pow(getRadio(), 2);
	}
	
	
	public String toString() {
		return "Soy un circulo de radio: " + getRadio();
	}
	
	void mover(double deltaX, double deltaY) {
		centro.mover(deltaX, deltaY);
	}

	public static void main(String[] args) {
		Circulo c1 = new Circulo(3);
		Circulo c2 = new Circulo(2);
		Circulo c3 = new Circulo(8);
		Circulo c4 = new Circulo(31);
		System.out.println(c1.getDiametro());
		System.out.println(c2.getRadio());
		System.out.println(c3.getArea());
		System.out.println(c4.getPerimetro());

	}

	

}
