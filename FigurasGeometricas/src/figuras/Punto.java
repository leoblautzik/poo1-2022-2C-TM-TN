package figuras;

public class Punto {
	
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
	
	public double getDistanciaAlOrigen() {
		//return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		//return Math.hypot(this.getX(), this.getY());
		return this.distanciaAotroPunto(new Punto(0,0));
	}
	
	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}

	public void mover(double deltaX, double deltaY) {
		this.x += deltaX;
		this.y += deltaY;
	}
	
	public double distanciaAotroPunto(Punto op) {
		return Math.hypot(this.getX() - op.getX(), this.getY() - op.getY());
	}
	
	
	
	
	

}
