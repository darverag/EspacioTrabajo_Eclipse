package com.desafioMirandoElPasado;

import java.util.ArrayList;

public class Ejercicio1_Marcas {

	public static void main(String[] args) {
				
		//1.- ARRAYLIST <STRING> , NOMBRE "marcas"
		ArrayList<String> marcas = new ArrayList<String>(); 
		
		//2.- AGREGAR 10 MARCAS E IMPRIMIRLAS POR CONSOLA
		marcas.add("Free");
		marcas.add("Viceroy");
		marcas.add("Kodak");
		marcas.add("Napster");
		marcas.add("Mexicana de aviación");
		marcas.add("Sony Ericsson");
		marcas.add("Compaq");
		marcas.add("Pan Am");
		marcas.add("General Motors");
		marcas.add("Remington");
		
		//IMPRESION POR CONSOLA
		System.out.println("Listado Inicial 10 marcas: "+marcas);
		System.out.println();
		
		//3.- AGREGAR AL LISTADO; BLOKBASTER, CARREFOUR Y JETIX. IMPRIMIR A SU VEZ EL NUEVO LISTADO EN CONSOLA
		marcas.add("Blokbaster");
		marcas.add("Carrefour");
		marcas.add("Jetix");
		
		System.out.println("Listado Modificado 13 marcas: "+marcas);
		
		//4.- CORREGIR BLOKBASTER POR BLOCKBUSTER EN EL LISTADO DE MARCAS
		
		marcas.set(10, "Blockbuster");
		System.out.println();
		//System.out.println("Listado Corregido: "+marcas);
		
		//5.- BORRAR CARREFOUR DEL LISTADO E IMPRMIR EL RESULTADO POR CONSOLA
		
		marcas.remove("Carrefour");
		System.out.println("Nuevo Listado sin Carrefour: "+marcas);
		
		//6.- REALIZAR UNA COLECCION CON POSIBLES MARCAS, INCORPORAR EN NUEVO ARRAYLIST LLAMADO "posiblesMarcas" 
		// E INCORPORAR A LISTA DE "marcas"
		
		ArrayList<String> posiblesMarcas = new ArrayList<String>();
		
		posiblesMarcas.add("Concorde");
		posiblesMarcas.add("Lehman Brothers");
		posiblesMarcas.add("Polaroid");
		posiblesMarcas.add("Minolta");
		marcas.addAll(posiblesMarcas);
		
		//7.- REVISAR Y CONTAR EL TOTAL DE ELEMENTOS QUE CONTIENE LA LISTA E IMPRIMIR POR PANTALLA.
		
		
		System.out.println("\n**************************************************************************************************************************************************************************************************");
		System.out.println("Listado Final: "+marcas);
		System.out.println("\nLa lista marca contiene un total de "+marcas.size()+" elementos!!!\n");
		System.out.println("**************************************************************************************************************************************************************************************************");
		
	}

}
