package modelo;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		//Creacion de listas
		ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
		ArrayList<Profesor> listaProfesores = new ArrayList<>();
		
		//agregar datos a las listas
		
		listaEstudiantes.add(new Estudiante ("1","Juan",true));
		listaEstudiantes.add(new Estudiante ("2", "Andrés",true));
		listaEstudiantes.add(new Estudiante ("3", "Juan",false));
		listaProfesores.add(new Profesor ("10", "Jose",true));
		
		//se recorren las listas para cada tipo con for each
		/*Aqui se utiliza método toString() heredado de clase Persona y nos muestra los 
		 * atributos que se les dio a los individuos. */
		
		for(Profesor profesor :listaProfesores) {
			System.out.println(profesor.toString());
		}
		for(Estudiante estudiante:listaEstudiantes) {
			System.out.println(estudiante.toString());
		}
		
		System.out.println("*********************************************");

		//utilizando poliformismo para crear solo una lista
		
		ArrayList<Persona> lista =new ArrayList<>(); //Se crea lista
		
		//se agregan datos a la lista
		lista.add(new Estudiante ("1", "Juan", true));
		lista.add(new Estudiante ("2", "Andres", true));
		lista.add(new Estudiante ("3", "Juan", false));
		lista.add(new Profesor ("10", "Jose", true));
		
		//se recorre lista con for each, luego de haber creado solo una lista con todos los individuos
		/*Esto es posible con polimorfismo, que indica que la instancia de una subclase 
		 * (Estudiante y profesor), puede ser tratada como si fuese una instancia de su superclase(Persona)
		 * durante la ejecucion del programa. Así se pueden usar metodos que se compartan entre la super
		 * clase y subclase, como  en este ejemplo el metodo toString().
		 * En el caso de existir un metodo que la instancia no tiene, arrojará una excepcion de metodo no
		 * encontrado. Estos cosas se trabajan con un metodo para obtener la clase de un instancia,
		 * este método se hereda desde la clase Object y se llama getClass().
		 * 
		 */
		for(Persona individuo :lista) {
			System.out.println(individuo.toString());
		}
		
		System.out.println("***********************************************");
		
		
		//casteo de clases
		/*consiste en un procedimiento para trasformar una variable primitiva de un tipo a 
		 * otro o para trasnformar objetos de una clase a otra, siempre y cuando haya una relacion de 
		 * herencia entre ambas.
		 */
		
		//imprimir por pantalla el nombre de clase de cada instancia dentro de la lista
		/*Usando getClass(), esto retorna un tipo de dato llamado class que sirve para comparar clases.
		 * Se usa metodo getsimpleName() para convertir el nombre de la clase a un String y 
		 * se usara este para imprimir por pantalla.
		 */
		
		for(Persona individuo :lista) {
			System.out.println(individuo.getClass().getSimpleName());
		}
		
		
	}
	

}
