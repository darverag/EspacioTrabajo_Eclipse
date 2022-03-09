package com.desafiolatam.f20211209;

import java.util.Scanner;

public class EjemploPatronesGerman {


		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("ingrese cantidad de caracteres a imprimir: ");
			int n=sc.nextInt();
			
			
			
			//Esto representa en su conjunto una fila, y cada asteriscos forma parte de una columna.
			/*
			 for (int col = 1; col < n; col++) {
				System.out.print('*');//CON OPCION PRINT IMPRIME SIN SALTO DE PAGINA, SE REPRESENTA UN CHART ( 1 CARACTER)
			}*/
			
			
		 // ESTO REPRESENTA UNA FILA DE COLUMNAS
			/* for (int fila = 0; fila < n; fila++) {
				System.out.printf("*****");// ESTO SE REPRESENTA UN STRING, VA MAS DE 1 CARACTER, POR ESO ES UN PRINTF Y VA ENTRE COMILLAS
				System.out.println();   
			}*/
			
			
			
			/*for (int fila = 1; fila <= n; fila++) { ///REPRESENTA UNA FILA Y COLUMNAS FORMAN UN CUADRADO
				for (int col = 1; col <=n; col++) {
					System.out.print('*');
				}
				System.out.println();
			}*/
			
			
			//dibujo linea transverzal
			// CODIGO REPRESENTA QUE CUANDO FILAS Y COLUMNAS SON IGUAL, EN ESE CASO SE IMPRIME * Y SI NO SE QUIERE QUE SEAN IGUAL SE DEJA EN BLANCO 
			/*for (int fila = 0; fila < n; fila++) {
				for (int col = 0; col < n; col++) {
					if(fila==col) {
						System.out.print('*');
					}else {
						System.out.print(' ');
					}
				}
				System.out.println();
			}
			System.out.println("\n");
			*/
			
			 // EN EL CODIGO SE REPRESENTA 1 * EN LA INTERSECCION FILA-COLUMNA AL INICIO DE LA FILA
			/*for (int fila = 1; fila < n; fila++) {
				for (int col = 1; col < n; col++) {
					if(fila==col && fila==1) {
						System.out.print('*');
					}else {
						System.out.print(' ');
					}
				}
				System.out.println();
			}
			System.out.println("\n");	*/
			
			
			
			/*for (int fila = 1; fila <=n; fila++) {
				for (int col = 1; col <=n; col++) {
					if((fila==col && fila==1) || (fila==col && fila==n)){
						System.out.print('*');
					}else {
						System.out.print(' ');
					}
				}
				System.out.println();*/
			
		
			
			
	}
}

		

