package tnoche;

public abstract class Figura implements Comparable<Figura>{
	
	private double area;
	
	public Figura(double area) {
		this.area = area;
		
	}
	
	public final double getArea() {
		return this.area;
	}
	
	@Override
	public int compareTo(Figura f) {
		return (-1) * Double.compare(this.getArea(), f.getArea());
	}

}
