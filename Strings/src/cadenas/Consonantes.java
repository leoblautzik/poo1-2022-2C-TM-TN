package cadenas;

public class Consonantes {

	public String consonantes(String str) {

		String sinVocales = str;

		String vocales = "aeiouAEIOUáéíóúÁÉÍÓÚ";

		for (int i = 0; i < vocales.length(); i++) {
			Character vocal = vocales.charAt(i);
			sinVocales = sinVocales.replace(vocal.toString(), "");
		}

		return sinVocales;
	}

	public static void main(String[] args) {
		Consonantes c = new Consonantes();
		System.out.println(c.consonantes("Hola Mundo Java"));
		System.out.println(c.consonantes("Abracadabra"));

	}

}
