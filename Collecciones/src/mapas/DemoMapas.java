package mapas;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class DemoMapas {

	/*
	 * implementar un metodo que reciba una lista con los codigos de sucursal y las
	 * ventas diarias de esa sucursal durante un mes.
	 */

	public Map<Integer, Double> ventasDelMesPorSucursal(List<VentaPorSucursal> listado) {

		Map<Integer, Double> mapAux = new TreeMap<Integer, Double>();

		Integer key;
		Double valor;

		for (VentaPorSucursal cadaVenta : listado) {
			key = cadaVenta.getCodSucursal();

			if (mapAux.containsKey(key)) {
				valor = mapAux.get(key);
				Double nuevoValor = valor + cadaVenta.getMontoDeVenta();
				mapAux.put(key, nuevoValor);
			} else
				mapAux.put(key, cadaVenta.getMontoDeVenta());

		}

		return mapAux;

	}

	public Map<Character, Integer> frecuencias(String s) {

		Map<Character, Integer> aux = new TreeMap<Character, Integer>();

		Integer valor;
		for (int i = 0; i < s.length(); i++) {

			Character key = s.charAt(i);

			if (!aux.containsKey(key))
				aux.put(key, 1);
			else {
				valor = aux.get(key);
				Integer nuevoValor = valor+1;
				aux.put(key, nuevoValor);
			}

		}

		return aux;

	}
	
	public static void main(String[] args) {
		
		DemoMapas dm = new DemoMapas();
		
		System.out.println(dm.frecuencias("Esta imagen es un mapa derivado de producciones de la Sección Cartográfica de las Naciones Unidas."
				+ "Las versiones modificadas de mapas de la SCNU (UNCS) podrán utilizarse siempre que el nombre de las Naciones Unidas y el número de referencia que no aparezcan en ninguna versión modificada y se proporcione un enlace al mapa original.\n"
				+ "Los mapas modificados de las Naciones Unidas deben ser considerados en el dominio público. Esto aplica globalmente.\n"
				+ "Los mapas de las Naciones Unidas son contenido libre. Usted las puede utilizar para hacer tus propios mapas. Usted no necesita nuestro permiso para ello. Tenga en cuenta que el nombre de las Naciones Unidas y el número de referencia no debe aparecer en ningún mapa modificado. El mapa de la ONU es un documento de las Naciones Unidas y no se puede modificar. Puedes decir algo como \"Basado en el número de las Naciones Unidas el mapa ...\" - Vladimir Bessarabov (Cartógrafo SCNU), 13 de abril 05\n"
				+ "\n"
				+ ""));
		
	}
}
