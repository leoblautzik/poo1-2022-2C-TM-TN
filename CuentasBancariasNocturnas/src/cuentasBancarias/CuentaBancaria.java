package cuentasBancarias;

public abstract class CuentaBancaria {
	private double saldo;
	private String titularDeLaCuenta;

	protected abstract boolean haySaldoSuficiente(double monto);

	public CuentaBancaria(String titularDeLaCuenta) {
		this.saldo = 0;
		this.titularDeLaCuenta = titularDeLaCuenta;
	}

	/**
	 * post: devuelve el nombre del titular de la Caja de Ahorro.
	 */
	public String obtenerTitular() {
		return this.titularDeLaCuenta;
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
			saldo += monto;
	}

	/**
	 * pre : monto es mayor a 0 y menor o igual que el saldo de la Caja de Ahorro.
	 * post: disminuye el saldo de la Caja de Ahorro según el monto extraído.
	 */
	public void extraer(double monto) {
		if (esMontoValido(monto) && haySaldoSuficiente(monto))
			saldo -= monto;
	}

	private boolean esMontoValido(double monto) {
		if (monto <= 0)
			throw new Error("Monto inválido");
		else
			return true;
	}

	public void transferir(double monto, CuentaBancaria cuentaDestino) {
		if (this.haySaldoSuficiente(monto)) {
			this.extraer(monto);
			cuentaDestino.depositar(monto);
		}
			
	}

}
