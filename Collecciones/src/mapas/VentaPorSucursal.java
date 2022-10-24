package mapas;

public class VentaPorSucursal {
	
	private int codSucursal;
	private double montoDeVenta;
	
	public VentaPorSucursal(int codSucursal, double montoDeVenta) {
		super();
		this.codSucursal = codSucursal;
		this.montoDeVenta = montoDeVenta;
	}
	protected int getCodSucursal() {
		return codSucursal;
	}
	protected double getMontoDeVenta() {
		return montoDeVenta;
	}
	
	
	
	

}
