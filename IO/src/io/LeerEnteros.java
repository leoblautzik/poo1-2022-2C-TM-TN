package io;

import java.io.*;

public class LeerEnteros {
	public static void main(String[] arg) {
		int suma = 0;
		File f = null;
		FileReader fr = null;
		BufferedReader br = null;
		try {
			f = new File("enteros.txt");
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			String linea;

			while ((linea = br.readLine()) != null) {
				try {
					suma = suma + Integer.parseInt(linea);
				} catch (NumberFormatException e) {
					System.err.println("Uno de los datos leídos no es un entero");
				}

			}

			System.out.println(suma);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println(suma);
			try {
				if (fr != null) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
