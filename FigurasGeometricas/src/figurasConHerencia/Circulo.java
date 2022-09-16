package figurasConHerencia;

import java.util.Objects;

public class Circulo extends Figura{
	
	@Override
	public int hashCode() {
		return Objects.hash(diametro);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circulo other = (Circulo) obj;
		return Double.doubleToLongBits(diametro) == Double.doubleToLongBits(other.diametro);
	}



	private double diametro;
	
	public Circulo(Color color,double radio) { 
		super(color);
		setDiametro(radio *2);
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
	
	

	public static void main(String[] args) {
		/*
		 * Circulo c1 = new Circulo(3); Circulo c2 = new Circulo(2); Circulo c3 = new
		 * Circulo(8); Circulo c4 = new Circulo(31);
		 * System.out.println(c1.getDiametro()); System.out.println(c2.getRadio());
		 * System.out.println(c3.getArea()); System.out.println(c4.getPerimetro());
		 */
	}

	

}
