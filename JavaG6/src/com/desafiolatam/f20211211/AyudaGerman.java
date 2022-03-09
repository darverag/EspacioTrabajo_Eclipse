package com.desafiolatam.f20211211;

import java.util.Scanner;

public class AyudaGerman {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("ingrese num de caracteres a imprimir: ");
		int n = sc.nextInt();

		/*
		 * for (int col = 1; col <= n; col++) { //REPRESENTA UNA FILA
		 * System.out.print('*');
		 * }
		 */

		/*
		 * for (int fila = 0; fila < n; fila++) { 
		 * System.out.print("*********");
		 * }//REPRESENTA PATRONES DE FILA HACIA ABAJO, SEGÚN NÚMERO INGRESADO Y CARACTERES ENTRE (***)
		 * System.out.println(); 
		 * }
		 */

		/*
		 * for (int fila = 1; fila <= n; fila++) { //REPRESENTA FILAS HACIA ABAJO SEGUN NUMERO INDICADO Y MISMO CANTIDAD CARACTERES HACIA EL LADO
		 * 	for (int col = 1; col <= n; col++) {
		 * System.out.print('*');
		 * } 
		 * System.out.println();
		 * }
		 */

		/* 
		     for (int fila = 1; fila <= n; fila++) {
			 for (int col = 1; col <= n; col++) {   //ESTE PATRON REPRESENTA UNA LINEA EN DIAGONAL, DESDE IZ ARRIBA A DERECHA ABAJO
			 if(fila==col) { 
			 System.out.print('*'); 
			 }else {
			 	System.out.print(' '); 
			    } 
			 }
			 System.out.println(); 
			 }
		 
		 /*		ESTE PATRON REPRESENTA UNA COLUMNA DIAGONAL MARCADA SOLO EN SUS EXTREMOS DESDE IZ A DERECHA.
		    for (int fila = 1; fila <= n; fila++) { 
			for (int col = 1; col <= n; col++) {  
				if((fila==col && fila==1)||(fila==col && fila==n)) {
					System.out.print('*'); 
					}else { 
						System.out.print(' '); 
						}
				}
			 System.out.println(); 
			 }
		 */

	/*	for (int fila = 1; fila <= n; fila++) {
			for (int col = 1; col <= n; col++) { // REPRESENTA 2 FILAS, ARRIBA Y ABAJO
				if ((fila == 1 || fila == n)) {
					System.out.print('*');
				} else {
					System.out.print(' ');
				}
			}
			System.out.println();
			
		}*/
		
		/*  ESTE CODIGO REPRESENTA UN OBJETO (CUADRADO)
		for (int fila = 0; fila < n; fila++) {
			for (int columna = 0; columna < n; columna++) {
				if (fila == 0 || fila == (n - 1)) {
					System.out.printf("*");
				} else {
					if (columna == 0 || columna == (n - 1)) {
						System.out.printf("*");
					} else {
						System.out.printf(" ");
					}
				}
			}
			System.out.printf("\n");
		}*/

	}

}