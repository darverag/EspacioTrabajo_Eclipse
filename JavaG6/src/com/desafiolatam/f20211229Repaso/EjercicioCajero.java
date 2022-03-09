package com.desafiolatam.f20211229Repaso;

import java.util.Scanner;

public class EjercicioCajero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int saldoInicial = 1000000;

		System.out.println("*-*-*-*Bienvenido a Banco Latam-*-*-*-*");
		System.out.println("Por favor ingrese su clave de 4 digitos");
		String clave = sc.nextLine();
		String password = "4321";

		System.out.println(password.compareTo(clave));
		if (password.compareToIgnoreCase(clave) == 0) {
			System.out.println("Digite la operación que desea realizar");
		} else {
			System.out.println("Clave invalida");
			System.out.println("Tiene 2 intentos antes de bloquearse");
			System.out.println();
		}
		System.out.println("1. Girar");
		System.out.println("2. Depositar");
		System.out.println("3. Consulta de Saldo");

		int digito = sc.nextInt();

		if (digito == 1) {
			System.out.println("Indique el monto que de desea girar");
			int montoGiro = sc.nextInt();
			if (montoGiro > saldoInicial) {
				System.out.println("Su saldo es insuficiente");
			} else {
				int nuevoSaldo = saldoInicial - montoGiro;
				System.out.println("Su nuevo saldo después de la transacción es " + nuevoSaldo);
			}
		} else if (digito == 2) {
			System.out.println("Indique el monto que desea depositar");
			int deposito = sc.nextInt();
			int nuevoSaldo = saldoInicial + deposito;
			System.out.println("Su nuevo saldo después de la trasacción es " + nuevoSaldo);

		} else if (digito == 3) {
			System.out.println("Consulta de Saldo (1) - Salir (2)");
			int num = sc.nextInt();
			if (num >= 2) {
				System.out.println("Saliendo del sistema.......");
			} else {
				System.out.println("Su saldo actual es " + saldoInicial);
			}
		}
	}
}
