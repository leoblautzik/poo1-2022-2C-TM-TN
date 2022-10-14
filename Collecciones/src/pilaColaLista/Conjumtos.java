package pilaColaLista;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class Conjumtos {

	public static List<Integer> eliminarRepetidos(List<Integer> listaConRepetidos) {

		Set<Integer> setAux = new TreeSet<Integer>();
		List<Integer> listaAux = new ArrayList<Integer>();

		for (Integer cadaUno : listaConRepetidos)
			setAux.add(cadaUno);

		for (Integer cadaUno : setAux)
			listaAux.add(cadaUno);

		return listaAux;

	}

	public static List<Integer> generarListaAleatoria() {
		List<Integer> lista = new ArrayList<Integer>();
		double aleatorio;
		int numero;
		for (int i = 0; i < 10; i++) {
			aleatorio = Math.random();
			numero = (int) (aleatorio * 100) + 1;
			lista.add(numero);
		}

		return lista;

	}
	
	
	public static List<Integer> invertirLista(List<Integer> lista){
		List<Integer> listaAux = new ArrayList<Integer>();
		Stack<Integer> pilaAux = new Stack<Integer>();
		
		for(Integer cadaUno : lista)
			pilaAux.push(cadaUno);
		
		while(!pilaAux.isEmpty())
			listaAux.add(pilaAux.pop());
		
		return listaAux;
		
		
	}

	public static void main(String[] args) {
		
		List<Integer> listaConRepetidos = generarListaAleatoria();
		List<Integer> listaSinRepetidos = eliminarRepetidos(listaConRepetidos);
		List<Integer> listaInvertida = 	invertirLista(listaSinRepetidos);
		
		System.out.println(listaSinRepetidos);
		System.out.println(listaInvertida);
		
		

	}

}
