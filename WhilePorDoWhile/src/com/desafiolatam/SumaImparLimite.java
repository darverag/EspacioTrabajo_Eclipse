package com.desafiolatam;

import java.util.Scanner;

public class SumaImparLimite {

				public static void main(String[] args) {
				// Suma Impar l�mite
				
				Scanner sc = new Scanner(System.in);
				// Solicitud ingreso l�mite inferior 
				// Solicitud  ingreso l�mite m�ximo
				// sumar solo n�meros impares
				// mostrar la suma

				int min = 0;
				int max = 0;
				int sumImpar = 0;

				System.out.println("Ingrese el n�mero m�nimo a sumar impares: ");
				min = sc.nextInt();
				
				System.out.println("Ingrese el n�mero m�ximo a sumar impares: ");
				max = sc.nextInt();
				
				
				for (int i = min; i <= max; i++) {
					if (i % 2 != 0) {
						System.out.println(i);
						sumImpar = sumImpar + i;
					}
				}
				System.out.println(sumImpar);

				sc.close();
			}

	
	}


