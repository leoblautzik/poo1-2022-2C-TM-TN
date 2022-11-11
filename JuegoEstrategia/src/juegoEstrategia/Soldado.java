package juegoEstrategia;

/*
 * Los soldados pueden atacar cuerpo a cuerpo a otras unidades 
 * si tienen suficiente energía. 
 * Cada ataque les consume 10 puntos de energía, y comienzan con 100. 
 * Restauran energía si reciben la ración de agua. 
 * Infringen un daño de 10 puntos y comienzan con 200 de salud.
 */


public class Soldado extends Unidad implements Bebedor {
	
	private int energia = 100;
	
	protected int getEnergia() {
		return energia;
	}

	public Soldado(int x, int y) {
		super(x, y, 200, 10);

	}

	@Override
	public boolean puedeAtacar(Unidad u) {
		return (super.getPosicion().distanciaAotroPunto(u.getPosicion()) == 0)
				&& (this.energia >= 10) && !this.estaMuerta() && !u.estaMuerta(); 
	}
	
	@Override
	public void beberAgua() {
		this.energia = 100;
		
	}
	
	@Override
	public void atacar(Unidad u) {
		if (this.puedeAtacar(u)) {
			super.infringirDanio(u);
			this.energia -= 10;
		}
	}


}
