package com.desafiolatam.f20211210;

public class SumaDentroArreglo {

	public static void main(String[] args) {
		
		//EJERCICIO GUIADO; SUMA DENTRO DE UN ARREGLO
		
		// Sumar dentro de un arreglo valores que esten entre 1 y 10
		//Paso 1 crear metodo llamado suma que retorne un numero entero de a suma
		//Paso 2 dentro del metodo suma, declarar una variable local llamada suma que parta en cero.
		//Paso 3 se inicializa el arreglo con valores aleatorios
		//Paso 4 recorrer el arreglo con un ciclo for.
		
		//Paso 7, el metodo creado se llama dentro del metodo main
		System.out.println("La suma es: "+suma());
	}

	//Paso 1 crear metodo suma
	public static int suma() {
		//Paso 2 declarar variable suma que parta en cero
		int suma=0;
		//Paso 3 inicializar arreglo con numeros aleatorios
		int [] arreglo= {1,5,11,33,4,6,7,44,6,1,-1};
		//Paso 4 recorrer el arreglo con un ciclo for.
		for (int x = 0; x < arreglo.length; x++) {
			//Paso 5 dentro del ciclo, se realiza condicion if don se pregunta por los valores que estan en el intervalo solicitado
			if (arreglo[x] >=1 && arreglo [x] <=10) {
				//Paso 6, si la condición se cumple, sumará todos los valores
				suma = suma + arreglo[x];
			
			}
		}
		return suma; //suma de valores entre 1 y 10 (1+5+4+6+7+6+1)
	} 
}
	
	
