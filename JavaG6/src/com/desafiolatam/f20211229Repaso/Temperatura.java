package com.desafiolatam.f20211229Repaso;

import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		Scanner escaner = new Scanner (System.in);
		System.out.println("Ingrese la temperatura en grados centígrados:");
		int temp = escaner.nextInt();
		if(temp<=10) {
			System.out.println("Frío");
		}else if(temp>10 && temp<=20) {
			System.out.println("Nublado");
		}else if(temp>20 && temp<=30) {
			System.out.println("Caluroso");
		}else {
			System.out.println("Tropical");
		}
		

	}

}
