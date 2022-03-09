package com.desafiolatam.f20211213;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Archivo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Se solicita por teclado un dato de tipo String
		System.out.println("Ingrese fichero");
		String fichero = sc.nextLine();

		// Se solicita por teclado un dato de tipo String
		System.out.println("Ingrese ruta");
		String ruta = sc.nextLine();

		// llamado del metodod con 2 parametros String
		crearFichero(fichero, ruta);

	}// El metodo define que se pasa primero, aqui se reciben los parametros de tipo
		// String

	public static void crearFichero(String fichero, String ruta) {
		// String ruta = ""src/com/desafiolatam/f20211213""; ESTO ES UNA RUTA ESTATICA
		// Creamos un archivo de tipo file y se asigna la ruta a crear o validar si
		// existe
		File directorio = new File(ruta);

		if (directorio.exists()) {
			System.out.println("El directorio existe");
		} else {
			System.out.println("El directorio NO existe");
			directorio.mkdirs();// lo crea en caso de no existir
		}
		// src/com/desafiolatam/proveedores/proveedores.xls
		// CREAMOS UNA VARIABLE DE TIPO file, que nos servira para crear un nuevo
		// archivo
		File archivo = new File(ruta + "/" + fichero);

		// si existe no hace nada solo imprime el mensaje
		if (archivo.exists()) {
			System.out.println("El archivo existe");
		} else {// En caso contrario lo crea
			System.out.println("El archivo NO existe");
			try {
				// crear archivo si no existe
				archivo.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
