package pilaColaLista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class IntercaladorDeListas {
	
	List<Integer> intercalar(List<Integer> l1, List<Integer> l2)
	{
		List<Integer> aux = new LinkedList<Integer>();
		
		for(Integer i : l1)
			aux.add(i);
		for(Integer i : l2)
			aux.add(i);
		
		Collections.sort(aux);
		
		return aux;
	}
	
	public static void main(String[] args) {
		List<Integer> l1 = new LinkedList<Integer>();
		List<Integer> l2 = new ArrayList<Integer>();
		l1.add(1);
		l1.add(3);
		l1.add(5);
		l1.add(6);
		l1.add(8);
		l1.add(9);
		l1.add(10);
		
		l2.add(2);
		l2.add(4);
		l2.add(7);
		
		IntercaladorDeListas idl = new IntercaladorDeListas();
		List<Integer> l3 = idl.intercalar(l1, l2);
		
		System.out.println(l3);
		
		
		
		
	}
}
