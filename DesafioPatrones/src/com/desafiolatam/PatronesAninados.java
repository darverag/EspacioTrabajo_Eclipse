package com.desafiolatam;

import java.util.Scanner;

public class PatronesAninados {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		capturaDatos();
		int num = capturaDatos();
		patron1(num);
		patron2(num);
		patron3(num);
		patron4(num);
		
		
	}

	public static int capturaDatos() {
		Scanner sc = new Scanner(System.in);

		int num = 0;
		int iniciar = 1;
		
		while (iniciar==1) {
			
			// PRESENTACION PROGRAMA
			System.out.println("Para proyectar las figuras correctamente ingrese un número mayor a 3 ");
			System.out.println("* * * * * * * * * * * * * ¿Quieres iniciar?* * * * * * * * * * * * * ");

			System.out.println("     Ingrese número deseado de lo contrario digite 0 para salir");//SE SOLICITA INGRESO NUMERO
			num = sc.nextInt(); // SE GUARDAN DATOS

			//CONTROL DE PRESENTACION
			if (num>= 1) {

				patron1(num);
				patron2(num);
				patron3(num);
				patron4(num);

			} else {
				System.out.println(".....Saliendo\n\n");
				break;
				}
			}
		return num;
		}

	//DESARROLLO
	
	private static void patron1(int num) {
		//Patron1 LISTO!!
		System.out.println();
		System.out.println("Patrón 1:");
		System.out.println();
		
		for (int fila = 0; fila <num; fila++){ 
			for (int col = 0; col <num; col++) { 
				if (fila== 0 || fila == (num - 1)) {//(n - 1)
					System.out.print('*'); 
					} else {
						if (col == 0 || col == ( num -1)) {//(n - 1)
							System.out.print('*');
							}else { 
								System.out.print(' '); 
								}
						}
				}
				System.out.print("\n");
				}
		System.out.println();
		}	
		 


	 private static void patron2(int num) {
		//Patron2 LISTO!!
		System.out.println();
		System.out.println("Patrón 2:");
		System.out.println();
		
		for(int fila=0 ; fila< num; fila++) {
			for(int col=0; col< num; col++) {
				if (fila==0 || fila==num-1) {
					System.out.print('*');
				}else if (fila<num-1 -col || fila>=(num)-col){
					System.out.print(' ');
				}else
					System.out.print('*');
				}
			System.out.print("\n");
		}
		System.out.println();
		}
		

	private static void patron3(int num) { 
		//Patron3 LISTO!!
		System.out.println();
		System.out.println("Patrón 3:");
		System.out.println();
		
		for(int fila=1 ; fila<=num; fila++) {
			for(int col=1; col<=num; col++) {
				if ((fila==1 || fila==num) && (col==1||col==num)){
					System.out.print('x');
				}else if ((fila>1 && fila<num) && (col==fila||col==num-(fila-1))) {
					System.out.print('x');
				}else
					System.out.print(' ');
				}
			System.out.print("\n");
			}
		System.out.println();
		}
		
	private static void patron4(int num) {
		System.out.println();
		System.out.println("Patrón 4:");
		System.out.println();
		
		for(int fila=0 ; fila<num; fila++) {
			for(int col=0; col<num; col++) {
				if((fila==col && fila==0)||(fila==col && fila==(num-1))) {
					System.out.print('*');
				}else if(col!=0 && col!=(num-1)) {
					System.out.print('*');
				}else {
					System.out.print(' ');
				}
			}
			System.out.print("\n");
		}
		System.out.println();
		}
	}




