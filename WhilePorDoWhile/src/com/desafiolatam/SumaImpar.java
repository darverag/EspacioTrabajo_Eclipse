package com.desafiolatam;

import java.util.Scanner;

public class SumaImpar {

	public static void main(String[] args) {
		// Solo Impares

				Scanner sc = new Scanner(System.in);
				// Solicitar a usuario ingreso de numero para sumar impares.
				// sumar solo números impares
				// mostrar la suma

				int n = 0;
				int sumImpar = 0;

				System.out.println("Ingrese el número para sumar impares: ");
				n = sc.nextInt();
				
				for (int i = 0; i <= n; i++) {
					if (i % 2 != 0) {
						//System.out.println(i);
						sumImpar = sumImpar + i;
					}
				}
				System.out.println(sumImpar);

				sc.close();
			}
}
