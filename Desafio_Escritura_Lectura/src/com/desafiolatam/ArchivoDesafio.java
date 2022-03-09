package com.desafiolatam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ArchivoDesafio {

	public static void main(String[] args) {
		/*
		 * REQUERIMIENTOS DESAFIO 1.-Crear método llamado
		 * crearArchivo(directorio,fichero) 2. Validar que el nombre del directorio no
		 * exista dentro del programa 3. Si el directorio no existe, se debe crear. Si
		 * existe mostrar mensaje por consola. Si existe algun otro problema al crear
		 * directorio, mostrar mensaje por consola "Error al crear directorio"
		 * 
		 */
		Scanner sc = new Scanner(System.in);

		// Se solicita el ingreso por teclado de un nombre de directorio
		System.out.println("**Ingrese nombre de directorio***");// nombre directorio "desafioEscritura".
		String directorio = sc.nextLine();

		// Se solicita el ingreso por teclado de un nombre de fichero
		System.out.println("***Ingrese nombre de fichero***");// nombre fichero "desafioEscritura.txt"
		String fichero = sc.nextLine();
		System.out.println();

		
		String nombreFichero = "src/com/desafiolatam/" + directorio;
		String texto = fichero;
		// llamado al metodo con 2 parametros tipo String
		crearArchivo("src/com/desafiolatam/" + directorio, fichero);
		buscarTexto(nombreFichero, texto);

	}

//Crear método llamado crearArchivo(directorio,fichero) recibiendo 2 parametros tipo String

	public static void crearArchivo(String directorio, String fichero) {

		// Se crean archivo tipo FILE y se asigna la ruta a crear o validar si existe
		File carpeta = new File(directorio);
		// Se crea archivo tipo FILE que servira para crear un nuevo archivo
		File archivo = new File(directorio + "/" + fichero); // fichero es nombre archivo a crear

		if (!carpeta.exists()) {
			System.out.println("Directorio NO existe");
			if (carpeta.mkdirs()) {
				System.out.println("Directorio creado"); // Se crea directorio
				try {
					if (archivo.createNewFile()) {
						System.out.println("Fichero creado");
					} else {
						System.out.println("Fichero no pudo ser creado");
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else {
				System.out.println("Error al crear directorio");
			}
		} else {
			System.out.println("Directorio ya esta creado");
		}
		System.out.println();

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

		// Escritura de archivo

		try {
			FileWriter filew = new FileWriter(archivo);
			BufferedWriter buffW = new BufferedWriter(filew);

			for (Iterator iterator = lista.iterator(); iterator.hasNext();) {
				String texto = (String) iterator.next();
				buffW.write(texto);
				buffW.newLine();
			}
			buffW.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Crear método llamado buscarTexto nombreFichero , texto
	public static void buscarTexto(String nombreFichero, String texto) {
		Scanner sc = new Scanner(System.in);
		File archivo = new File(nombreFichero + "/" + texto);
		int contador =0;
		
		if (archivo.exists()) { // Pregunta si archivo existe

			System.out.println("****************************");
			System.out.println("***Ingrese texto a buscar***");
			System.out.println("****************************");
			String palabra = sc.nextLine();

			try {
				FileReader fileR = new FileReader(archivo);
				BufferedReader buffR = new BufferedReader(fileR);
				// lectura de las filas dentro del archivo
				String txt = buffR.readLine();// leer primera linea
				while (txt != null) {

					System.out.println(txt);
					if(txt.equalsIgnoreCase(palabra)) {
						System.out.println("Existe "+ palabra);
						contador++;
						
					}
					txt = buffR.readLine();
					
				}
				System.out.println("************************************************");
				System.out.println("*Cantidad de repeticiones del texto "+ palabra+" es "+contador+"*");
				System.out.println("************************************************");
				buffR.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
