package com.desafiolatam;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// CALCULO INDICE MASA CORPORAL

		System.out.println("Ingrese su edad");
		int edad = sc.nextInt();
		if (edad < 18) {
			System.out.println("Usted no puede usar este sistema");
		} else {

			System.out.println("cuál es su estatura en metros?");
			Float estatura = sc.nextFloat();
			if (estatura <= 0) {
			  System.out.println("Error en el ingreso de la estatura");
			} else {
			  System.out.println("Ingrese su peso en kilogramos");
			  Float Kilos = sc.nextFloat();
			  if (Kilos <= 0) {
				System.out.println("Error en el ingreso de los Kilos");
			} else {

			  Float imc = Kilos / (estatura * estatura);
			  System.out.println("Su IMC es " + imc);
			  if (imc < 18.5) {
				 System.out.println("Bajo peso");
			  } else if (imc >= 18.5 && imc < 25) {
				 System.out.println("Normal");
			  } else if (imc >= 25 && imc < 30) {
				 System.out.println("Sobrepeso");
			  } else {
				 System.out.println("Obeso");
			  }
			 }
		   }
		}
	}
}
