package com.desafiolatam;

import java.util.Scanner;

public class Menu {
	
	public void menuInicio () {
		
		Scanner sc = new Scanner(System.in);
		ConsumirApi consumirapi = new ConsumirApi();
		Utilidad utilidad = new Utilidad();
		
		int opcion = 0;
		
		try {
			do {
				
				System.out.println("\n-------------------------------------------");
				System.out.println("        ¿Qué acción deseas realizar?");
				System.out.println("--------------------------------------------");
				System.out.println("1.- Mostrar lista Libros completa           "); //
				System.out.println("2.- Mostrar lista libros por autor y titulo "); // 
				System.out.println("3.- Mostrar lista libros por posición       "); //
				System.out.println("4.- Mostrar lista libros con detalles       "); //
				System.out.println("5.- Mostrar lista libros autor desconocido  "); 
				System.out.println("6.- Mostrar lista libros con delivery       "); 
				System.out.println("7.- Salir                                   "); 
				System.out.println("--------------------------------------------");
				System.out.println("       ***Digita una opción***"              );
				System.out.println("--------------------------------------------\n");
				opcion = sc.nextInt();
				sc.nextLine();

				switch (opcion) {
				case 1:
					consumirapi.metodoObtenerListaLibros();
					//utilidad.tiempoEspera();
					//utilidad.limpiezaPantalla();
					break;
					
				case 2:
					consumirapi.metodoObtenerListaAutorTitulo();
					//utilidad.tiempoEspera();
					//utilidad.limpiezaPantalla();
					break;
					
				case 3:
					consumirapi.metodoObtenerListaPosicion();
					//utilidad.tiempoEspera();
					//utilidad.limpiezaPantalla();
					break;
					
				case 4:
					consumirapi.metodoObtenerApiDetalles();
					//utilidad.tiempoEspera();
					//utilidad.limpiezaPantalla();
					break;
					
				case 5:
					consumirapi.metodoObtenerAutorUknown();
					//utilidad.tiempoEspera();
					//utilidad.limpiezaPantalla();
					break;
					
				case 6:
					consumirapi.metodoObtenerDelivery();
					//utilidad.tiempoEspera();
					//utilidad.limpiezaPantalla();
					break;
				case 7: //salir
					utilidad.tiempoEspera();
					System.out.println("*Saliendo del sistema....Adiós!!!*");
					utilidad.limpiezaPantalla();
					break;


				default:
					break;
				}

			} while (opcion >= 1 && opcion <= 7);
			System.out.println("Opción ingresada inválida...Intente nuevamente su ingreso al sistema!!");
			
		} catch (Exception e) {
			System.out.println("Error de ingreso de información, ingrese nuevamente al sistema!!");
			
		}
		
	}

}
