package com.desafiolatam;

import java.util.Scanner;

public class promedio {

	public static void main(String[] args) {
		// TODO Calificaciones estudiante*/
	
		Scanner sc = new Scanner(System.in);
		
    System.out.println("Ingresar nombre completo del estudiante");
	String nombre = sc.nextLine();
	System.out.println("Ingresar nombre asignatura");
	String asignatura = sc.nextLine();
	System.out.println("Ingresar nombre del docente");
	String docente = sc.nextLine();
	
		
	System.out.println("Ingresar nota 1 del alumno");
	Float nota1 = sc.nextFloat();
		
	System.out.println("Ingresar nota 2 del alumno");
	Float nota2 = sc.nextFloat();
		
	System.out.println("Ingresar nota 3 del alumno");
	Float nota3 = sc.nextFloat();
		
	System.out.println("**********************************");
	System.out.println("*********** Resumen **************");
	System.out.println("**********************************");
	
	float promedio = (nota1+nota2+nota3)/3;
		
	System.out.println("El promedio final es =  "+promedio);
	
	//Solución ejercicio propuesto 3
	
	if(promedio<4) {
		System.out.println("Debes dar una prueba de recuperación para poder rendir examen final");
	}else if (promedio>=4 && promedio<=5.5){
		System.out.println("Debes rendir el examen final para aprobar");
	}else if (promedio>=5.5) {
		System.out.println("Felicitaciones! Te eximiste del examen y aprobaste");
	
	    }
	  }	
		
	}

