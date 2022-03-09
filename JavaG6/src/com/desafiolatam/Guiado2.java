package com.desafiolatam;

import java.util.Scanner;

public class Guiado2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		/*
		Escribir Texto para un destinatario de una encomienda.
		Para ello debemos pedir al usuario los distintos campos
		que se requerirán: 
			● Nombre String
			● Apellido String
			● Dirección String
			● Número Dirección Integer - String
			● Ciudad String
			● Teléfono String
		*/
		
		System.out.println("Ingrese el nombre del destinatario");
		String nombre = sc.next();
		System.out.println("Ingrese el apellido del destinatario");
		String apellido = sc.next();
		System.out.println("Ingrese el dirección del destinatario");
		String direccion = sc.next();
		System.out.println("Ingrese el numero dirección del destinatario");
		String numero = sc.next();
		System.out.println("Ingrese el ciudad del destinatario");
		String ciudad = sc.next();
		System.out.println("Ingrese el telefono del destinatario");
		String telefono = sc.next();
		System.out.println("************************");
		System.out.println("*   Destinatario  *");
		System.out.println("************************");
		
		System.out.println("El destinatario es "+ nombre+ " " +apellido);
		System.out.println("la dirección de destino es "+direccion+" #"+numero);
		System.out.println("ubicada en "+ciudad);
		System.out.println("favor avisar al telefono "+telefono);
		
		
		
		

		
	
		
		
		
	}

}
