package com.desafiolatam.f20211211;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Loteria {

	public static void main(String[] args) {
		//generar dinamicamente (for)arreglo con numero del 1 al 100
		//crear arreglo vacio, para almacenar los encontrados
		//generar numero aleatorio entre 1 y 99
		//buscar numero en arreglo (iterador)
		//lenar arreglo de encontrados
		//eliminar de arreglo original (o copia)
		//preguntar si alguien ganó la loteria (do-while)
		// si alguien gano, se termina el juego
		//se muestran los numeros
			loteria();
		
}
		
	public static void loteria() {//metodo
		Scanner sc= new Scanner(System.in);
		int opcion = 0;
		//generar dinamica (for) arreglo con numero del 1 al 99	, arreglo original
		ArrayList<Integer> arregloNumeros = new ArrayList<Integer>();//arreglo
		for (int i = 1; i < 100; i++) {// para llenar arreglo de nuemros
			arregloNumeros.add(i); //agregar numero al arreglo
		}
		//crear arreglo vacio, para almacenar los encontrados
		ArrayList<Integer> numerosEncontrados = new ArrayList<Integer>();
	do{	
		//generar numero aleatorio en 1 y 99
		int numeroAleatorio = (int) Math.floor(Math.random()*100);
		System.out.println("NUMERO CANTADO: "+numeroAleatorio);
		//buscar numero en el arreglo (iterador)
		for (Iterator iterator = arregloNumeros.iterator(); iterator.hasNext();) {//para buscar un numero en el arreglo
			Integer numero = (Integer) iterator.next();
			if(numero == numeroAleatorio) {//validamos
				//llenar arreglo de encontrados
				numerosEncontrados.add(numeroAleatorio);
				//eliminar de arreglo original o copia (arregloNumeros)
				iterator.remove();
		}
	  }
		//preguntar si alguien gano la loteria (do-while)
		System.out.println("Existe algun ganador de la loteria");
		System.out.println("0.-NO \n 1.- SI");
		opcion = sc.nextInt();
	}while(opcion==0);
		//preguntar si alguien gano , se termina el juego
		//se muestran los numeros
		//System.out.println(numeroAleatorio);
		System.out.println(arregloNumeros);
		System.out.println(numerosEncontrados);

		
	}
}
	