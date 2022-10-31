import java.util.Collections;
import java.util.PriorityQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class Cadena {

	private String cadena;
	
	public Cadena(String cadena) {
		this.cadena = cadena;
	}
	
	
	
	protected String getCadena() {
		return cadena;
	}



	@Override
	public String toString() {
		return cadena;
	}

	
	public static void main(String[] args) {
		PriorityQueue<Cadena> colaPri = 
				new PriorityQueue<Cadena>
						(Collections.reverseOrder(new CadenaMasCortaComparator()));
		colaPri.offer(new Cadena("corta"));
		colaPri.offer(new Cadena("mas corta"));
		colaPri.offer(new Cadena("cortisima"));
		colaPri.offer(new Cadena("larga"));
		colaPri.offer(new Cadena("c"));
		colaPri.offer(new Cadena("si"));
		colaPri.offer(new Cadena("supercalifragilisticoespialidoso"));
		
		System.out.println(colaPri);
		
		while(!colaPri.isEmpty()) {
			System.out.println(colaPri.poll());
		}
		
		
	}
	

}
