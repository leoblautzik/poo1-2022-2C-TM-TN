package cuentasBancarias;

public class CajaDeAhorro extends CuentaBancaria{

	
	public CajaDeAhorro(String titularDeLaCuenta) {
		super(titularDeLaCuenta);
	}
	
	@Override
	protected boolean haySaldoSuficiente(double monto) {
		return super.consultarSaldo() >= monto;
	}

	

}
