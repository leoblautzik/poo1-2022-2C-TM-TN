package pilaColaLista;

import java.util.Stack;

public class TerminalDeTeletipo {

	public String terminal(String tira) {

		Stack<Character> pila1 = new Stack<Character>();
		Stack<Character> pila2 = new Stack<Character>();
		String tiraResultado = "";

		for (int i = 0; i < tira.length(); i++) {
			Character letra = tira.charAt(i);
			if (letra != '/' && letra != '&')
				pila1.push(letra);
			else {
				if (letra == '/') {
					if (!pila1.isEmpty())
						pila1.pop();
				} else
					pila1.clear();
			}

		}

		while (!pila1.isEmpty())
			pila2.push(pila1.pop());

		while (!pila2.isEmpty()) {
			tiraResultado += pila2.pop();
		}

		return tiraResultado;

	}

}
