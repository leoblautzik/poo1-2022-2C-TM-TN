import java.util.Comparator;

public class CadenaMasCortaComparator implements Comparator<Cadena> {

	@Override
	public int compare(Cadena o1, Cadena o2) {
		return Integer.compare(o1.getCadena().length(), o2.getCadena().length());
	}

}
