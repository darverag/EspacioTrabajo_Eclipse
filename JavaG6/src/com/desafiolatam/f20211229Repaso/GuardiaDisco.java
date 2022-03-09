package com.desafiolatam.f20211229Repaso;

import java.util.Scanner;

public class GuardiaDisco {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingrese su edad:");
		int edad = sc.nextInt();//se captura dato edad
		System.out.println("Confirme si tiene un ticket (true/false");
		boolean tieneTicket = sc.nextBoolean();//se captura si tiene o no ticket
		
		if(edad<18 || tieneTicket==false) {
			System.out.println("No puede entrar");
		}else if (edad>64 && tieneTicket==true) {
			System.out.println("Dirijase a la zona preferencial");
		}else {
			System.out.println("Bienvenido");
		}

	}

}
