package entrenadores;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Entrenadores {

	public Map<String, List<String>> entrenadoresPorSocio(Map<String, List<String>> entrada) {
		Map<String, List<String>> aux = new HashMap<String, List<String>>();

		for (Map.Entry<String, List<String>> entry : entrada.entrySet()) {
			String entrenador = entry.getKey();
			List<String> listaDeSocios = entry.getValue();

			for (String cadaSocio : listaDeSocios) {
				if (aux.containsKey(cadaSocio)) {
					aux.get(cadaSocio).add(entrenador);
				} else {
					List<String> listaAux = new ArrayList<String>();
					listaAux.add(entrenador);
					aux.put(cadaSocio, listaAux);
				}
			}
		}

		return aux;
	}

	public static void main(String[] args) {
		/*
		 * Por ejemplo, si dicciEntrena, en la clave “Bielsa” contiene la lista [“Juan”,
		 * “Alberto”], y en la clave “Alvarez” contiene la lista [“Tom”, “Alberto”,
		 * “Vero”], el resultado debe ser un listado de la forma “Alberto”, “Alvarez”,
		 * “Bielsa” “Juan”, “Bielsa” “Tom”, “Alvarez” “Vero”, “Alvarez”
		 * 
		 */

		Map<String, List<String>> entrada = new HashMap<String, List<String>>();
		List<String> listaDeBielsa = new LinkedList<String>();
		listaDeBielsa.add("Juan");
		listaDeBielsa.add("Alberto");
		entrada.put("Bielsa", listaDeBielsa);
		List<String> listaDeAlvarez = new LinkedList<String>();
		listaDeAlvarez.add("Tom");
		listaDeAlvarez.add("Alberto");
		listaDeAlvarez.add("Vero");
		entrada.put("Alvarez", listaDeAlvarez);
		List<String> listaDeGareca = new LinkedList<String>();
		listaDeGareca.add("Tom");
		listaDeGareca.add("Alberto");
		listaDeGareca.add("Vero");
		listaDeGareca.add("Juan");
		entrada.put("Gareca", listaDeGareca);
		
		Entrenadores e = new Entrenadores();
		System.out.println(e.entrenadoresPorSocio(entrada));

	}

}
