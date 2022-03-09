package com.desafiolatam;

public class Calculadora {

	public Double metodoRestar(Double a, Double b) {
		Double resta = 0D;
		if (a != null && b != null) {
			resta = (a - b);
			System.out.println("El valor de la operación restar es: " + resta);
		}
		return resta;
	}

	public Double metodoSumar(Double a, Double b) {
		Double suma = 0D;
		if (a != null && b != null) {
			suma = (a + b);
			System.out.println("El valor de la operación es: " + suma);
		}
		return suma;
	}
	
	public Double metodoMultiplicar(Double a, Double b) {
		Double multiplicar = 0D;
		if(a != null && b !=null) {
			multiplicar = (a*b);
			System.out.println("El valor de la operación es: " + multiplicar);
		}
		return multiplicar;
	}
	
	public Double metodoDividir(Double a, Double b) {
		Double dividir = 0D;
		if(a !=null && a !=0 && b !=null && b !=0) {
			dividir = (a/b);
			System.out.println("El valor de la operación es: " + dividir);
		}
		return dividir;
	}
}
