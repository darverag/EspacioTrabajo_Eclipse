package com.desafiolatam.f20220103Repaso;

import java.util.Arrays;
import java.util.Scanner;

public class CreandoArreglosConIngresoDatosInicioYFin {

	public static void main(String[] args) {
		/*
		 * tamaño arreglo 6; tamaño 6 Crear un array a partir de los datos ingresados
		 * por el usuario, buscar aquellos que esten en el rango solicitado al usuario
		 * los guarda en el otro array y los muestra.
		 */
		Scanner sc = new Scanner(System.in);

		int[] numeros = new int[6];
		int[] numeros2 = new int[6];
		int contador = 0;

		System.out.println("Ingrese digito posición 0");
		int digito = sc.nextInt();
		numeros[0] = digito;
		System.out.println("Ingrese digito posicion 1");
		digito = sc.nextInt();
		numeros[1] = digito;
		System.out.println("Ingrese digito posicion 2");
		digito = sc.nextInt();
		numeros[2] = digito;
		System.out.println("Ingrese digito posicion 3");
		digito = sc.nextInt();
		numeros[3] = digito;
		System.out.println("Ingrese digito posicion 4");
		digito = sc.nextInt();
		numeros[4] = digito;
		System.out.println("Ingrese digito posicion 5");
		digito = sc.nextInt();
		numeros[5] = digito;

		System.out.println("Por favor ingrese rango de inicio");
		int inicio = sc.nextInt();
		System.out.println("Por favor ingrese rango final");
		int fin = sc.nextInt();

		for (int i = 0; i < 6; i++) {
			if (numeros[i] >= inicio && numeros[i] <= fin) {
				numeros2[contador] = numeros[i];
				contador++; // uso de variable auxiliar para saber en que posicion estan los elementos

			}

		}
		System.out.println("Array lleno: " + Arrays.toString(numeros));
		System.out.println("Nuevo array: " + Arrays.toString(numeros2));
	}

}
