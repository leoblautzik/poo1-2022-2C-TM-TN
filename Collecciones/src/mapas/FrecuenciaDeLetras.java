package mapas;

import java.util.Map;
import java.util.TreeMap;

public class FrecuenciaDeLetras {

	public Map<Character, Integer> frecuencias(String frase) {

		Map<Character, Integer> letras = new TreeMap<Character, Integer>();
		frase = frase.trim();

		for (int i = 0; i < frase.length(); i++) {
			Character letra = frase.charAt(i);
			if (letra != ' ') {
				
				if (!letras.containsKey(letra)) {
					letras.put(letra, 1);
				} else {
					Integer frecuencia = letras.get(letra);
					frecuencia++;
					letras.put(letra, frecuencia);
				}
			}

		}

		return letras;

	}

	public static void main(String[] args) {
		FrecuenciaDeLetras fdl = new FrecuenciaDeLetras();

		System.out.println(fdl.frecuencias("The implementation of the string concatenation operator is left to the discretion of a Java compiler, as long as the compiler ultimately conforms to The Java™ Language Specification. For example, the javac compiler may implement the operator with StringBuffer, StringBuilder, or java.lang.invoke.StringConcatFactory depending on the JDK version. The implementation of string conversion is typically through the method toString, defined by Object and inherited by all classes in Java."));
	}

}
