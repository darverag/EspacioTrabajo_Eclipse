package com.desafiolatam.a20211207;

import java.util.Scanner;

public class SoloPuntos {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//inicializar variables
		int cantidad = 0;
				
		try {
			do {

			//Solicitar ingreso de cantidad a mostrar
				System.out.println("Ingrese cantidad a mostrar");
			//Guardamos en una variable (Capturamos)
			 cantidad = sc.nextInt();
			//validar el valor ingresado, se debe validar que no ingrese una letra, cero, numero negativo.
			}while (cantidad <=0);
			 
		} catch (Exception e) {
			System.out.println("Error de ingreso..");
		}
		
		
		
		
		//codificar la solucion 
		//hacer un ciclo repetitivo hasta el valor ingresado. Si se escribe 2, se debe repetir 2
		for (int i=0; i < cantidad; i++) {//5
            //0,1,2,3,4
			//para comenzar considerando el 1 como valor de inicio se debe incluir el numero en la cantidad
			// for(int i=1; i<= cantidad; i++)
            System.out.printf("*");    		
		}	
		System.out.println("\n----");
        for (int i=cantidad; i >0; i--) {//5
	       System.out.println("*");
      }
	}
}
