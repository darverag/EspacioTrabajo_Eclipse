package com.desafiolatam.f20220103Repaso;

import java.util.Scanner;

public class SumaArreglos {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		//solicitar al usuario el  inicio y fin del rango a consultar
		
			int inicio=0;
			int fin=0;
		
		do {
			System.out.println("Por favor ingrese rango inicio");
			 inicio =sc.nextInt();
			System.out.println("Por favor ingrese rango fin");
			 fin=sc.nextInt();
			
			if(fin<inicio) {
				System.out.println("El rango fin  no puede ser menor que el número: "+inicio);
			}
			     	
		}while (fin<inicio);
			
			
		int[] numeros = {4,6,687,45,977,354,1,23,5,576,741};

		
		//inicializar el arreglo, crear variable acumuladora.
		int sumaTotal=0; //variable = variable +algo
		
		for (int i = 0; i < numeros.length; i++) {//for crtl + barra espaciadora
			
			//if(numeros[i]>=minimo && numeros [i]<=maximo && numeros[i]%2!=0) {
			if(numeros[i]>=inicio && numeros[i]<=fin) {	
			sumaTotal = sumaTotal + numeros [i];// Se indica en [] la i ya que parte en posicion 0.
			}
			
		}
		//System.out.println("suma total "+sumaTotal);
		System.out.println("La suma de sus valores es: "+sumaTotal);
		
		
		//////ejercicio sueldos///////
		
		int[] sueldos = {400000,760000,1100000,650000,654980,987300,700450,442300};
		int sumaSueldos=0;//variable acumuladora suma
		int contador=0; //variable acumuladora de los valores que cumplen condicion
		for (int i = 0; i < sueldos.length; i++) {
			if(sueldos[i]>500000) {
				sumaSueldos=sumaSueldos + sueldos[i];//Sueldos [i] valor que cumple condicion.
				contador++;//contador ++ suma de a uno, los elementos que cumplen condicion; sueldos>500000
				//contador++; es lo mismo que decir contador=contador+1;
			}
		}
		int promedio =sumaSueldos/contador;
		System.out.println("El promedio de sueldos es: "+promedio);
		
		
		
		
	
	}

}
