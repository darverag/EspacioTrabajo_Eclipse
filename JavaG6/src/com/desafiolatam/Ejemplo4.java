package com.desafiolatam;

import java.util.Scanner;

public class Ejemplo4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int contador= 0;
		Float rt=0f; //definiedo variable, si se ingresa valor sin letra se asume numero
		Float r1=1f;  
		Double r2 = 1d;// aqui asume que es un doble
		int num = 123456 * 4664344;
		do {
		    System.out.println("Ingrese la resistencia 1");
		    r1 = sc.nextFloat();
		    contador = contador + 1; //variable de control
		    if(contador == 4) { //solo 4 veces
		    	r1=1f;//A esto se le llama limpiar la variable valor original
		    	break;
		    }
	    }while(r1 <=0);
		
		System.out.println("Fuera del While");

	}

}
