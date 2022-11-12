package segundoParcialVentasPorProducto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Ventas {
	
	private Map<String, Integer> ventasPorProducto;

	public Ventas() {
		this.ventasPorProducto = new TreeMap<String, Integer>();
	}

	public void leerVentas(String archivoDeEntrada) throws IOException {
		FileReader fr = new FileReader(new File(archivoDeEntrada));
		BufferedReader br = new BufferedReader(fr);
		String datos[];
		String linea = br.readLine();
		while (linea != null) {
			datos = linea.split(" ");
			String codPro = datos[0];
			try {
				Integer cantVendida = Integer.parseInt(datos[1]);
				if (cantVendida < 1 || cantVendida > 1000)
					throw new CantidadInvalidaException("Dato incorrecto");
				
				if (ventasPorProducto.containsKey(codPro))
					cantVendida += ventasPorProducto.get(codPro);

				ventasPorProducto.put(codPro, cantVendida);

			} catch (CantidadInvalidaException e) {
				e.printStackTrace();
			}

			linea = br.readLine();
		}
		fr.close();

	}

	

	public void escribirVentasPorProducto(String archivoDeSalida) throws IOException {
		
		PrintWriter salida = new PrintWriter(new FileWriter(archivoDeSalida));
		
		for (Entry<String,Integer> cu : ventasPorProducto.entrySet()) {
			String clave = cu.getKey(); 
			Integer valor = cu.getValue();
			
			salida.println(clave + " " + valor);
			
		}
		salida.close();
	
	}

	public static void main(String[] args) throws IOException {
		
		Ventas ventas = new Ventas();
		
		ventas.leerVentas("ventas.in");
		ventas.escribirVentasPorProducto("ventasPorProducto.out");
		
	}
	
	
}
