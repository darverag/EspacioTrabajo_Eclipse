package com.desafioMirandoElPasado;

import java.util.LinkedList;
import java.util.Queue;

public class Ejercicio4_JuegosDeInfancia {

	public static void main(String[] args) {

		//1.- INSTANCIAR UN QUEUE<>() LLAMADO "juegos" CON LINKDLIST() PARA ENCOLAR
		
		Queue<String> juegos = new LinkedList<String>();
		
		//2.-AGREGAR LOS SGTES JUEGOS ; Tombo, Congelado, Quemaditas, Cachipún, Pillarse

		juegos.offer("Tombo");
		juegos.offer("Congelado");
		juegos.offer("Quemaditas");
		juegos.offer("Cachipún");
		juegos.offer("Pillarse");
	
		//3.- CONTAR LA CANTIDAD DE JUEGOS E IMPRIMIRLOS EN PANTALLA
		
		System.out.println("\nLa cantidad de juegos ingresados en lista son: "+juegos.size());
		System.out.println("-----------------------------------------------------");
		System.out.println("|           Los juegos en lista son:                | \n|"+juegos+" |");
		System.out.println("-----------------------------------------------------");
		
		
	}

}
