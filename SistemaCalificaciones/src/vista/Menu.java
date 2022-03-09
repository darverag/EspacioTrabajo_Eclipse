package vista;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import modelo.Alumno;
import modelo.Materia;
import modelo.MateriaEnum;
import servicio.AlumnoServicio;
import servicio.AlumnoServicioImp;
import servicio.ArchivoServicio;
import servicio.ArchivoServicioImp;
import util.Util;

public class Menu extends MenuTemplate {

	private Util util;
	private AlumnoServicio alumnoServicio = new AlumnoServicioImp();
	private ArchivoServicio archivoServicio = new ArchivoServicioImp();

	@Override
	public void cargarDatos() {
		System.out.println("Ingrese la ruta del archivo con los datos");
		String ruta =sc.nextLine();
		
		Map<String, Alumno> alumnos = archivoServicio.cargarDatos(ruta);
		alumnoServicio.setListaAlumnos(alumnos);
		
		System.out.println("Datos cargados correctamente");
		

	}

	@Override
	public void exportarDatos() {
		System.out.println("Ingrese la ruta para exportar la infomración");
		String ruta = sc.nextLine();
		
		archivoServicio.exportarDatos(alumnoServicio.listarAlumnos(), ruta);
		System.out.println("Los datos han sido exportados");

	}

	@Override
	public void crearAlumno() {
		// Esta es la información necesaria para poder crear un alumno
		System.out.println("Ingrese el RUT");
		String rut = sc.nextLine();
		System.out.println("Ingrese el nombre");
		String nombre = sc.nextLine();
		System.out.println("Ingrese el apellido");
		String apellido = sc.nextLine();
		System.out.println("Ingrese la dirección");
		String direccion = sc.nextLine();

		Alumno alumno = new Alumno(rut, nombre, apellido, direccion, null); // se crea alumno pasando parametros

		alumnoServicio.crearAlumno(alumno);// se utiliza luego alumnoservicio para pasarle los datos del alumno creado

	}

	@Override
	public void agregarMateria() {// Para agregar materia, se necesita obtener el rut del alumno
		System.out.println("Ingrese el RUT del alumno"); // se pide dato
		String rut = sc.nextLine();// Se captura dato

		Materia materia = new Materia(); // una vez creado el constructos sin parametros de materia (sin nota, sin
											// nombre), es el usuario quien debe crearla

		System.out.println("1. Matemáticas");
		System.out.println("2. Lenguaje");
		System.out.println("3. Ciencia");
		System.out.println("4. Historia");
		System.out.println("Selecciona una materia");
		String seleccion = sc.nextLine();

		switch (seleccion) {
		case "1":
			materia.setNombre(MateriaEnum.MATEMATICAS);
			break;

		case "2":
			materia.setNombre(MateriaEnum.LENGUAJE);
			break;

		case "3":
			materia.setNombre(MateriaEnum.CIENCIA);
			break;

		case "4":
			materia.setNombre(MateriaEnum.HISTORIA);
			break;

		}
		alumnoServicio.agregarMateria(rut, materia);

	}

	@Override
	public void agregarNota() { //Para agregar un anota igual se necesita saber el rut del alumno
		System.out.println("Ingrese el RUT del alumno"); // se pide dato
		String rut = sc.nextLine();// Se captura dato
		
		List<Materia>materias = alumnoServicio.materiasPorAlumno(rut);
		
		//Para cada una de las materias se recorrera la lista e imprimé el listado de las materias disponibles por alumno, de esta forma se imprime el 
		//indice de la Materia.Para poder imprimir la materia se necesita hacer la impresion, entregar el valor de la materia y el nombre de esta.
		materias.forEach(materia -> System.out.println(materias.indexOf(materia) + " - " + materia.getNombre()));
		//Luego se pide al usuario que seleccione una materia
		System.out.println("Seleccionar una materia");
		
		String seleccion = sc.nextLine();//Se declara una variable para obtener la seleccion del dato del usuario
		
		//luego desde la lista de materia, obtener la materia seleccionada. En este caso el String de seleccion debe transformarse a un entero
		Materia mate = materias.get(Integer.valueOf(seleccion));
		if (mate !=null) {   //Se verifica si materia realmente existe
			System.out.println("Ingrese la nota");
			Double nota = sc.nextDouble();
			if(mate.getNotas() !=null) {
				mate.getNotas().add(nota);
			}else {
				//si existe se ingresa una nota a la materia. Para agregar la nota a una materia se debe obtener la nota para luego definirla a una lista de notas
				List<Double> notas = new ArrayList<Double>();
				notas.add(nota);
				mate.setNotas(notas);
			}
			
			System.out.println("La nota ha sido agregada a " +mate.getNombre());
			
		}else { //si no existe se envia mensaje al usuario
			System.out.println("Selección errónea");
		}

	}

	@Override
	public void listarAlumnos() {// para verificar la creación del alumno se implementara listar alumno .
		alumnoServicio.listarAlumnos().entrySet().forEach(entry -> { // alumnoServicio es quien conoce la lista de
																		// alumnos. Se tiene que iterar en la lista (
																		// iterar en el mapa) usando entrySet().forEach.
																		// para que cada
			// valor que este disponible en el mapa, se hará una acción. El entry
			// corresponde a un String, Alumno, por la tanto se puede pedir el alumno, que
			// es el valor guardado en este entry.
			Alumno alumno = entry.getValue();// Aquí ya se tiene al alumno
			// ahora se imprime información del alumno con los metodos de acceso (getters)
			System.out.println("Rut: " + alumno.getRut());
			System.out.println("Nombre: " + alumno.getApellido());
			System.out.println("Apellido: " + alumno.getApellido());
			System.out.println("Dirección: " + alumno.getDirección());

			// Ahora se verifica que el alumno tenga un lista de materia, es decir que sea
			// distinta de null y en el caso que sea distinta de null, se imprime.
			if (alumno.getMateria() != null) {
				// aquí se solicita imprimir la materia
				System.out.println("Materias del alumno");
				alumno.getMateria().forEach(materia -> { // se imprime las notas por cada materia de forma directa con
															// toString. Aparece el nombre de la materia y la nota
															// respectiva, según las materias que tenga.
					System.out.println(materia.getNombre().name());
					System.out.println(materia.getNotas().toString());
				});
			}
		});
	}

	@Override
	public void terminarPrograma() {
		Util.limpiarPantalla();
		System.out.println("Gracias por usar nuestro sistema");
		System.exit(0);
		

	}

}
