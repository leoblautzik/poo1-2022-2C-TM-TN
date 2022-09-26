package appGeometria;

public class Segmento implements Comparable<Segmento>, Desplazable, EsParalelo {

	private Punto a;
	private Punto b;

	public Segmento(Punto a, Punto b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public void desplazar(double deltaX, double deltaY) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compareTo(Segmento otroSegmento) {
		return Double.compare(this.a.distanciaAotroPunto(this.b), otroSegmento.a.distanciaAotroPunto(otroSegmento.b));
	}

	@Override
	public boolean esParaleloAx() {
		return this.a.getY() == this.b.getY();
	}

	@Override
	public boolean esParaleloAy() {
		return this.a.getX() == this.b.getX();
	}

	@Override
	public boolean esParalelo(Segmento s) {
		Double pendiente1 = (this.b.getY() - this.a.getY()) / (this.b.getX() - this.a.getX());
		Double pendiente2 = (s.b.getY() - s.a.getY()) / (s.b.getX() - s.a.getX());

		return pendiente1.equals(pendiente2);
	}

}
