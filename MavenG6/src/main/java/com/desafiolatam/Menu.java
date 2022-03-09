package com.desafiolatam;

import java.util.Scanner;

public class Menu {

	public void menuInicio() {

		Scanner sc = new Scanner(System.in);
		//System.out.println("Hello World!\n");
		ConsumirApi consumirapi = new ConsumirApi();
		
		int opcion = 0;
		do {
			// menu
			// mostrar, actualizar, eliminar, agregar, (salir.)
			System.out.println("\n¿Qué acción deseas realizar?\n");
			System.out.println("   Mostrar Datos     1"); //FUNCIONA OK
			System.out.println("   Actualizar Datos  2"); // ARROJA ERROR
			System.out.println("   Agregar Datos     3"); //FUNCIONA OK
			System.out.println("   Eliminar Datos    4"); //FUNCIONA OK
			System.out.println("   Salir             0\n"); //FUNCIONA OK
			System.out.println("***Digita una opción***");
			opcion = sc.nextInt();
			sc.nextLine();

			switch (opcion) {
			case 1:
				consumirapi.obtenerApi(sc);// mostrar
				break;
			case 2:
				consumirapi.metodoPut(sc);// actualizar
				break;
			case 3:
				consumirapi.metodoPost(sc);// agrega
				break;
			case 4:
				consumirapi.metodoDelete(sc);// delete
				break;
			case 5:
				System.out.println("Saliendo del sistema, adios!!");

				break;

			default:
				break;
			}

		} while (opcion >= 1 && opcion <= 4);
	}

}
