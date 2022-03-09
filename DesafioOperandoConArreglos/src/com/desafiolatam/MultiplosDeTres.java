package com.desafiolatam;

import java.util.ArrayList;

public class MultiplosDeTres {

			/*1.-Crear programa MultiplosDetres, que permita sumar todos los números que sean 
		 * multiplos de tres.
		 *2.-Se debe crear un metodo suma() que reciba el arreglo con los valores como parámetro.
		 *3.- Ingresar datos de entrada como parámetros usand java MultiplosDeTres.java 10 20 30 33 21 8 2 61
		 *4.- Para la entrada anterior deberá mostrar en pantalla: 84.
		 */
	public static void main(String[] args) {// Se pasan parametros por metodo main en arreglo "args"
		//Se define arreglo para almacenar los valores
				ArrayList<Integer> arreglo = new ArrayList<Integer>();
				
				for(int i= 0; i < args.length; i++) { 
					int StrToInt= Integer.parseInt(args[i]);////Convertir "args" del MAIN a int.
					arreglo.add(StrToInt);
					}
				//Se muestra resultado
				int resultado=suma(arreglo);
				int resultadoPromedio=promedio(arreglo);
				System.out.println(resultado);
				System.out.println(resultadoPromedio);
				//System.out.println("Para la entrada anterior deberá mostrar en pantalla "+resultado);
				//System.out.println("El promedio de los multiplos de tres es "+resultadoPromedio);
				
				suma(arreglo);
				promedio(arreglo);
					
			}
	//Ejercicio 3 "Multiples de Tres"
			private static int suma(ArrayList<Integer> arreglo){
				// Variables
				int suma=0;
				for(int i=0; i < arreglo.size(); i++) { //Se recorre el arreglo para obtener tamaño
					if(arreglo.get(i) % 3 == 0)
					suma+=arreglo.get(i);
				}
				return suma;
			}
	//Ejercicio 4 "Promedios"		

			private static int promedio(ArrayList<Integer> arreglo) {
		// Variables
				int suma=0;
				int promedio=0;
				int contador=0;
				for(int i=0; i < arreglo.size(); i++) { //Se recorre el arreglo para obtener tamaño
					if(arreglo.get(i) % 3 == 0) {
						suma+=arreglo.get(i);
						contador+=1;}
				}
				//Se calcula promedio
				promedio=suma/contador;
				
		return promedio; //retorna promedio
	}
			
}
