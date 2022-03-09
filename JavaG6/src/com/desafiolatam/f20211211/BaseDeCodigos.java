package com.desafiolatam.f20211211;

import java.util.Scanner;

public class BaseDeCodigos {

	public static void main(String[] args) {
		// BASE DE CODIGOS
	
		Scanner sc = new Scanner(System.in);
	
		
		
	/* 1.-	 	System.out.println("Ingrese cantidad a mostrar");//Se solicita ingreso al usuario. 
		 		int num = sc.nextInt(); //Se captura el dato 
		 		for(int i=0;i<num;i++){ //condicion
		 		System.out.printf("*"); 
		 		} 
		 		System.out.printf("\n"); 
		 		*/
		/*1 y 2, Ambos muestran el mismo resultado, se visualizan en fila(*****)
	
	
	/*2.-    	System.out.println("Ingrese cantidad a mostrar");
		 		int num = sc.nextInt();
		 		for (int col =1; col <=num; col++){ //representa una columna
	     		System.out.print('*'); 
				}*/
		
	/* 3.- Este código muestra patron *.*. en una fila
		 
				System.out.println("Ingrese un numero: ");// Se solicita ingreso al usuario.
				int num = sc.nextInt(); // Se captura el dato
				for (int i = 0; i < num; i++) { // Condicion de termino i < num, cuando i toma valor de n-1,
				// se ejecutará la última itearación. Como se dibujara de a 1 elemento * o .,
				// el incremento debe ser de 1 en 1.
				if (i % 2 == 0)
				System.out.print('*');
				else							//En su conjunto representan en una fila
				System.out.print('.');
		}*/
	
		
	/*  4.- Este código muestra 3 patrones en su conjunto, *.*.*.*./12341234/||*||*||*
	 			
	 	int num = 0;
		try {
			do {
				System.out.println("Ingrese un número: ");// Se solicita ingreso al usuario.
				num = sc.nextInt(); // Se captura el dato
				// validar valor ingresado
			} while (num <= 0);

		} catch (Exception e) {
			System.out.println("Error en ingreso de datos!!!");
		}

		for (int i = 0; i < num; i++) { // Condicion de termino i < num, cuando i toma valor de n-1,
			// se ejecutará la última iteración. Como se dibujara de a 1 elemento (*) o (.)
			// el incremento debe ser de 1 en 1.
			if (i % 2 == 0) {
				System.out.printf("*");// Patron impar
			} else // Patron 1
				System.out.printf(".");// Patron Par
		}
		System.out.print("\n----------------------\n");
		for (int i = 0; i < num; i++) { // Patron 2
			System.out.printf("1234");
		}
		System.out.printf("\n---------------------\n");
		for (int i = 0; i < num; i++) {
			if (i % 2 == 0) {
				System.out.printf("||");// Patron impar
			} else { // Patron 3
				System.out.printf("*");// Patron Par
			}

		}*/
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}



		
		

