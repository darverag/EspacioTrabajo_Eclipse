package com.desafiolatam.f20211230Repaso;

import java.util.Scanner;

public class DesafiocajeroProfe {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		int saldoInicial= 1000000;
		
		System.out.println("****Cajero Automatico****");
		System.out.println("*Seleccione una opción: *");
		System.out.println("*1.- Girar");
		System.out.println("*2.-Consultar");		
		System.out.println("*3.-Depositar");
		System.out.println("*************************");
		int opcion = sc.nextInt();
		
		if(opcion ==1) {
			System.out.println("Ingrese monto a girar");
			int monto= sc.nextInt();
			
		     saldoInicial = saldoInicial-monto;
			
			
		}
	}

}
