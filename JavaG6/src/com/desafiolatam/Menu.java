package com.desafiolatam;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		//Menú modificado con materia metodo
		Scanner sc = new Scanner(System.in);
				
		//variables de control globales
		int opcion = -1;
		do {
			menu();
			opcion=seleccionaOpcion();
			
			
			
			// variables de control globales
			
			// variables
			Float num1 = 0f;
			Float num2 = 0f;
			Float resultado = 0f;

			

			if (opcion == 0) {
				System.out.println("Hasta la proxima!!");
				break;
			} else {
				// solicitar ingreso de a lo menos 2 numeros
				System.out.println("Ingresar numero 1");
				num1 = sc.nextFloat();
				System.out.println("*Ingresar numero 2");
				num2 = sc.nextFloat();
				
				// validar la opcion
				if (opcion == 1) {// sumar
					resultado = num1 + num2;
					System.out.println("*La suma total es " + resultado);
				} else if (opcion == 2) {// restar
					resultado = num1 - num2;
					System.out.println("*La resta total es " + resultado);
				} else if (opcion == 3) {// multiplicar
					resultado = num1 * num2;
					System.out.println("*La multiplicacion total es " + resultado);
				} else {// dividir
					while (num2 == 0) { // resultado = num1 / num2;
						System.out.println("*No se puede dividir por cero");
						System.out.println("*Ingresar numero 2");
						num2 = sc.nextFloat();
					}
					// realizar la operacion
					resultado = num1 / num2;
					// mostrar el resultado
					System.out.println("La division total es " + resultado);
				}
				//MENSAJE GENERICO DE RESULTADO
				System.out.println("*************************");
				opcion = -1;
			}

		} while (opcion == -1); // volver a mostrar menu

//fin 		
	}
	
	private static void menu() {
		System.out.println("*************************");
		System.out.println("*        MENU           *");
		System.out.println("*************************");
		System.out.println("* 1 .- SUMAR            *");
		System.out.println("* 2 .- RESTAR           *");
		System.out.println("* 3 .- MULTIPLICAR      *");
		System.out.println("* 4 .- DIVIDIR          *");
		System.out.println("* 0 .- SALIR            *");
		System.out.println("*************************");
		
		
	}
	
	public static int seleccionaOpcion() {
		    int opcion=0;
		    int contador=0;
		    Scanner sc2 = new Scanner(System.in);
		    
			do {

				System.out.println("* Seleccione una opcion *");
				opcion = sc2.nextInt();

				contador = contador + 1;// variable de control
				if (contador == 4) {// solo 4 veces
					opcion = 0;// limpiar la variable
					break;
				}

				// <-1 2 3 4->
			} while (opcion < 0 || opcion > 4);
			
			return opcion;
	}
   	
	
	
}


