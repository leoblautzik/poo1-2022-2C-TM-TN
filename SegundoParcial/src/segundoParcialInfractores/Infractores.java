package segundoParcialInfractores;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Infractores {

	private Map<String, Integer> infractores = new HashMap<String, Integer>();

	public Infractores() {

	}

	public void leerInfractores(String entrada) throws IOException {
		FileReader fr = new FileReader(new File(entrada));
		BufferedReader br = new BufferedReader(fr);
		String datos[];
		Integer cuantasMultas = 0;

		String linea = br.readLine();
		while (linea != null) {
			datos = linea.split(" ");
			String patente = datos[0];
			Integer velocidad = Integer.parseInt(datos[1]);
			if (velocidad > 80) {
				// Preguntamos si la clave(patente) esta en el mapa
				if (infractores.containsKey(patente)) {
					cuantasMultas = infractores.get(patente);
					// mapa.get(key) devuelve el value
					cuantasMultas++;
				} // Si no contiene la clave
				else {
					cuantasMultas = 1;
				}
				infractores.put(patente, cuantasMultas);
			}
			linea = br.readLine();
		}
		fr.close();
	}

	public void escribirMultados(String archivoDeSalida) throws IOException {
		PrintWriter salida = new PrintWriter(new FileWriter(archivoDeSalida));
		for (Entry<String, Integer> cu : infractores.entrySet()) {
			String key = cu.getKey();
			Integer val = cu.getValue();
			
			salida.println(key + " " + (val * 50000));

		}
		salida.close();

	}

	public static void main(String[] args) throws IOException {
		Infractores inf = new Infractores();
		inf.leerInfractores("infractores.in");
		inf.escribirMultados("multados.out");
		
	}

}
