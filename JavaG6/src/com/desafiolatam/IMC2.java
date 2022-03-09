package com.desafiolatam;

import java.util.Scanner;

public class IMC2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// calculo indice masa corporal

		boolean esMenor = false;
		do {
			System.out.println("Ingrese su edad");
			int edad = scanner.nextInt();
			if (edad < 18) {
				esMenor = true;
				System.out.println("Usted no puede usar esta sistema");
			} else {
				esMenor = false;
			}

		} while (esMenor);

		System.out.println("cuál es su estatura en metros?");
		Float estatura = scanner.nextFloat();
		if (estatura <= 0) {
			System.out.println("Error en el ingreso de la estatura");
		} else {
			System.out.println("Ingrese su peso en kilogramos.");
			Float kilos = scanner.nextFloat();
			if (kilos <= 0) {
				System.out.println("Error en el ingreso de los kilos");
			} else {
				Float imc = kilos / (estatura * estatura);
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

		scanner.close();
	}

}
