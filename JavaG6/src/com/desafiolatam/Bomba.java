package com.desafiolatam;

import java.util.Scanner;

public class Bomba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		//solicitar numero
		System.out.println("Ingresar numero de inicio de secuencia");
		
		try {
		//almacenar numero
		 numero =sc.nextInt();
		}catch (Exception e) {
			//System.out.println("error -> "+e);
			System.out.println("Error ingreso de datos...");
		}finally {
			
			//Imstrucciones que se ejecutan, tanto si hay
			//como si no hay excepciones
		}
		
		//recorrer en forma inversa (Descontar con for)
		for(int i= numero; i >=0; i= i--) {
		//imprimir cada ciclo
			System.out.println(" segundos -> " + i);
		}
		System.out.println("Fin del programa");
	}
}
