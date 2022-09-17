package cuentasBancarias;

public class CuentaCorriente extends CuentaBancaria {
	
	private double descubierto;
	
	public CuentaCorriente(String titular, double descubierto) {
		super(titular);
		this.descubierto = descubierto;
	}

	@Override
	protected boolean haySaldoSuficiente(double monto) {
		return super.consultarSaldo() + this.descubierto >= monto;
	}
	
	public double consultarDescubierto() {
		return this.descubierto;
	}


}
