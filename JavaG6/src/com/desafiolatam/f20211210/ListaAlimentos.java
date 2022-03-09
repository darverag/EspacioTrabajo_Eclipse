package com.desafiolatam.f20211210;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ListaAlimentos {

	public static void main(String[] args) {
		ordenar();
	}

	public static void ordenar() {
		ArrayList<String> comidas = new ArrayList<String>(); //Asignar un espacio dinamico de memoria, porque podria crecer. (Se inicializa)
		comidas.add("Cazuela");
		comidas.add("Porotos");
		comidas.add("Pastel de Choclo");
		comidas.add("Ají de gallina");
		comidas.add("Ceviche");
		comidas.add("Arepas");
		//orden de arreglo
		Collections.sort(comidas);//metodo para ordenar
	
		System.out.println(comidas);
		System.out.println("\n ** Menu del dia**");
		
		for (int i = 0; i < comidas.size(); i ++) {
			//acceder ppor indice a cada elemento
			System.out.println("* "+comidas.get(i));
			
		}
			
		}
	}

