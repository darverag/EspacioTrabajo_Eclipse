package com.desafiolatam.f20220108Repaso;

import java.util.Scanner;

public class TieneEntrada {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		boolean tieneEntrada = false;
		int num=0;
		
		System.out.println("¿Tienes entrada? (true/false");
		tieneEntrada = sc.nextBoolean();
		System.out.println("Ingrese Edad");
		int edad =sc.nextInt();
				
		
		if(tieneEntrada && edad>=18) {//Al no ser igual a la sentencia de inicial boolean tiene Entrada =false, no se ejecuta programa.
			System.out.println("Hola Bienvenido a la fiesta");
			System.out.println("Entro a la fiesta");
			num=1;
		}else {
			num=2;
			System.out.println("no puede entrar a la fiesta");
		
		}
		System.out.println(num);
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Esta es la "+(i+1)+"era iteracion");
		}
	}

}
