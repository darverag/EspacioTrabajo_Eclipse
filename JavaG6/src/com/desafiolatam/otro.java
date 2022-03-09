package com.desafiolatam;

import java.util.Scanner;

public class otro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String opcion ="";
		
		while(!opcion.equals("salir")) {
		System.out.println("Escoge una opción");
		System.out.println("1 -- Acción");
		System.out.println("2 -- Acción");
		System.out.printf("Escribe 'salir' para terminar el programa.\n\n");
		System.out.println("Ingrese una opción:");
		opcion = sc.nextLine();
		if (opcion.equals("1")) {
			System.out.println("Realizando acción 1");
		}else if(opcion.equals("2")){
			System.out.println("Realizando acción2");
		}else if(opcion.equals("salir")){
			System.out.println("Saliendo");
		}else {
			System.out.println("Opción inválida");
		}
	}
}
}
	
	