package com.desafiolatam;

import java.util.Scanner;

public class Patrones {

	public static void main(String[] args) {

		// Si usuario ingresa 1, se dibuja 1 elemento
		// Si usuario ingresa 2, se dibujan 2 elementos
		// Si usuario ingresa n, se dibujan n elementos
		// Posicion impar (1,3,5,..., 2n+1) asteriscos
		// Posicion par (0,2,4,6....2n) puntos

		Scanner sc = new Scanner(System.in);

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
			} else {// Patron 1
				System.out.printf(".");// Patron Par
		}
		}
		System.out.print("\n----------------------\n");
		
		
		for (int i = 1; i <=num; i++) { // Patron 2
			//1234 -> 0
			//5%4==1
			//6%4==2
			//7%4==3
			//8%4==0 ->4
			if (i >4) {
				if(i%4==1) {
					System.out.print(1);
				}else if (i%4==2) {
					System.out.print(2);
					}else if (i%4==3) {
						System.out.print(3);
						}else if (i%4==0) {
							System.out.print(4);	
							}
				}else {
		    	 //1%4==0
		    	 //2%4==0
		    	 //3%4==0
		    	 //4%4==0
		    	 System.out.print(i);
		     }
		 }
		    	 
		    	 
		 
		
		System.out.printf("\n---------------------\n");
		for (int i = 1; i <=num; i++) {
			if (i % 3 == 0) {
				System.out.printf("*");// Patron impar
			} else { // Patron 3
				System.out.printf("|");// Patron Par
			}
		}
		
	}
	}
	
