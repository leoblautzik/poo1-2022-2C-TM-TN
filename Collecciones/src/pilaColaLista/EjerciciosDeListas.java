package pilaColaLista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class EjerciciosDeListas {
	
	public static List<Integer>  intercalar (List<Integer> l1, List<Integer> l2){
		
		List<Integer> aux = new ArrayList<Integer>();
		
		for (Integer i1 : l1) {
			aux.add(i1);
		}
		for (Integer i2 : l2) {
			aux.add(i2);
		}
		
		Collections.sort(aux, Collections.reverseOrder());
		
		return aux;
		
	}
	
	
	public static void main(String[] args) {
		
		List<Integer> l1 = new ArrayList<Integer>();
		List<Integer> l2 = new LinkedList<Integer>();
		
		l1.add(1);
		l1.add(3);
		l1.add(5);
		l1.add(7);
		l1.add(9);
		l2.add(2);
		l2.add(4);
		l2.add(6);
		l2.add(8);
		l2.add(10);
		
		List<Integer> l3 = intercalar(l1, l2);
		
		System.out.println(l3);
		
		
	}

}
