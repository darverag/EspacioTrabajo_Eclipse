package com.desafiolatam;

import java.util.Scanner;

public class Suma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//solictar numero de termino
		System.out.println("Ingrese numero");
		//guardar numero termino
		int numeroFin= sc.nextInt();
		
		//almacenar la suma
		int suma = 0;
		
		for (int i = 1; i <= numeroFin ; i++) {
			//suma parcial
			if(i%2==0) {//par
				System.out.println("suma parcial par"+ suma);
				suma =suma +i;
			}
		}
			//imprimir
		System.out.println("suma final "+suma);
	}

}
