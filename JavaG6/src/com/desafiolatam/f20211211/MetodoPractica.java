package com.desafiolatam.f20211211;

public class MetodoPractica {

	public static void main(String[] args) {
		// Formas de abordar:
		//1.- crear una variable
		
		
		double resultado =suma(56.15, 15.65);//Aquí se llama al metodo suma, ingresando de forma directa 2 valores de tipo double.
		// double resultado, es una variable que guarda la operacion.
		System.out.println("El resultado de la operación es "+ resultado);// se imprime resultado
		
		double resta= resta (99.5689, 56.7859);// Al ser Void no se puede imprimir desde acá, al estar en un metodo void, no retorna.
		
	}
	public static Double suma (Double numero, Double numero2) {// aqui se define que tipo de dato entrará en el metodo
		double suma = numero + numero2; //Operacion suma
		System.out.println("El resultado de la suma es " +suma);	
		return suma; //retorna main
				
	}
	/*public static void resta (Double numero, Double numero2) {
		double resta= numero - numero2;
		System.out.println("El resultado de la resta es "+ resta);
				
	}*/
	 public static Double resta( Double numero, Double numero2) {
		double resta= numero - numero2;
		System.out.println("El resultado de la resta es "+ resta);	
		return resta;//retorna a main
	}
}

