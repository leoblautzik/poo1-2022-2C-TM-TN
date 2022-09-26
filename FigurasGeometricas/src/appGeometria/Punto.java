package appGeometria;

import java.util.Objects;

public class Punto implements Desplazable{
	
	private double x;
	private double y;
	
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	
	public boolean estaSobreEjeX() {
		return this.getY() == 0;
	}
	
	public boolean estaSobreEjeY() {
		return this.getX() == 0;
	}
	
	public boolean esElOrigen() {
		return estaSobreEjeX() && estaSobreEjeY();
	}


	
	public double getDistanciaAlOrigen() {
		return this.distanciaAotroPunto(new Punto(0,0));
	}
	
	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}

	@Override
	public void desplazar(double deltaX, double deltaY) {
		this.x += deltaX;
		this.y += deltaY;
	}
	
	public double distanciaAotroPunto(Punto op) {
		return Math.hypot(this.getX() - op.getX(), this.getY() - op.getY());
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punto other = (Punto) obj;
		return Double.doubleToLongBits(x) == Double.doubleToLongBits(other.x)
				&& Double.doubleToLongBits(y) == Double.doubleToLongBits(other.y);
	}
	
	
	
	
	

}
