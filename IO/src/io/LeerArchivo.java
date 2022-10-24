package io;

import java.io.*;

public class LeerArchivo {
	
	      public static void main (String [] arg) {
	      File archivo = null;
	      FileReader fr = null;
	      BufferedReader br = null;

	      try {
	         // Apertura del fichero y creacion de BufferedReader para poder
	         // hacer una lectura comoda (disponer del metodo readLine()).
	         archivo = new File ("./src/io/archivos/miArchivo.in");
	         fr = new FileReader (archivo);
	         br = new BufferedReader(fr);
	         // Lectura del fichero
	         String linea;
	         while((linea=br.readLine())!=null)
	            System.out.println(linea);
	      }
	      catch(IOException e){
	         e.printStackTrace();
	      }finally{
	         // En el finally cerramos el fichero, para asegurarnos
	         // que se cierra tanto si todo va bien como si salta 
	         // una excepcion.
	         try{                    
	            if( null != fr ){   
	               fr.close();     
	            }                  
	         }catch (Exception e2){ 
	            e2.printStackTrace();
	         }
	      }
	   }
	}

