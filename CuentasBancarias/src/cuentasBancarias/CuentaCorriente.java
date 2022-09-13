package cuentasBancarias;

public class CuentaCorriente extends Cuenta{

	private double descubierto;

	public CuentaCorriente(String titular, double descubierto) {
		super(titular);
		this.descubierto = descubierto;
	}
	
	@Override	
	public boolean puedoExtraer(double monto) {
		 return monto <= getSaldo() + descubierto;
	}
	
	
	
}
