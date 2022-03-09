package com.desafiolatam;

import java.util.Scanner;

public class Ciclowhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/**
		 * WHILE
		 */
		
		int numero = 0;
		
		while (numero <4) {
			System.out.println("Dentro del while");
			numero = numero +1;  //esto se llama incrementar la variable, condicion de termino
			//siempre debo agregar una condicion de termino
		}
		System.out.println("Fuera del While");
	}

}
