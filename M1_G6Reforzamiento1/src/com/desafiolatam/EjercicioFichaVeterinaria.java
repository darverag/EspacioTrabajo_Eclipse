package com.desafiolatam;

import java.util.Scanner;

public class EjercicioFichaVeterinaria {

	public static void main(String[] args) {
		Scanner escaner = new Scanner (System.in);
		
		System.out.println("Ingrese nombre del paciente");
		String nombrePaciente = escaner.nextLine();
		
		System.out.println("Ingrese  nombre due�o del paciente");
		String nombreDueno = escaner.nextLine();
		
		System.out.println("Ingrese n�mero tel�fonico");
		int movil = escaner.nextInt();
		
		System.out.println("Ingrese edad del paciente");
		int edad = escaner.nextInt();
		
		imprimirFicha(nombrePaciente,nombreDueno, movil, edad);
	}

	private static void imprimirFicha(String nombrePaciente, String nombreDueno, int movil, int edad) {
		
		System.out.println("*******************************************");
		System.out.println("*******************************************\n");
		System.out.println("Nombre mascota: "+nombrePaciente);
		System.out.println("Nombre Due�o del Paciente: "+nombreDueno);
		System.out.println("Numero tel�fonico: "+movil);
		System.out.println("Edad del paciente: "+edad);
		System.out.println("\n******************************************");
		System.out.println("*******************************************");
		
		
		
	}

}
