package videoClub;

import java.util.Arrays;

public class VideoClub {

	public static void main(String[] args) {
		Pelicula matrix = new Pelicula("Matrix","accion",1999, "Wachowsky");
		Pelicula toyStory = new Pelicula("Toy Story", "animada", 1995, "Pixar");
		
		Pelicula pelis[] = {matrix, toyStory};
		
		Arrays.sort(pelis);
		for (Pelicula cadaPeli : pelis) {
			System.out.println(cadaPeli);
		}
		
		
		
		
	}

}
