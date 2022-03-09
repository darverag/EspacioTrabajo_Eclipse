package com.desafiolatam.f20211220;

import java.util.Scanner;

public class Patrones {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.println("Ingrese numero");
		num = sc.nextInt();

		for(int fila=0 ; fila<num; fila++) {
			for(int col=1; col<num; col++) {
				if (fila==0 && col==num-1) {
					System.out.print('*');
				}else if (fila<num || fila>=num){
					System.out.print(' ');
				}else
					System.out.print('*');
				}
			System.out.print("\n");
		}
		System.out.println();
		}
		
}
