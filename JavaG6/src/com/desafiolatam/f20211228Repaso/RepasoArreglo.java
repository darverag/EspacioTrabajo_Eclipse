package com.desafiolatam.f20211228Repaso;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class RepasoArreglo {

	public static void main(String[] args) {
		/*ArrayList<String> canciones = new ArrayList<>();
		// Le agregamos datos
		canciones.add("Ashes to ashes");
		canciones.add("Beds are burning");
		canciones.add("It's only rock 'n' Roll (But I like it)");
		
		System.out.println("Recorriendo con método 1");
		// Método 1
		for (String cancion : canciones) {
		  System.out.println(cancion);
		}
		
		System.out.println("recorriendo metodo 2");
		// Método 2
		for (int x = 0; x < canciones.size(); x++) {
		  String cancion = canciones.get(x);
		  System.out.println(cancion);
		  System.out.println();
		}*/
		
		
		//ArrayList
		
		Scanner sc= new Scanner(System.in);
		String texto ="";
		int numero = 0;
				ArrayList<String> lista = new ArrayList<String>();
				lista.add("Perro");
				lista.add("Gato");
				lista.add("Juan");
				lista.add("Daniel");
				lista.add("Juan");
				lista.add("Gato");
				lista.add("Perro");
				lista.add("Camila");
				lista.add("Daniel");
				lista.add("Camila");
				
				//ARREGLO VACIO
				ArrayList<String> encontrados = new ArrayList<String>();
				//copiar los elemento a la nueva lista
				ArrayList<String> noEncontrados = new ArrayList<String>(lista);
				//noEncontrados.addAll(lista);
				
				
				do {
				
					System.out.println("***Ingrese texto a buscar***");
					texto = sc.nextLine();

					for(Iterator listIterator = noEncontrados.iterator(); listIterator.hasNext();) {
					
						String palabra = (String) listIterator.next();
						if(palabra.equalsIgnoreCase(texto)) { //Una vez encontrado se agrega en arreglo encontrados.add
							encontrados.add(palabra);
							//Esto eliminara list del original
							//coleccion en este caso un alista
							listIterator.remove();//Se elimina del arreglo "noEncontrados"
							
							}
					}
					System.out.println("Quieres otra busqueda");
					System.out.println(" (0) NO  -  (1) SI  ");
					numero = sc.nextInt();
					
				}while (numero==1);
				
				System.out.println(encontrados);
				
				if(numero==0) {
					System.out.println("Hasta Pronto!!");
				}
			
				
				
				
				
			/*	for(int x=0; x <lista.size(); x++){
					String texto = lista.get(x);
					System.out.println(texto);
				}*/
				
			/*	//primero hacemos un llamado al iterador y al metodo .iterator() en la coleccion
				Iterator<String> listaIterator = lista.iterator();
				//y ahora usamos .hasNext() y .next() para revisarlo
				while (listaIterator.hasNext()) {
				    System.out.println(listaIterator.next());
				}*/
				
					
					
					}
				
		}

