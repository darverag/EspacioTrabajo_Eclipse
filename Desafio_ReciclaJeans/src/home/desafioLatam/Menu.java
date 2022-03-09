package home.desafioLatam;

import java.util.Scanner;

public class Menu {

	public void menu1() {

		Scanner sc = new Scanner(System.in);
		ProductoServicio productoServicio = new ProductoServicio();
		ArchivoServicio archivoServicio = new ArchivoServicio();
		Utilidad utilidad = new Utilidad();

		int opcion = 0;

		try {
			do {

				System.out.println("\n¿Que operación desea realizar?\n");
				System.out.println("--------------------------------");
				System.out.println("    1 Listar Producto          ");
				System.out.println("    2 Editar Producto         ");
				System.out.println("    3 Importar Datos           ");
				System.out.println("    4 Salir                    ");
				System.out.println("-------------------------------");
				System.out.println("*** Ingrese una opción ***");
				opcion = sc.nextInt();
				sc.nextLine();

				switch (opcion) {
				case 1:
					productoServicio.listarProductos(sc);
					utilidad.tiempoEspera();
					utilidad.limpiezaPantalla();
					break;
				case 2:
					productoServicio.editarDatos(sc);
					utilidad.tiempoEspera();
					utilidad.limpiezaPantalla();
					break;
				case 3:
					productoServicio.setListaProductos(archivoServicio.cargarDatos(sc));
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
			System.out.println("Opción ingresada inválida...Intente nuevamente su ingreso al sistema!!");

		} catch (Exception e) {
			System.out.println("Error de ingreso de información, ingrese nuevamente al sistema!!");
			e.printStackTrace();
		}
		sc.close();
	}
}
