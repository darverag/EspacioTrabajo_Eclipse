package com.desafiolatam;

public class Calculadora {

	public Double metodoRestar(Double d, Double e) {
		Double resta = 0D;
		if (d != null && e != null) {
			resta = d - e;
			System.out.println("El resultado de la resta es: " + resta);
		}
		return resta;
	}

	
	public Double metodoSumar(Double d, Double e) {
		Double suma = 0D;
		if (d != null && e != null) {
			suma = d + e;
			System.out.println("El resultado de la sumatoria es: " + suma);
		}
		return suma;
	}

	
	public Double metodoMultiplicar(Double d, Double e) {
		Double multiplicar = 0D;
		if (d != null && e != null) {
			multiplicar = d * e;
			System.out.println("El resultado de la multiplicación es: " + multiplicar);
		}
		return multiplicar;
	}

	
	public Double metodoDividir(Double d, Double e) {
		Double dividir = 0D;
		if (d != null && d != 0 && e != null && e != 0) {
			dividir = d / e;
			System.out.println("El resultado de la división es: " + dividir);
		}
		return dividir;
	}
}
