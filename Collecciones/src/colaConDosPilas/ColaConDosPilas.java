package colaConDosPilas;

import java.util.NoSuchElementException;
import java.util.Stack;

public class ColaConDosPilas<T> implements QueueInterface<T> {

	private Stack<T> pilaA;
	private Stack<T> pilaB;
	
	public ColaConDosPilas(){
		this.pilaA = new Stack<T>();
		this.pilaB = new Stack<T>();
	}
	
	@Override
	public boolean isEmpty() {
		return pilaA.isEmpty() && pilaB.isEmpty();
	}

	@Override
	public void enqueue(T newItem) {
		pilaA.push(newItem);

	}

	@Override
	public T dequeue() throws NoSuchElementException {

		if (pilaB.isEmpty())
			if (!pilaA.isEmpty()) {
				while (!pilaA.isEmpty()) {
					pilaB.push(pilaA.pop());
				}
			} else
				throw new NoSuchElementException();

		return pilaB.pop();
	}

	@Override
	public T peek() throws NoSuchElementException {
		if (pilaB.isEmpty())
			if (!pilaA.isEmpty()) {
				while (!pilaA.isEmpty()) {
					pilaB.push(pilaA.pop());
				}
			} else
				throw new NoSuchElementException();

		return pilaB.peek();
	}

}
