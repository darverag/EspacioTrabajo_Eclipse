package com.desafiolatam;

import java.util.Scanner;

public class Contraseña {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.printf("Ingrese la contraseña: ");
		String password = sc.nextLine();
		while (password.compareTo("password") != 0) {
			System.out.printf("La contraseña es incorrecta\n", password);
			System.out.printf("Ingrese la contraseña: ");
			password = sc.nextLine();
		}
		System.out.printf("La contraseña ingresada es correcta\n");
	}
}
