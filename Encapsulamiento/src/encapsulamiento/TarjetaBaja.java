package encapsulamiento;

class TarjetaBaja {

	private double saldo;
	private static final double VALOR_VIAJE_EN_COLECTIVO = 21.50;
	private static final double VALOR_VIAJE_EN_SUBTE = 19.50;
	private int cantidadDeViajesEnColectivo;
	private int cantidadDeViajesEnSubte;

	/**
	 * post: saldo de la Tarjeta en saldoInicial.
	 */
	public TarjetaBaja(double saldoInicial) {
		setSaldo(saldoInicial);
		this.cantidadDeViajesEnColectivo = 0;
		this.cantidadDeViajesEnSubte = 0;
	}

	public TarjetaBaja() {
		this(0);
	}

	private void setSaldo(double saldoInicial) {
		if (saldoInicial < 0)
			throw new Error("Saldo inicial incorrecto");
		this.saldo = saldoInicial;
	}

	/**
	 * post: devuelve el saldo actual de la Tarjeta
	 */
	public double obtenerSaldo() {
		return this.saldo;
	}

	/**
	 * post: agrega el monto al saldo de la Tarjeta.
	 */
	public void cargar(double monto) {
		if (monto <= 0)
			throw new Error("Monto inválido");
		setSaldo(this.obtenerSaldo() + monto);
	}

	/**
	 * pre : saldo suficiente. post: utiliza 21.50 del saldo para un viaje en
	 * colectivo.
	 */
	public void pagarViajeEnColectivo() {
		if (!AlcanzaParaViajarEnColectivo())
			throw new Error("Bajate!!");
		cantidadDeViajesEnColectivo ++;
		setSaldo(this.obtenerSaldo() - VALOR_VIAJE_EN_COLECTIVO);
	}

	private boolean AlcanzaParaViajarEnColectivo() {
		return this.obtenerSaldo() >= VALOR_VIAJE_EN_COLECTIVO;
	}

	/**
	 * pre : saldo suficiente. post: utiliza 19.50 del saldo para un viaje en subte.
	 */
	public void pagarViajeEnSubte() {
		if (!AlcanzaParaViajarEnSubte())
			throw new Error("Bajate!!");
		cantidadDeViajesEnSubte ++;
		setSaldo(this.obtenerSaldo() - VALOR_VIAJE_EN_SUBTE);
	}

	private boolean AlcanzaParaViajarEnSubte() {
		return this.obtenerSaldo() >= VALOR_VIAJE_EN_SUBTE;
	}

	/**
	 * post: devuelve la cantidad de viajes realizados.
	 */
	public int contarViajes() {
		return this.cantidadDeViajesEnColectivo +
				this.cantidadDeViajesEnSubte;
	}

	/**
	 * post: devuelve la cantidad de viajes en colectivo.
	 */
	public int contarViajesEnColectivo() {
		return cantidadDeViajesEnColectivo;
	}

	/**
	 * post: devuelve la cantidad de viajes en subte.
	 */
	public int contarViajesEnSubte() {
		return cantidadDeViajesEnSubte;
	}

	public static void main(String[] args) {

	}

}
