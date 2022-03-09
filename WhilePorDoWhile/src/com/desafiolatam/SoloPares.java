package com.desafiolatam;

import java.util.Scanner;

public class SoloPares {

	public static void main(String[] args) {
		// Pares
		Scanner sc= new Scanner(System.in);
        
		int n=0;
		int numeros=0;
		System.out.println("Ingrese un numero");//Usuario ingresa valor
		n=sc.nextInt();//Se captura dato
		numeros = n*2;
		for(int i = 0;i <numeros;i++) { //Mostrar pares
			if (i % 2 == 0) {
			System.out.println(i);
		}
			
	  }
	 sc.close();
   }
}
				

