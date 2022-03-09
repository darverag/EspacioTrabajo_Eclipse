package com.desafiolatam;

import java.util.Scanner;

public class EjercicioClases {

	public static void main(String[] args) {
		/*Escribir un m�todo que reciba un n�mero e imprima en consola Desafio si el n�mero es divisible por 5,
		 *  imprima Latam si el n�mero es divisible por 3, DesafioLatam si el n�mero es divisible por 3 y 5 
		 *  y para el resto de los casos imprimir el n�mero ingresado. //usar if para resolver*/

		Scanner escaner = new Scanner (System.in);
		System.out.println("Ingrese un numero");
		int num = escaner.nextInt();
		
		desafioLatam(num);
		
	}
	
	 public static void desafioLatam (int num) {
		
		if(num%3==0 && num%5==0) {
			System.out.println("DesafioLatam");
		}else if (num%3==0) {
			System.out.println("Latam");
		}else if (num%5==0) {
			System.out.println("Desafio");
		}else {
			System.out.println(num);
			
		}
		
	}

}
