package com.desafiolatam;

import java.util.ArrayList;

public class Visitas {
	
		//OBJETIVOS
		/*1.-Calcular el promedio de las visitas diarias. 
		 *2.-Crear metodo promedio() que reciba como parametros un arreglo y retorne el promedio visitas.
		 *3.-Los datos entregados como parametros se ejecutaran mediante comando ,javaVisitas.java 3001 1402 1304 1505
		 *4.-El resultado deberá ser mostrado en pantalla.
		 *5.-Para la entrada anterior, "El resultado es 1803 
		 */
	

	public static void main (String [] args) { // Se pasan parametros por metodo main en arreglo "args"
		//Se define arreglo para almacenar los valores
		ArrayList<Integer> arreglo = new ArrayList<Integer>();
		for(int i=0; i < args.length; i++) { 
			int StrToInt=Integer.parseInt(args[i]); //Convertir "args" del MAIN a int.
			arreglo.add(StrToInt);
		}
		//Se muestra resultado
			int resultado=promedio(arreglo);
			System.out.println("Para la entrada anterior el resultado es  "+ resultado);
			
			promedio(arreglo);
		}
	
	
	
//Se crea metodo promedio
		private static int promedio(ArrayList<Integer> arreglo) {
			//variables
			int suma=0;
			int promedio=0;
			for(int i=0; i < arreglo.size(); i++) { //Se recorre el arreglo
				suma+=arreglo.get(i);
			}
			//Calculo de promedio
			promedio=suma/arreglo.size();
			
			return promedio; // Retorna promedio
		}	
	
}
	



		
		
		
		
		
	
		
		

	

