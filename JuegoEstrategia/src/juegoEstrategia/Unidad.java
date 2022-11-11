package juegoEstrategia;

public abstract class Unidad {
	
	private Punto posicion;
	private int salud;
	private int danio;
	
	public Unidad(int x, int y, int salud, int danio) {
		this.posicion = new Punto(x,y);
		this.salud = salud;
		this.danio = danio;
		
	}
	
	protected Punto getPosicion() {
		return posicion;
	}

	protected void setPosicion(Punto posicion) {
		this.posicion = posicion;
	}

	protected int getSalud() {
		return salud;
	}

	protected void setSalud(int salud) {
		this.salud = salud;
	}

	public abstract boolean puedeAtacar(Unidad u);
	public abstract void atacar(Unidad u);
	
	
	private void recibirDanio(int danio) {
		this.salud -= danio;
	}
	
	protected void infringirDanio(Unidad u) {
		u.recibirDanio(this.danio);
		
	}
	
	public boolean estaMuerta() {
		return this.getSalud() == 0;
	}

}
