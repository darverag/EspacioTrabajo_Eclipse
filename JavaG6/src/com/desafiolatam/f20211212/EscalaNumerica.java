package com.desafiolatam.f20211212;

import java.util.Scanner;

public class EscalaNumerica {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);																																								
			System.out.println("Ingresa un número");
			int n = sc.nextInt();// Se crea variable para capturar datos

			for (int fila = 1; fila <= n; fila++) { // Paso 1 dibujaremos las n filas     
				for (int col = 1; col <=fila; col++) { // Paso 2 dibujamos las n columnas 
					System.out.printf("%d", col);  //System.out.printf("%d", col+1,fila);
				}
				System.out.println("");
			}


	}

}
