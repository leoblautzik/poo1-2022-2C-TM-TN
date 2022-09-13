package cuentasBancarias;

public class CajaDeAhorro extends Cuenta {

	public CajaDeAhorro(String titular) {
		super(titular);
	}

	@Override
	public boolean puedoExtraer(double monto) {
		return monto <= getSaldo();
	}
	
	
}
