package com.desafiolatam.f20220103Repaso;

import java.util.Iterator;

public class ArraysEstaticos {

	public static void main(String[] args) {
		// Definicion, conjunto de datos, separados por coma, ordenados segun su ingreso
		//Todos los arreglos comienan en la posicion cero
		//TipoDato [] variable = new TipoDato [cantidadElementos]
		//con la variable.length -> se obtendra el tamaño del arreglo.
		//***Por lo general los arreglos tienen como nombre un plural.
		
		//crear el arreglo
		int [] numeros = new int [4];//el 4 indica la cantidad de elementos a contener
		//agregar valores al arreglo
		//variable[posicion]
		numeros [0] = 1;
		System.out.println(numeros [0]);
		numeros [1]=77;
		numeros [2]=42;
		numeros [3]=9;
		
		//numeros [4] =0; //Este queda fuera del indice ya que el arreglo solo contiene 4 elementos.
		
		String [] vocales = {"a","e","i","o","u"};//Es lo mismo que indicar String[]vocales =new String [5]
		vocales [0] = "y";//Si existe sobreescribe el valor en esa posicion
		System.out.println("Valor en la posicion cero "+vocales[0]);
		System.out.println("tamaño: "+vocales.length);
		
		System.out.println("elemento en la última posicion: "+vocales[vocales.length-1]);
		
		//recorrer el arreglo, la I es la posicion. La funcion del for es recorrer el arreglo considerando el indice según su posicion hasta llegar al último elemento del arreglo. 
		//Si la condicion es falsa, termina de recorrer.
		for (int i = 0; i < vocales.length; i++) {
			vocales [i] = "s";//Aquí se sobreescribe el arreglo
			System.out.println(vocales[i]);//Aqui se esta imprimiendo
			
			
		}
		}
	
	
	}


