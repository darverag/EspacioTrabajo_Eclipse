package com.desafiolatam;

import java.util.Scanner;

public class Hola {

  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	// syso ctrl + espacio
	/*
	System.out.println("Hola\n Clase G6,");
	System.out.println("buenas tardes!!");
	System.out.printf("estamos\ten\tclases\n ");
	//\n nuevo salto de linea
	System.out.printf("de java\n");
	
	*/
	System.out.println("*******************");
	System.out.println("Ingrese su nombre");
	String nombre = sc.next();
	System.out.println("Ingrese su apellido");
	String apellido = sc.next();
	System.out.println("Ingrese su edad");
	Integer edad = sc.nextInt();
		
		//VARIABLES
		String calle= "ads 234"; /* variables tipo string pueden ser numeros, letras,
		caracteres multiples, excepto comillas dobles */
		
		
		int numero = 3 ; /*variable primitiva*/
		Integer numero1 = 3;
				
		//+ suma de string, se conxcatenan/juntan los textos
		//String + String = String
		System.out.println("123"+" 456");
		//numero+String =String
		System.out.println(123+ "456");
		//String + boolean = String
		System.out.println("123"+true);
		//numero + numero= numero
		System.out.println(123+456);
		
		//SubString, toda String desde la posicion cero
		String palabra = "Paralelepipedo";
		System.out.println(palabra.substring(0, 4));
		System.out.println(palabra.substring(4, 8));
		System.out.println(palabra.substring(8));
		
		String uno_caracter   ="1"; /*Uno es la variable*//*Este dato "1" es un caracter*/
		String uno_palabra  ="uno";
		Integer uno_numero = 1;
		
		final float PI = 3.14f;
		final float FUERZA_G = 9.8f;
		
		
	}

	//fin
}
