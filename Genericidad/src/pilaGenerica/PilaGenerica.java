package pilaGenerica;

import java.util.LinkedList;

public class PilaGenerica<T>{
	
	private LinkedList<T> pila;
	
	public PilaGenerica(){
		this.pila = new LinkedList<T>();
	}
	
	public boolean isEmpty() {
		return pila.isEmpty();
	}
	
	public void push(T dato) {
		pila.addFirst(dato);
	}
	
	public T pop() {
		return pila.removeFirst();
	}
	
	public T peek() {
		return pila.peekFirst();
	}
	
	public static void main(String[] args) {
		PilaGenerica<Integer> p = new PilaGenerica<Integer>();
		p.push(3);
		p.push(5);
		System.out.println(p.pop());
	}

}
