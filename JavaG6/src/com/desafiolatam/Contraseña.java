package com.desafiolatam;

import java.util.Scanner;

public class Contraseņa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.printf("Ingrese la contraseņa: ");
		String password = sc.nextLine();
		while (password.compareTo("password") != 0) {
			System.out.printf("La contraseņa es incorrecta\n", password);
			System.out.printf("Ingrese la contraseņa: ");
			password = sc.nextLine();
		}
		System.out.printf("La contraseņa ingresada es correcta\n");
	}
}
