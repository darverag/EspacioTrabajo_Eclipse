package com.desafiolatam;

import java.util.Scanner;

public class otro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String opcion ="";
		
		while(!opcion.equals("salir")) {
		System.out.println("Escoge una opci�n");
		System.out.println("1 -- Acci�n");
		System.out.println("2 -- Acci�n");
		System.out.printf("Escribe 'salir' para terminar el programa.\n\n");
		System.out.println("Ingrese una opci�n:");
		opcion = sc.nextLine();
		if (opcion.equals("1")) {
			System.out.println("Realizando acci�n 1");
		}else if(opcion.equals("2")){
			System.out.println("Realizando acci�n2");
		}else if(opcion.equals("salir")){
			System.out.println("Saliendo");
		}else {
			System.out.println("Opci�n inv�lida");
		}
	}
}
}
	
	