package com.desafiolatam.f20211209;

public class Promedio {

	public static void main(String[] args) {
		
System.out.println(promedio());	}

	public static double promedio () {
		double promedio = 0d;
		int[] sueldos = { 400000, 760000, 1100000,650000, 654980, 987300, 700450, 442300 };
		int parcial =0;
		int contador=0;
		for (int i = 0; i < sueldos.length; i++) {
			int sueldo =sueldos [i];
			if(sueldo> 500000) {
				parcial = parcial + sueldo; contador++;
											}
		}		
		promedio=parcial/contador;
		return promedio;
	}

}