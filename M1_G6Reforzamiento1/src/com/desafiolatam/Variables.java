package com.desafiolatam;

import java.util.Scanner;

public class Variables {

	public static void main(String[] args) {
		int i=0; //variable tipo primitiva (int, float, double, char, boolean) se escribe en minusculas
		Integer j=5;//Integer es una clase y se escriba con mayuscula la primera letra
		            //Las clases en su interna tiene un metodo, metodo toString, retorna un String..
		String numeroString =j.toString();
		
		System.out.println(j+1);/// valor 6
		System.out.println(numeroString+1);//String + numero = String concatenado //valor 51
		
		System.out.println("El numero es "+7);
		
		System.out.println("------------");
		
		String numTexto= "9";
		int num= Integer.parseInt(numTexto);
		System.out.println(numTexto+1); //String+numero=String concatenado//Metodo parsient toma un unt y devuelve un String
		System.out.println(num+1);
		
		
		String letras = "abc";//String es una clase y guarda una cadena de caracteres, va entre comillas doble.
		char letra= 'a';// char funciona con solo un caracter y va entre comillas simples
		System.out.println("substring: "+letras.substring(0));
		
		boolean esmayorDeEdad = true;
		
		Integer a=3 ;
		System.out.println("El valor es: "+ a);
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Ingreso numero: ");
		int numeroEntero= sc.nextInt();
		
		
	}
	

}
