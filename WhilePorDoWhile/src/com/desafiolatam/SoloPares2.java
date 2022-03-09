package com.desafiolatam;

import java.util.Scanner;

public class SoloPares2 {

	public static void main(String[] args) {
		// Solo Pares2
		Scanner sc= new Scanner(System.in);
        
		int n=1;
		int num=0;
		System.out.printf("Ingrese un numero: ");//Usuario ingresa valor
		n = sc.nextInt(); //Se captura el dato
		num = n*2;
		for(int i = 1; i <=num;i++) {//Mostrar pares, sin mostrar el cero
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		sc.close();
	}

}
