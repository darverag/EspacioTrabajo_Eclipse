package com.desafiolatam;

import java.util.Scanner;

public class Resistencia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Calculo resistencia total

		System.out.println("Ingrese resistencia 1");
		Float r_1 = sc.nextFloat();
		if (r_1 < 0)
			System.out.println("Ingresar valor positivo");
		else {
			System.out.println("Ingrese resistencia 2");
			Float r_2 = sc.nextFloat();
			if (r_2 < 0)
				System.out.println("Ingresar valor positivo");
			else {
				System.out.println("Ingrese resistencia 3");
				Float r_3 = sc.nextFloat();
				if (r_3 < 0)
					System.out.println("Ingresar valor positivo");
				else {

					float resistenciaTotal = 1 / ((1 / r_1) + (1 / r_2) + (1 / r_3));

					System.out.println("***********************************************");
					System.out.println("La resistencia total es de =  " + resistenciaTotal);
					System.out.println("***********************************************");
				}
			}

		}
	}
}
