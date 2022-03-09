package com.desafiolatam.f20211209;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//int numero = 0;
		/*}
		while (numero <50) {
			System.out.println("Dentro del while "+numero);
			numero +=1;  //esto se llama incrementar la variable, es lo mismo que
			// numero =numero+1;
			//siempre debo agregar una condicion de termino
		}
		System.out.println("Fuera del While");
	}*/
		/*do {
			System.out.println("Dentro del while "+numero);
			numero +=1; 
		}while (numero <10);
		System.out.println("Fuera del While");
		*/
		
		/*otro
		
			int i2 = 0;
			while (i2<10) {
			i2+=1;
			System.out.printf("Iteración %d\n", i2);
			}
			
			*/
	  //pares
			int n=0;
			int numeros=0;
			System.out.println("Ingrese un numero");//Usuario ingresa valor
			n=sc.nextInt();//se captura el numero
			numeros = n*2;
			for(int i = 0;i <numeros;i++) { //mostrar pares
				if (i % 2 == 0) {
				System.out.print("*");
			}
			
		}
				
		/*
			int n=1;
			int numeros=0;
				System.out.println("Ingrese un numero");//Usuario ingresa valor
				n=sc.nextInt();//se captura el numero
				numeros = n*2;
				for(int i = 1;i <=numeros;i++) { //mostrar pares
					if (i % 2 == 0) {
					System.out.println(i);
		}
	}*/
			
			// Solicitar a usuario ingreso de numero, para sumar impares desde n hasta numero ingresado.
			// sumar solo números impares
			// mostrar la suma

				/*int n = 0;
				int sumaImpar = 0;
				
				System.out.println("Ingrese numero para suma de impares: ");
				n = sc.nextInt(); 
				
				for (int i = 0; i <=n ; i++) {			
					if(i % 2 != 0 ) {
						sumaImpar = sumaImpar +i;
				      }
			    	
				}
					System.out.println(sumaImpar);
	      }*/
	}
}
		   	
	        
	
	