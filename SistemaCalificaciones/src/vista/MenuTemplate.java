package vista;

import java.util.Scanner;

import util.Util;

public abstract class MenuTemplate {

	protected Scanner sc = new Scanner(System.in);

	public abstract void cargarDatos();

	public abstract void exportarDatos();

	public abstract void crearAlumno();

	public abstract void agregarMateria();

	public abstract void agregarNota();

	public abstract void listarAlumnos();

	public abstract void terminarPrograma();

	public final void iniciarMenu() {
		
	
	
			System.out.println("1. Crear Alumnos\n" + "2. Listar alumnos\n" + "3. Agregar materias\n" + "4. Agregar notas\n"
					+ "5. Cargar datos\n" + "6. Exportar datos\n" + "7. Salir");
			
			System.out.println("Ingrese su selección");
			Integer seleccion = sc.nextInt();
			sc.nextLine();
			
			switch (seleccion) {
			case 1:
				crearAlumno();
				break;
			case 2:
				listarAlumnos();
				break;
			case 3:
				agregarMateria();
				break;
			case 4:
				agregarNota();
				break;
			case 5:
				cargarDatos();
				break;
			case 6:
				exportarDatos();
				break;
			case 7:
				terminarPrograma();
				break;
			default:
				System.out.println("La selección no es válida");
		}
		Util.limpiarPantalla();
		iniciarMenu();
		
	}

}
