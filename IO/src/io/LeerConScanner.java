package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public class LeerConScanner {

	public static List<Persona> getPersona(String archivo) throws FileNotFoundException {

		Scanner sc = new Scanner(new File(archivo));
		sc.useLocale(Locale.ENGLISH);

		LinkedList<Persona> personas = new LinkedList<Persona>();

		while (sc.hasNext()) {
			personas.add(new Persona(sc.nextInt(), sc.next(), sc.nextInt()));
		}

		sc.close();

		return personas;

	}

	public static void main(String[] args) throws FileNotFoundException {

		List<Persona> listaSubidaDelArchivo = getPersona("personas.in");
		Collections.sort(listaSubidaDelArchivo);
		for (Persona persona : listaSubidaDelArchivo) {
			System.out.println(persona);

		}
		
		

	}

}
