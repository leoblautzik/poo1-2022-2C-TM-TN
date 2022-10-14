package pilaColaLista;

import java.util.Stack;

public class InversorDeStrings {
	
	public String invertir(String s) {
		String invertida = "";
		Stack<Character> aux = new Stack<Character>();
		
		for(int i = 0; i < s.length(); i++)
			aux.push(s.charAt(i));
		
		while(!aux.isEmpty())
			invertida += aux.pop();
		
		return invertida;
	}

}
