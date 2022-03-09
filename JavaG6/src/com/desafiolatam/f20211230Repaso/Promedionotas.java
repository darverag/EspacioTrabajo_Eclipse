package com.desafiolatam.f20211230Repaso;

import java.util.Scanner;

public class Promedionotas {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Ingrese nombre completo del estudiantes");
		String nombre=sc.nextLine();
		System.out.println("Ingrese nombre asignatura");
		String Asignatura=sc.nextLine();
		System.out.println("Ingrese nombre del docente");
		String docente=sc.nextLine();
		
		System.out.println("Ingrese nota 1 del alumno");
		Float nota1=sc.nextFloat();
		
		System.out.println("Ingrese nota 2 del alumno");
		Float nota2=sc.nextFloat();
		
		System.out.println("Ingrese nota 3 del alumno");
		Float nota3=sc.nextFloat();
		
		System.out.println("**********************************");
		System.out.println("*********** Resumen **************");
		System.out.println("**********************************");
		
		Float promedio=(nota1+nota2+nota3)/3;
		
		System.out.println("Su promedio final es= "+promedio);
				
//Solución ejercicio propuesto 3
		
		if(promedio<4) {
			System.out.println("Debes dar una prueba de recuperación para poder rendir examen final");
		}else if (promedio>=4 && promedio<5.5) {
			System.out.println("Debes rendir el examen final para aprobar");
		}else if (promedio>=5.5){ 
			System.out.println("Felicitaciones! Te eximiste del examen y aprobaste");
		
	}

	}
}

