package pilaColaLista;

import java.util.Stack;

public class DemoStack {

	public static void main(String[] args) {

		Stack<Integer> pila = new Stack<Integer>();
		
		pila.push(1);
		pila.push(2);
		pila.push(3);
		pila.push(4);
		pila.push(5);
		
		while(!pila.isEmpty())
			System.out.println(pila.pop());
		
		String s = "Superpancho";
		InversorDeStrings inv = new InversorDeStrings();
		
		System.out.println(inv.invertir(s));
		
		
	}

}
