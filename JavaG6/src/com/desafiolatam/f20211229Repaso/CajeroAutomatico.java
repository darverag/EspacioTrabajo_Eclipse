package com.desafiolatam.f20211229Repaso;

import java.util.Scanner;

public class CajeroAutomatico {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenido ingrese su clave");
		String password = sc.next();
		String clave ="hola";
		
		System.out.println(clave.compareTo(password));
		if(clave.compareTo(password)== 0){
			System.out.println("Digite la operación que desea realizar");
		}else{
			System.out.println("Clave invalida");
		}
		System.out.println("1 Girar");
		System.out.println("2 Depositar");
		System.out.println("3 Consultar Saldo");
		
		int numero = sc.nextInt();
		int saldoInicial= 1000000;
		
			if (numero==1){
				System.out.println("Ingrese el monto a girar");
				int giro = sc.nextInt();
				if(giro>1000000) {
					System.out.println("Saldo Insuficiente");
				}else{
					int nuevoSaldo= 1000000 - giro;
					System.out.println("Su nuevo saldo es "+ nuevoSaldo);
				}
			}else if(numero ==2) {
				System.out.println("Ingrese el monto a depositar");
				int deposito = sc.nextInt();
				int nuevoSaldo=1000000+deposito;
				System.out.println("Su nuevo saldo es "+nuevoSaldo);
				
			}else if(numero==3);{
				System.out.println("Su saldo actual es "+saldoInicial);

		}

	}
}
