package colaConDosPilas;

import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.Test;

public class ColaConDosPilasTest {

	@Test
	public void unElementoTest() {
		ColaConDosPilas<Integer> cola2P = new ColaConDosPilas<Integer>();
		cola2P.enqueue(8);
		System.out.println(cola2P.peek());
		assertEquals((Integer) 8, cola2P.peek());
	}
	
	@Test(expected=NoSuchElementException.class)
	public void colaVaciaTest() {
		ColaConDosPilas<Integer> cola2P = new ColaConDosPilas<Integer>();
		cola2P.dequeue();
		
	}
	@Test
	public void unMillonDeEnqueueTest() {
		ColaConDosPilas<Integer> cola2P = new ColaConDosPilas<Integer>();
		for(int i=1; i<=1000000; i++)
			cola2P.enqueue(i);
		
		assertEquals((Integer) 1, cola2P.peek());
		cola2P.dequeue();
		assertEquals((Integer) 2, cola2P.peek());
	}
}
