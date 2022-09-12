package cuentasBancarias;

public class CajaDeAhorro {

	private double saldo;
	private String titular;

	/**
	 * post: la instancia queda asignada al titular indicado y con saldo igual a 0.
	 */
	public CajaDeAhorro(String titularDeLaCuenta) {
		this.titular = titularDeLaCuenta;
		this.saldo = 0;
	}

	/**
	 * post: devuelve el nombre del titular de la Caja de Ahorro.
	 */
	public String obtenerTitular() {
		return this.titular;
	}

	/**
	 * post: devuelve el saldo de la Caja de Ahorro.
	 */
	public double consultarSaldo() {
		return this.saldo;
	}

	/**
	 * pre : monto es un valor mayor a 0. post: aumenta el saldo de la Caja de
	 * Ahorro según el monto depositado.
	 */
	public void depositar(double monto) {
		if (esMontoValido(monto))
			this.saldo += monto;
	}

	/**
	 * pre : monto es mayor a 0 y menor o igual que el saldo de la Caja de Ahorro.
	 * post: disminuye el saldo de la Caja de Ahorro según el monto extraído.
	 */
	public void extraer(double monto) {
		if (esMontoValido(monto) && puedoExtraer(monto)) {
			saldo -= monto;
		}
	}

	private boolean esMontoValido(double monto) {
		if (monto <= 0) {
			throw new Error("Monto inválido");
		} else
			return true;

	}

	private boolean puedoExtraer(double monto) {
		if (saldo < monto) {
			System.err.println("No te alcanza ;-)");
			return false;
		}

		else
			return true;
	}

}
