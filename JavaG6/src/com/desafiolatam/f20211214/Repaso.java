package com.desafiolatam.f20211214;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Repaso {//MAIN

	//Metodo: Es una función que nos permite 
	public static void main(String[] args) {
		
		misNumeros();
		
		ejecutar();//llamado al metodo
		ejecutarConParametros("Hola clase 2", 3);
		Float valorPromedio = calcularPromedio(); // En este codigo se esta capturando el valor de retorno (Float valor = 3.0)
        System.out.println("El promedio es: "+ valorPromedio);//Se muestra por pantalla el resultado.
		String texto = obtnerNombre (15);//String texto "Menor de edad";
		System.out.println(texto);
		
		ArrayList<String>alumnosPresentes = obtnerAlumnos();
		System.out.println("Alumnos presentes hoy:  "+ alumnosPresentes);
		
	}
	//Metodo void solo ejecuta acciones, lo que se haga en el metodo termina allí.
	public static void ejecutar () {
		//Para que el metodo funcioné debe ser llamado desde el void main (Primer metodo que se ejecuta)
		System.out.println("Hola Clase");
	}
	
	public static void ejecutarConParametros(String texto, Integer numero){ 
		//String texto= "Hola clase";
		System.out.println("tamaño del texto: "+ texto.length());
		System.out.println("numero: "+numero.toString());// Se convirtio "3"
	}
	
	//Crear metodo para calcular promedio que pudiese no recibir nada
	 public static Float calcularPromedio() {
		 
		Float promedio = (float) ((2+6+4+3+1+7)/6);   ///Como son numero enteros se debe cambiar a Float
		return promedio; //Este promedio retorna un dato float, por lo que se debe crear una variable float en el void main para realizar llamado.
    }
	 
	 public static String obtnerNombre (Integer edad) {
		 String nombre = "Desafio";
		 if (edad >=18) {
			 return nombre; //return "Desafio";
		 }
		 
		return "Menor de edad";
	 }
	 
	 
	 
	 public static ArrayList<String> obtnerAlumnos (){
	 ArrayList<String> alumnos = new ArrayList<String>();
	 alumnos.add("Edinson");
	 alumnos.add("Dario");
	 alumnos.add("Felipe");
	 alumnos.add("Isabel");
	 alumnos.add("Joaquin");
	 alumnos.add("Jose");
	 alumnos.add("Nelson");
	 alumnos.add("Osvaldo");
	 alumnos.add("Rodrigo");
	 alumnos.add("Yerkarin");
	 alumnos.add("Hector");
	 Collections.sort(alumnos); // aquí se ordena de forma ascendente
	 Collections.reverse(alumnos);//Muestra el resultado al reves (El ultimoqueda al comiezo)
	 
	 return alumnos;//return ["Edinson", ....,"Hector]
   }
	 
	 public static void misNumeros () {
		 ArrayList<Integer> numeros = new ArrayList<Integer>();
		 numeros.add(123);
		 numeros.add(4541);
		 numeros.add(-25485);
		 numeros.add(0);
		 numeros.add(3);
		 System.out.println("Creados : " + numeros);
		 Collections.sort(numeros);
		 System.out.println("Ordenados:  "+numeros);
		 Collections.reverse(numeros);;
		 System.out.println("Orden invertido: "+numeros);
		 Scanner sc= new Scanner (System.in);
		 Integer numero = sc.nextInt();
		 numeros.add(numero);
		 System.out.println("nuevo arreglo: "+numeros);
		 
	 }
	 
	 public static void ingresarNumero() {
		 Scanner sc= new Scanner (System.in);
		 ArrayList<Integer> numeros = new ArrayList<Integer>();
		 numeros.add(123);
		 numeros.add(4541);
		 numeros.add(-25485);
		 numeros.add(0);
		 numeros.add(3);
		 
		 System.out.println("Ingrese un numero");
		 Integer numero = sc.nextInt();
		 numeros.add(numero);
		 
		 System.out.println(numeros);
	 }
	 
	 
	 
	 
	 
	 
	 
	 
}

