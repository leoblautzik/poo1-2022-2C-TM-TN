package salaDeCine;

public class SalaDeCine {
	private boolean[][] sala;

	public SalaDeCine(int butacas, int filas) {
		this.sala = new boolean[filas][butacas / filas];
	}

	public boolean estaOcupada(int fila, int asiento) {
		return sala[fila][asiento];
	}

	public void ocuparButaca(int fila, int asiento) {
		if (!sala[fila][asiento])
			sala[fila][asiento] = true;
	}

	public int cantidadDeButacasOcupadas() {
		int cantidadDeButacasOcupadas = 0;
		for (int i = 0; i < sala.length; i++)
			for (int j = 0; j < sala[i].length; j++)
				if (estaOcupada(i, j))
					cantidadDeButacasOcupadas++;
		return cantidadDeButacasOcupadas;
	}

	boolean hayEspacioPara(int cantidadDePersonas) {
		boolean hayLugar = false;
		int i = 0;
		while (i < sala.length && !hayLugar) {
			int contadorDeContiguos = 0;
			int j = 0;
			while (j < sala[i].length && !hayLugar) {
				if (!estaOcupada(i, j)) {
					contadorDeContiguos++;
					if (contadorDeContiguos >= cantidadDePersonas)
						hayLugar = true;
				} else
					contadorDeContiguos = 0;
				j++;
			}
			i++;
		}
		return hayLugar;
	}

	public static void main(String[] args) {
		SalaDeCine cinema = new SalaDeCine(12, 3);
		// cinema.ocuparButaca(0, 0);
		// cinema.ocuparButaca(0, 1);
		cinema.ocuparButaca(0, 2);
		cinema.ocuparButaca(0, 3);
		cinema.ocuparButaca(1, 0);
		cinema.ocuparButaca(1, 1);
		cinema.ocuparButaca(1, 2);
		cinema.ocuparButaca(1, 3);
		cinema.ocuparButaca(2, 0);
		cinema.ocuparButaca(2, 1);
		cinema.ocuparButaca(2, 2);
		cinema.ocuparButaca(2, 3);

		System.out.println(cinema.estaOcupada(2, 2));
		System.out.println(cinema.hayEspacioPara(2));

	}

}