package com.desafiolatam;

import java.util.Scanner;

public class FichaAlumno {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		
		System.out.println("Ingrese nombre estudiante");
		String nombreEstudiante = escaner.nextLine();
		
		System.out.println("Ingrese asignatura");
		String asignatura = escaner.nextLine();
		
		System.out.println("Ingrese nombre docente");
		String docente = escaner.nextLine();
		
		System.out.println("Ingrese nota 1");
		float nota1 = escaner.nextFloat();
		
		System.out.println("Ingrese nota 2");
		float nota2 = escaner.nextFloat();
		
		System.out.println("Ingrese nota 3");
		float nota3 = escaner.nextFloat();
		
		float prom = calculaPromedio(nota1,nota2,nota3);
		
		//System.out.println("El promedio es: "+prom);
		imprimeFicha(nombreEstudiante,asignatura,docente,prom);

	}

	private static void imprimeFicha(String nombreEstudiante, String asignatura, String docente, float prom) {
		System.out.println("\nNombre estudiante: "+nombreEstudiante);
		System.out.println("Asignatura: "+asignatura);
		System.out.println("Docente: "+docente);
		System.out.println("Promedio: "+prom);
		
	}

	private static float calculaPromedio(float n1, float n2, float n3) {
		float promedio =(n1+n2+n3)/3;
		return (Math.round(promedio*100))/100f;
	}

}
