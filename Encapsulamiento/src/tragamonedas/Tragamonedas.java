package tragamonedas;

public class Tragamonedas {

	Tambor [] tambores = new Tambor[3];

	/**
	 * post: los 3 Tambores del Tragamonedas están en la posición 1.
	 */
	public Tragamonedas() {
		for(int i = 0; i < 3; i++)
			this.tambores[i] = new Tambor();
	}

	/**
	 * post: activa el Tragamonedas haciendo girar sus 3 Tambores.
	 */
	public void activar() {
		for(int i = 0; i < 3; i++)
			this.tambores[i].girar();
	}

	/**
	 * post: indica si el Tragamonedas entrega un premio a partir de la posición de
	 * sus 3 Tambores.
	 */
	public boolean entregaPremio() {
		return tambores[0].obtenerPosicion() == tambores[1].obtenerPosicion() &&
				tambores[0].obtenerPosicion() == tambores[2].obtenerPosicion();
		
	}

	/**
	 * post: obtiene la posición del iésimo tambor del Tragamonedas pre: i => 0; i <
	 * n (n = cantidad de tambores)
	 */
	public int obtenerPosicionDelTambor(int i) {
		return this.tambores[i-1].obtenerPosicion();
	}

	public String toString() {
		String display = "";
		for(int i = 0; i < 3; i++)
			display += this.tambores[i].toString();
		return display;
	}

	public static void main(String[] args) {
		Tragamonedas elHonesto = new Tragamonedas();
		int valorPremio = 10000;
		int valorVuelta = 150;
		elHonesto.activar();
		//System.out.println(elHonesto);
		
		int contador = 0;
		while(!elHonesto.entregaPremio()) {
			elHonesto.activar();
			contador ++;
		}
		System.out.println(elHonesto);
		System.out.println("intentos: " + contador);
		
		int gasto = contador * valorVuelta;
		if (gasto > valorPremio)
			System.out.println("Perdiste: " + (gasto - valorPremio) );
		else
			System.out.println("Ganaste: " + (valorPremio - gasto));

	}

}
