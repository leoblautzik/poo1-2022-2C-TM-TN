package appGeometria;

public abstract class Figura implements Comparable<Figura>, Desplazable {
	
	Punto punto;
	
	public Figura(Punto punto) {
		this.punto = punto;
	}
	
	
	
	protected Punto getPunto() {
		return punto;
	}



	public abstract double getArea();
	
	@Override
	public int compareTo(Figura f) {
		return Double.compare(this.getArea(), f.getArea());
	}
	
	@Override
	public void desplazar(double deltaX, double deltaY) {
		this.punto.desplazar(deltaX, deltaY);
	}

	

}
