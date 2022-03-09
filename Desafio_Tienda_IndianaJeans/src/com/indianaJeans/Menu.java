package com.indianaJeans;

import java.util.Scanner;

public class Menu {

	public void menu1() {
		Scanner sc = new Scanner(System.in);
		ProductoServicio productoServicio = new ProductoServicio();
		ExportarTxt exportador= new ExportarTxt();
		Utilidad utilidad = new Utilidad();
				
		int opcion = 0;

		try {
			do {

				System.out.println("�Qu� operaci�n desea realizar?\n");
				System.out.println("-------------------------------");
				System.out.println("    1 Listar Producto          ");
				System.out.println("    2 Agregar Producto         ");
				System.out.println("    3 Exportar Datos           ");
				System.out.println("    4 Salir                    ");
				System.out.println("-------------------------------");
				System.out.println("*** Ingrese una opci�n ***");
				opcion = sc.nextInt();
				sc.nextLine();
							
				switch (opcion) {
				case 1:
					productoServicio.listarProductos(sc);
					utilidad.tiempoEspera();
					utilidad.limpiezaPantalla();
					break;
				case 2:
					productoServicio.agregarProductos(sc);
					utilidad.tiempoEspera();
					utilidad.limpiezaPantalla();
					break;
				case 3:
					exportador.exportar(productoServicio.getListaProductos());
					utilidad.tiempoEspera();
					utilidad.limpiezaPantalla();
					break;
				case 4:
					utilidad.tiempoEspera();
					System.out.println("Abandonando el sistema de productos.....\nAcaba de salir sistema!!!\n\n");
					utilidad.limpiezaPantalla();
					break;

				default:
					break;
				}
			} while (opcion >= 1 && opcion <= 4);
			System.out.println("Opci�n ingresada inv�lida...Intente nuevamente su ingreso al sistema!!");
						
		} catch (Exception e) {
			System.out.println("Error de ingreso de informaci�n, ingrese nuevamente al sistema!!");
			e.printStackTrace();
		}
		sc.close();
	}

}
