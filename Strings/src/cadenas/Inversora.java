package cadenas;

public class Inversora {

	static String invertirCadena(String c) {
		String invertida = "";
		for (int i = c.length() - 1; i >= 0; i--)
			invertida += c.charAt(i);
		return invertida;
	}

	static boolean esPalindromo(String p) {
		String originalEnMinuscula = p.toLowerCase();
		String originalSinEspacios = originalEnMinuscula.replace(" ", "");
		//System.out.println(originalSinEspacios);
		String invertidaEnMinuscula = invertirCadena(originalSinEspacios);
		return originalSinEspacios.equals(invertidaEnMinuscula);
	}

	static String encriptar(String s, int c) {
		String alfabeto = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		String encriptada = "";
		for (int i = 0; i < s.length(); i++) {
			char letraOriginal = s.charAt(i);
			int posicionEnAlfabeto = alfabeto.indexOf(letraOriginal);
			int posicionEncriptada = (posicionEnAlfabeto + c) % 27;
			char letraEncriptada = alfabeto.charAt(posicionEncriptada);
			encriptada += letraEncriptada;

		}

		return encriptada;
	}

	public static void main(String[] args) {

		System.out.println(invertirCadena("Hola"));
		System.out.println(esPalindromo("neuquen"));
		System.out.println(esPalindromo("Neuquen"));
		// System.out.println(esPalindromo("Neuquén"));
		System.out.println(encriptar("CHIMPUM",2));
		
		int c [] = new int[0];
		System.out.println(c);
	}

}
