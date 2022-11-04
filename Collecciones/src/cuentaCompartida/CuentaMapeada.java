package cuentaCompartida;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CuentaMapeada {

	private Map<Integer, ArrayList<Consumo>> cuenta;
	private double cubierto;
	int cantComensales;

	public CuentaMapeada(int n, double cubierto) {
		this.cuenta = new HashMap<Integer, ArrayList<Consumo>>();
		this.cubierto = cubierto;
		this.cantComensales = n;
	}

	public void agregarConsumo(int comensal, String descripcion, double precio) {
		ArrayList<Consumo> listaAux;
		if (comensal > this.cantComensales)
			throw new Error("Excede la cantidad de comensales");

		if (cuenta.containsKey(comensal))
			listaAux = cuenta.get(comensal);
		else
			listaAux = new ArrayList<Consumo>();

		listaAux.add(new Consumo(descripcion, precio));
		cuenta.put(comensal, listaAux);
	}
	
	public String consultarConsumosDelComensal(int comensal) {
		String s = "Consumos del comensal: " + comensal +"\n";
		for(Consumo c : cuenta.get(comensal)) {
			s += c.getDescripcion();
			s += "     ";
			s += c.getPrecio();
			s += "\n";
		}
		return s;
	
	}
	
	public void imprimirFactura(String archivo) throws FileNotFoundException {
		double importe, total = 0;
		PrintWriter pr = new PrintWriter(new File(archivo));
		
		for (Map.Entry<Integer, ArrayList<Consumo>> entry : cuenta.entrySet()) {
			Integer key = entry.getKey();
			ArrayList<Consumo> val = entry.getValue();
			
			
			importe = 0;
			pr.println("Consumos del comensal  " + key);
			
			for (Consumo consumo : val) {
				pr.println(consumo);
				importe += consumo.getPrecio();
			}
			pr.println("Importe comensal  " + key +": " + importe);
			
			total += importe;
		
		}
		pr.println("Cubiertos " + this.cubierto * this.cantComensales);
		pr.println("Total:  " + (total + this.cubierto * this.cantComensales));
		
		pr.close();
		
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		CuentaMapeada cm = new CuentaMapeada(2, 150);
		cm.agregarConsumo(1, "Sopa", 300);
		cm.agregarConsumo(2, "Flan", 600);
		cm.agregarConsumo(1, "Grande de Muzza", 2000);
		cm.agregarConsumo(2, "Ensalada", 700);
		
		System.out.println(cm.consultarConsumosDelComensal(1));
		cm.imprimirFactura("Factura.out");
	}

}
