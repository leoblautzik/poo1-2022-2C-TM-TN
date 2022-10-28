package colaConDosPilas;

public interface QueueInterface<T> {
	
	public boolean isEmpty();

	public void enqueue(T newItem);

	public T dequeue() throws java.util.NoSuchElementException;

	public T peek() throws java.util.NoSuchElementException;
}
