package com.desafiolatam;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		// Suma Impar límite

		Scanner sc = new Scanner(System.in);
		// Recibir ingreso de usuario elementos de la serie de Fibonacci a mostrar.
		// Sumar dos números anteriores
		// Mostrar la suma, hasta el número ingresado.

		int n = 0;
		int i = 2;
		int ant = 0;
		int act = 1;
		int copiaActual = 0;

		try {
			System.out.println("Ingrese la cantidad de números de Fabonacci a mostrar: ");
			n = sc.nextInt();
			if (n <= 0) {
				System.out.println("\n\n***Debe escribir un número mayor a 0***");

			} else {
				if (n >= 1) {
					System.out.println("0");
				}
				if (n >= 2) {
					System.out.println("1");
				}
			}

			while (i <= n) {
				copiaActual = act;
				act = act + ant;
				System.out.println(act);
				i = i + 1;
				ant = copiaActual;

			}
		} catch (Exception e) {
			System.out.println("\n\n***Ingresar solo números****");
		}
		sc.close();
	}

}
