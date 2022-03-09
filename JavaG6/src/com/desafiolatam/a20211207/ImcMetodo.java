package com.desafiolatam.a20211207;

import java.util.Scanner;

public class ImcMetodo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		restringeAccesoPorEdad();

		System.out.println("cuál es su estatura en metros?");
		Float estatura = scanner.nextFloat();
		estatura= validaEstatura(estatura); //llamada a método que retorna el valor de la estatura ya validado, pasándole como parámetro la estatura (se sobrescribe la variable)
		System.out.println("Ingrese su peso en kilogramos.");
		Float kilos = scanner.nextFloat();
		kilos= validaPeso(kilos);//llamada a método que retorna el valor del peso ya validado, pasándole como parámetro el peso (se sobrescribe la variable)
		
		Float imc = calculaImc(kilos,estatura);
		
		System.out.println("Su IMC es " + imc);
		
		clasificaImc(imc);

		scanner.close();
	}
	
	private static void restringeAccesoPorEdad() {
		Scanner scanner = new Scanner(System.in);
		boolean esMenor = false;
		do {
			System.out.println("Ingrese su edad");
			int edad = scanner.nextInt();
			if (edad < 18) {
				esMenor = true;
				System.out.println("Usted no puede usar esta sistema");
			} else {
				esMenor = false;
			}

		} while (esMenor);	
	}
	
	//cambié el nombre del método a uno  más descriptivo
	private static void clasificaImc(Float imc) {
		if (imc < 18.5) {
			System.out.println("Bajo peso");
		} else if (imc >= 18.5 && imc < 25) {
			System.out.println("Normal");
		} else if (imc >= 25 && imc < 30) {
			System.out.println("Sobrepeso");
		} else {
			System.out.println("Obeso");
		}
		
	}
	/*método que al pasar como parámetros el peso y la estatura, retorna el IMC calculado*/
	private static Float calculaImc(Float kilos, Float estatura) {
		Float imc = kilos / (estatura * estatura);
		return imc;
	}

	/*el método validaEstutura, se serciora de que ingrese solo un valor positivo
	 de lo contrario vuelve a pedir el valor al usuario */
	public static Float validaEstatura(Float estatura) {	
		
		Float estaturaLocal=estatura;//creé una variable local que vive solo dentro del método y le asigné el valor entrante
		while (estaturaLocal <= 0) {
			System.out.println("Error en el ingreso de la estatura");
			//agregué que volviera a ingresar el valor de estatura, de lo contrario
			//al ingresar mal no sale nunca del ciclo
			Scanner escanEstatura= new Scanner(System.in);
			System.out.println("vuelva a ingresar la estatura, esta vez un valor mayor a 0: ");
			estaturaLocal= escanEstatura.nextFloat();
		}
		return estaturaLocal;
		
	} 
	/*el método validaPeso, se serciora de que ingrese solo un valor positivo
	 de lo contrario vuelve a pedir el valor al usuario */
	public static Float validaPeso(Float kilos) {	
		Float kilosLocal=kilos;//creé una variable local que vive solo dentro del método y le asigné el valor entrante
		while (kilosLocal <= 0) {
			System.out.println("Error en el ingreso del peso");
			//agregué que volviera a ingresar el valor de peso, de lo contrario
			//al ingresar mal no sale nunca del ciclo
			Scanner escanPeso= new Scanner(System.in);
			System.out.println("vuelva a ingresar el peso, esta vez un valor mayor a 0: ");
			kilosLocal= escanPeso.nextFloat();
		}
		return kilosLocal;	
	} 

}