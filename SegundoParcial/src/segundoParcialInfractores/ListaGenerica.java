package segundoParcialInfractores;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ListaGenerica<T> {

	/*
	 * Escribir un método que reciba dos listas como parámetros y devuelva una
	 * tercera lista que sea la diferencia simétrica entre la primera y la segunda.
	 * La diferencia simétrica entre dos listas son los objetos que están en la
	 * primera lista pero no en la segunda y los de la segunda que no están en la
	 * primera. Considere que los objetos que están contenidos en las listas tienen
	 * órden total (Implementan Comparable y tienen implementado su propio equals y
	 * hashCode).
	 */

	public List<T> diferenciaSimetrica(List<T> l1, List<T> l2) {
		List<T> diferenciaSimetrica = new LinkedList<T>();
		// recorro l1
		for (T cadaElementoEnL1 : l1) {
			if (!l2.contains(cadaElementoEnL1))
				diferenciaSimetrica.add(cadaElementoEnL1);
		}
		// recorro l2
		for (T cadaElementoEnL2 : l2) {
			if (!l1.contains(cadaElementoEnL2))
				diferenciaSimetrica.add(cadaElementoEnL2);
		}

		return diferenciaSimetrica;

	}

	/*
	 * Escribir un método que reciba dos listas como parámetros y devuelva una
	 * tercera lista que sea la unión entre la primera y la segunda. La unión entre
	 * dos listas son los objetos que están en la primera o en la segunda (sin
	 * repetirlos). Considere que los objetos que están contenidos en las listas
	 * tienen órden total (Implementan Comparable y tienen implementado su propio
	 * equals y hashCode).
	 */

	public List<T> union(List<T> l1, List<T> l2) {
		List<T> listaUnion = new LinkedList<T>();

		for (T t : l1) {
			if (!listaUnion.contains(t))
				listaUnion.add(t);
		}

		for (T t : l2) {
			if (!listaUnion.contains(t))
				listaUnion.add(t);
		}

		return listaUnion;

	}
	
	public List<T> unionS(List<T> l1, List<T> l2) {
		List<T> listaUnion = new LinkedList<T>();
		Set<T> conjunto = new HashSet<T>();

		for (T t : l1) {
			conjunto.add(t);
		}

		for (T t : l2) {
			conjunto.add(t);
		}
		
		for(T t : conjunto)
			listaUnion.add(t);

		return listaUnion;
	}

	public static void main(String[] args) {
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(5);

		LinkedList<Integer> l2 = new LinkedList<Integer>();
		l2.add(1);
		l2.add(3);
		l2.add(5);
		l2.add(7);

		ListaGenerica<Integer> lgI = new ListaGenerica<Integer>();

		System.out.println(lgI.diferenciaSimetrica(l1, l2));
		System.out.println(lgI.unionS(l1, l2));
		
		

	}

}
