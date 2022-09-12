package cuentasBancarias;

public abstract  class Cuenta {
	
	private double saldo;
	private String titular;

	public Cuenta(String titularDeLaCuenta) {
		this.titular = titularDeLaCuenta;
		this.saldo = 0;
	}
	
	public abstract boolean puedoExtraer(double monto);

	
	protected double getSaldo() {
		return saldo;
	}

	public void transferir (double monto, Cuenta cDestino) {
		if(puedoExtraer(monto)) {
			cDestino.depositar(monto);
			this.extraer(monto);
		}
	}

	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}


	public String obtenerTitular() {
		return this.titular;
	}

	
	public double consultarSaldo() {
		return this.saldo;
	}

	
	public void depositar(double monto) {
		if (esMontoValido(monto))
			setSaldo(getSaldo() + monto);
	}
	
	
	public void extraer(double monto) {
		if (esMontoValido(monto) && puedoExtraer(monto)) {
			setSaldo(getSaldo() - monto);
		}
	}
	
		
	protected boolean esMontoValido(double monto) {
		if (monto <= 0) {
			throw new Error("Monto inválido");
		} else
			return true;

	}

	

}
