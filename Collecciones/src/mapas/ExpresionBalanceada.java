package mapas;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class ExpresionBalanceada {

	public boolean estaBalanceada(String expresion) {

		Stack<Character> pila = new Stack<Character>();
		Set<Character> conjunto = new HashSet<Character>();
		Map<Character, Character> mapa = new HashMap<Character, Character>();

		conjunto.add('{');
		conjunto.add('[');
		conjunto.add('(');

		mapa.put('}', '{');
		mapa.put(']', '[');
		mapa.put(')', '(');
		Character leido;

		for (int i = 0; i < expresion.length(); i++) {

			leido = expresion.charAt(i);
			if (conjunto.contains(leido)) {
				pila.push(leido);
			} else {
				if (pila.isEmpty() ||  pila.pop() != mapa.get(leido))
					return false;
			}
		}

		return pila.isEmpty();

	}

}
