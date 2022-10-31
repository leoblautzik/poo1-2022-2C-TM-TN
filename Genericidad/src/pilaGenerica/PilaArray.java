package pilaGenerica;

public class PilaArray<T> {
	
	private Object [] array;
	int cantElem = 0;
	
	public PilaArray() {
		this.array = new Object [10];
	}
	public boolean isEmpty() {
		return this.cantElem == 0;
	}
	
	public void push(T dato) {
		if(cantElem >= array.length)
			throw new Error("Error");
		array[cantElem] = dato;
		cantElem ++;
	}
	
	@SuppressWarnings("unchecked")
	public T pop() throws PilaVaciaException {
		if (this.isEmpty())
			throw new PilaVaciaException("Pila vacia");
		return (T) array[--cantElem];
	}
	
	public static void main(String[] args) throws PilaVaciaException {
		PilaArray<Integer> pilaa = new PilaArray<Integer>();
		pilaa.push(3);
		pilaa.push(6);
		pilaa.push(5);
		
		System.out.println(pilaa.pop());
		System.out.println(pilaa.pop());
		System.out.println(pilaa.pop());
		System.out.println(pilaa.pop());
		
		
		
	}
	
}
