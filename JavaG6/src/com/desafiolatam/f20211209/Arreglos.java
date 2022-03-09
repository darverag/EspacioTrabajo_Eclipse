package com.desafiolatam.f20211209;

public class Arreglos {

	public static void main(String[] args) {
		
		// CARACTERISTICAS; CONJUNTO DE DATOS ORDENADO SEGÚN SU INGRESO, SEPARADOS POR COMA (,)
		// ARRAY ESTATICOS
	    //TAMAÑO FIJO DEL ARREGLO (O CANTIDAD DE ELEMENTOS)
	
	
			int[] numerosPares = {2,4,6,8,10};//length o tamaño = 5
			String[] alumnos = {"Isabel","Dario","Edinson","Hector"};//length o tamaño = 4-1
			
			int[] numerosImpares = {};//length o tamaño cero
			
			System.out.println(numerosPares.length);
			System.out.println(alumnos.length);
			System.out.println(numerosImpares.length);
			
			//estableciendo tamaño fijo al arreglo de tipo int
			int[] numeroPrimos = new int[4];
			System.out.println(numeroPrimos.length);
			System.out.println();
			//Recorrer arreglo segun posicion o indice
			System.out.println(numerosPares[0]);
			System.out.println(numerosPares[1]);
			System.out.println(numerosPares[2]);
			System.out.println(numerosPares[3]);
			System.out.println(numerosPares[4]);
			System.out.println();
			
			//Recorrer arreglo por posicion (i). Esta forma de presentarlo es lo mismo
			//Que la anterior pero simplificado, sin indicarlo uno a la vez.
			for (int i = 0; i < numerosPares.length; i++) {
				System.out.println("for "+ numerosPares[i]);
			}

			//numerosPares.length - 1 
		}

}
