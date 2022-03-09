package com.desafiolatam.f20220106Repaso;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class EscrituraArchivo {

	public static void main(String[] args) {

		crearArchivo();
		escribirArchivo();
		leerArchivo();

	}

	public static void crearArchivo() {
		File archivo = new File("src/com/desafiolatam/f20220106Repaso/archivo.txt");

		try {
			if (!archivo.exists()) {// SI No existe el archivo
				archivo.createNewFile();// creo el archivo
				System.out.println("Archivo creado");
			}

		} catch (IOException e) {
			System.out.println("Error en la creacion del archivo");
		}

	}

	public static void escribirArchivo() {
		File archivo = new File("src/com/desafiolatam/f20220106Repaso/archivo.txt");

		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Perro");
		lista.add("Gato");
		lista.add("Juan");
		lista.add("Daniel");
		lista.add("Juan");
		lista.add("Gato");
		lista.add("Perro");
		lista.add("Camila");
		lista.add("Daniel");
		lista.add("Camila");

		try {
			FileWriter archivoWriter = new FileWriter(archivo);
			BufferedWriter archivoBuff = new BufferedWriter(archivoWriter);

			// escritura recorriendo con for iterator
			
			for (Iterator iterator = lista.iterator(); iterator.hasNext();) { 
				 String texto = (String) iterator.next(); 
				 archivoBuff.write(texto);
				 archivoBuff.newLine(); 
			 }
			 
			 //escritura recorriendo con for each
			
			/*for (String texto : lista) {
				archivoBuff.write(texto);
				archivoBuff.newLine();
			}
			
			//escritura recorriendo con for 
			for (int i = 0; i < lista.size(); i++) {
				archivoBuff.write(lista.get(i));
				archivoBuff.newLine();
				
			}/*/
			
			archivoBuff.close();
		} catch (Exception e) {
		}
	}

	public static void leerArchivo() {
		File archivo = new File("src/com/desafiolatam/f20220106Repaso/archivo.txt");

		try {
			FileReader archivoReader = new FileReader(archivo);
			BufferedReader archivoBuff = new BufferedReader(archivoReader);

			String data = archivoBuff.readLine();
			while (data != null) {
				System.out.println(data);
				data = archivoBuff.readLine();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
