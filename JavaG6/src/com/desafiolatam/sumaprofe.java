package com.desafiolatam;

import java.util.Scanner;

public class sumaprofe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//solicitar numero de termino
		System.out.println("Ingrese numero");
		//guardar numero termino
		int numeroFin= sc.nextInt();
		
		//almacenar la suma
		int sumaPar = 0;
		int sumaImpar = 0;

		for (int i = 1; i <= numeroFin ; i++) {			
			//modulo o resto de dividir un numero por 2
			if(i%2 == 0 ) {//par, // si se pone if(i%2!=0){ ES IMPAR
				sumaPar =  sumaPar +i;
				System.out.println(" suma parcial par"+ sumaPar);
			} else {//impar
				sumaImpar = sumaImpar +i;
				System.out.println(" suma parcial impar"+ sumaImpar);
			}
		}
		//imprimir
		System.out.println("** Suma final par "+sumaPar);
		System.out.println("** Suma final impar "+sumaImpar);
	}

}
