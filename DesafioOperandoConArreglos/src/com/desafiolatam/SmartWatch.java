package com.desafiolatam;

import java.util.ArrayList;
import java.util.Collections;

public class SmartWatch {
	
	
	//OBJETIVOS
	/*1.-Crear metodo llamado clearSteps que reciba como parametros un arreglo 
	 y descartar en metodo los valores menores a 200 o mayor a 100.000..Debe retornar el arreglo filtrado.
	 *2.-una vez filtrados los datos del metodo, calcular promedio de pasos de una persona"
	 *3.-Los valores deben quedar como enteros Integers.
	 *4.-Para ejecutar el programa se realizará mediante terminal usando comando, java SmartWatch.java 300 405 403 506 100020040 45006 -1044
	 *5.-Programa debe llamarse SmartWatch.java
	 *6.-Salida del programa debe ser el promedio de los pasos.	 *
	 */ 
		
	public static void main (String[] args) {//Se pasan parametros por metodo main en arreglo "args".
		//Se define arreglo para guardar valores
		ArrayList<Integer> pasos = new ArrayList<Integer>(); 
		for(int i=0; i < args.length; i++) { 
			int StrToInt=Integer.parseInt(args[i]);//Se convierte "args" del MAIN a int.
			pasos.add(StrToInt);
			Collections.sort(pasos);
			//System.out.println("Total pasos "+pasos);
		}
			
			//Se filtran valores
			ArrayList<Integer> pasosReturn =clearSteps(pasos);
			int promedioReturn=promedio(pasosReturn);
			
			//Mostrar Resultados
			System.out.println("El promedio de los pasos es: "+promedioReturn);
			}
		
//Metodo que filtra valor erroneo
	private static ArrayList<Integer> clearSteps(ArrayList<Integer> pasos) {
		// Se crea nuevo arreglo que contendrá valor filtrado
		ArrayList<Integer> arregloFiltrado = new ArrayList<Integer>();
		arregloFiltrado.clear();
				
		//Se recorre el arreglo desde 0 hasta su tamaño , se utiliza Size para recorrer ya que es dato Integer
		for(int i=0 ; i < pasos.size() ; i++) {
			if(pasos.get(i) > 200 && pasos.get(i)<100000) //Condicion descarte valores menor a 200 y mayor a 100000
				arregloFiltrado.add(pasos.get(i));		
			//System.out.println("Datos filtrados "+arregloFiltrado);
			}
		//retorna un arreglo filtrando valores
		return arregloFiltrado;
	}
	
	private static int promedio(ArrayList<Integer> pasosReturn) {
		// variables
		int sum=0;
		int prom=0;
		//Se recorre arreglo
		for(int i=0; i < pasosReturn.size(); i++) { 
			sum+=pasosReturn.get(i);
		}
		//Calculo promedio
		prom=sum/pasosReturn.size();
		
		return prom;
	}
	
}
		
	