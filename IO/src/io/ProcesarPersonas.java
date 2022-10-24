package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;



public class ProcesarPersonas {
	
	/* Implementar un método estático getPersonas que reciba 
	 * el nombre de un archivo y devuelva un objeto LinkedList<Persona> 
	 * con personas que fueron leídas del archivo de texto con formato 
	 * "dni apellido edad". 
	 */
	public static List<Persona> getPersonas(String archivo) {

		List<Persona> aux = new LinkedList<Persona>();
		try {

			FileReader fr = new FileReader(new File(archivo));
			BufferedReader br = new BufferedReader(fr);
			String linea;
			
			String datos[];
			int dni;
			String apellido;
			int edad;
			Persona p;
			
			linea = br.readLine();
			while (linea != null) {
				datos = linea.split(" ");
				dni = Integer.parseInt(datos[0]);
				apellido = datos[1];
				edad = Integer.parseInt(datos[2]);
				p = new Persona(dni, apellido, edad);
				aux.add(p);
				linea = br.readLine();
			}
			fr.close();

		} catch (FileNotFoundException fnfo) {
			System.err.print("Archivo no encontrado");

		} catch (IOException e) {
			System.err.print("Error I/O");

		} 		
		
		return aux;
	}
	
	/*Implementar un método estático getPersonasMayoresAEdad que 
	 * reciba un objeto LinkedList<Persona> y una edad y devuelva 
	 * otro objeto LinkedList<Persona> con las personas cuyas edades 
	 * son mayores a esa edad. Guardar esas personas en un archivo 
	 * “personasMayoresDeXX.out”, donde xx sea la edad que se usó como parámetro. 
	 * Guardarlo ordenado alfabéticamente.  
	 * 
	 */
	public static List<Persona> getPersonasMayoresAEdad(List<Persona> personas, int edad){
		
		List<Persona> aux = new LinkedList<Persona>();
		
		for (Persona persona : personas) {
			if(persona.getEdad() > edad)
				aux.add(persona);
		}
		
		return aux;
		
	}
	
	public static void guardarListadoDePersonas(List<Persona> personas, String nombreArchivo) throws FileNotFoundException {
		
		PrintWriter pr = new PrintWriter(new File(nombreArchivo));
		
		for (Persona persona : personas) {
			pr.println(persona);
		}
		
		pr.close();
		
	}
	
	public static void main(String[] args) {
		List<Persona> listaPersonas = getPersonas("personas.in");
		List<Persona> personasMayores = getPersonasMayoresAEdad(listaPersonas, 30);
		
		try {
			guardarListadoDePersonas(personasMayores, "PersonasMayoresDe30.out");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
		
		
	}

}
