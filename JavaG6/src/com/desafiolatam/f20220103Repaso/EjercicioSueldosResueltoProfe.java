package com.desafiolatam.f20220103Repaso;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioSueldosResueltoProfe {

	public static void main(String[] args) {
		/*
		 * tamaño arreglo 6; tamaño 6 Crear un array a partir de los datos ingresados
		 * por el usuario, buscar aquellos que esten en el rango solicitado al usuario
		 * los guarda en el otro array y los muestra.
		 */
		Scanner sc=new Scanner (System.in);
		
		int [] numeros1= new int [6];
		int [] numeros2= new int [6];
		
		for (int i = 0; i < 6; i++) {
			System.out.println("Ingrese "+(i+1)+" numero al arreglo");
			numeros1[i] = sc.nextInt(); //es lo mismo que numeros1[i] = digito;
			
		}
		System.out.println("***************************************");
		
		System.out.println("Ingrese rango inicio");
		int inicio = sc.nextInt();
		System.out.println("Ingrese rango fin");
		int fin=sc.nextInt();
		int contador =0;//Este contador cuenta cuantos valore complen con la condiciones de inicio y fin
					//Aqui es lo mismo que indicar 6, tamaño de arreglo
		for (int i = 0; i < numeros1.length; i++) {
			if(numeros1[i]>= inicio && numeros1[i]<=fin) {
				numeros2[contador]=numeros1[i];//Se utiliza contador para partir desde la posicion 0
				contador++;
			}
			
		}
		System.out.println("Array lleno: "+Arrays.toString(numeros1));//Esto convierte el arreglo a String
		System.out.println("Nuevo array : "+Arrays.toString(numeros2));
	}

}
