package cuentaCompartida;

import java.util.ArrayList;
import java.util.List;

public class CuentaCompartidaArray {
	
	private Object [] cuenta;
	
	public CuentaCompartidaArray(int n, double cubierto) {
		this.cuenta= new Object[n]; 
		
		
		  for(int i = 0; i < cuenta.length; i++) { cuenta[i] = new
		  ArrayList<Consumo>(); }
			
	}
	
	
	@SuppressWarnings("unchecked")
	public void agregarConsumo(int comensal, String detalle, double precio) {
		List<Consumo> lista = (List<Consumo>) cuenta[comensal -1];
		lista.add(new Consumo(detalle, precio));
	}
	
	@SuppressWarnings("unchecked")
	public String consultarConsumosDelComensal(int comensal) {
		String s = "Consumos del comensal: " + comensal +"\n";
		for (Consumo cadaUno : (List<Consumo>) cuenta[comensal -1]) {
			s += cadaUno.getDescripcion();
			s += "     ";
			s += cadaUno.getPrecio();
			s += "\n";
		}
		return s;
	}

	public static void main(String[] args) {
		
		CuentaCompartidaArray cca = new CuentaCompartidaArray(3, 200);
		cca.agregarConsumo(3, "Helado", 450);
		System.out.println(cca.consultarConsumosDelComensal(3));
	}

}
