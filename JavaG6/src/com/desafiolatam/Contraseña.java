package com.desafiolatam;

import java.util.Scanner;

public class Contrase�a {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.printf("Ingrese la contrase�a: ");
		String password = sc.nextLine();
		while (password.compareTo("password") != 0) {
			System.out.printf("La contrase�a es incorrecta\n", password);
			System.out.printf("Ingrese la contrase�a: ");
			password = sc.nextLine();
		}
		System.out.printf("La contrase�a ingresada es correcta\n");
	}
}
