package cuentaCompartida;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class CuentaCompartida {

	private ArrayList<List<Consumo>> cuenta;
	private double cubierto;

	public CuentaCompartida(int n, double cubierto) {
		this.cubierto = cubierto;
		
		this.cuenta = new ArrayList<List<Consumo>>();
		for (int i = 0; i < n; i++) {
			cuenta.add(new ArrayList<Consumo>());
		}
		

	}

	public void agregarConsumo(int comensal, String descripcion, double precio) {
		if (comensal > cuenta.size())
			throw new Error("Excede la cantidad de comensales");
		cuenta.get(comensal - 1).add(new Consumo(descripcion, precio));

	}

	public String consultarConsumosDelComensal(int comensal) {
		String s = "Consumos del comensal: " + comensal +"\n";
		for (Consumo cadaUno : cuenta.get(comensal - 1)) {
			s += cadaUno.getDescripcion();
			s += "     ";
			s += cadaUno.getPrecio();
			s += "\n";
		}
		return s;
	}
	
	public double obtenerImporteApagarPorElComensal(int comensal) {
		double total = 0;
		for (Consumo cadaUno : cuenta.get(comensal - 1)) {
			total += cadaUno.getPrecio();
		}
		return total + this.cubierto;
	}
	
	public void consultarConsumoMaximo() {
		Consumo candidato = new Consumo("", 0);
		int comensalAbusivo = 0;
		for (int i = 0; i < cuenta.size(); i++) {
			for(Consumo cadaConsumo : cuenta.get(i)) {
				if(cadaConsumo.getPrecio() > candidato.getPrecio()) {
					candidato = cadaConsumo;
					comensalAbusivo = i;
				}
					
			}
		}
		System.out.println("El comsumo maximo fue:");
		System.out.println(candidato);
		System.out.println("Pedido por: " + (comensalAbusivo+1));
		
	}
	
	public void exportarCuenta(String archivo) throws FileNotFoundException {
		PrintWriter pr = new PrintWriter(new File(archivo));
		pr.println("Bodegon La Curva");
		for (int i = 1; i <= cuenta.size(); i++) {
			pr.print(consultarConsumosDelComensal(i)); 
		}
		pr.close();
	}

	public static void main(String[] args) throws FileNotFoundException {
		CuentaCompartida c = new CuentaCompartida(2, 100);
		c.agregarConsumo(2, "Pastel de papas", 650.00);
		c.agregarConsumo(1, "Vino de la casa", 500.00);
		c.agregarConsumo(1, "Costillar", 6500.00);
		System.out.println(c.consultarConsumosDelComensal(1));
		System.out.println(c.obtenerImporteApagarPorElComensal(2));
		c.consultarConsumoMaximo();
		c.exportarCuenta("miCena.out");

	}

}
