package salaDeCine;

public class SalaDeCine {
	private boolean[][] sala;

	public SalaDeCine(int butacas, int filas) {
		//falta validar que butacas / filas sea entero
		if(butacas == 0 || butacas ==0 || butacas / filas != 0)
			throw new Error("Valores incorrectos");
		this.sala = new boolean[filas][butacas / filas];
	}

	public boolean estaOcupada(int fila, int asiento) {
		if (!sonValidos(fila, asiento))
			throw new Error("No existe ese asiento");
		return sala[fila-1][asiento-1];
	}

	private boolean sonValidos(int fila, int asiento) {
		
		return fila > 0 && fila <= sala.length 
				&& asiento > 0 && asiento <= sala[fila].length;
	}

	public void ocuparButaca(int fila, int asiento) {
		if (!sonValidos(fila, asiento))
			throw new Error("No existe ese asiento");
		if (!sala[fila-1][asiento-1])
			sala[fila-1][asiento-1] = true;
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
				if (!estaOcupada(i+1, j+1)) {
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
		// cinema.ocuparButaca(1, 1);
		// cinema.ocuparButaca(1, 2);
		cinema.ocuparButaca(1, 3);
		cinema.ocuparButaca(1, 4);
		cinema.ocuparButaca(2, 1);
		cinema.ocuparButaca(2, 2);
		cinema.ocuparButaca(2, 3);
		cinema.ocuparButaca(2, 4);
		cinema.ocuparButaca(3, 1);
		cinema.ocuparButaca(3, 2);
		cinema.ocuparButaca(3, 3);
		cinema.ocuparButaca(3, 4);
		System.out.println(cinema.estaOcupada(2, 2));
		System.out.println(cinema.hayEspacioPara(2));

	}

}