package cadenas;

public class Inversora {

	static String invertirCadena(String cadena) {
		String invertida = "";
		for (int i = cadena.length() - 1; i >= 0; i--)
			invertida += cadena.charAt(i);
		return invertida;
	}

	static boolean esPalindromo(String p) {
		String enMinuscula = p.toLowerCase();
		String sinAcentos = enMinuscula.replace('á', 'a');
		sinAcentos = sinAcentos.replace('é', 'e');
		sinAcentos = sinAcentos.replace('í', 'i');
		sinAcentos = sinAcentos.replace('ó', 'o');
		sinAcentos = sinAcentos.replace('ú', 'u');
		String sinEspacios = sinAcentos.replace(" ", "");
		//System.out.println(sinEspacios);
		String invertida = invertirCadena(sinEspacios);
			
		return sinEspacios.equals(invertida);

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

		System.out.println(Inversora.invertirCadena("Hola"));
		System.out.println(esPalindromo("neuquen"));// bien
		System.out.println(esPalindromo("Neuquen"));// mal
		System.out.println(esPalindromo("Neuquén"));// mal
		System.out.println(esPalindromo("Dábale arroz a la zorra el abad"));
		System.out.println(encriptar("CHIMPUM",2));
		System.out.println(encriptar("SUPERCALIFRAGILISTICOESPIALIDOSO",27));

	}

}
