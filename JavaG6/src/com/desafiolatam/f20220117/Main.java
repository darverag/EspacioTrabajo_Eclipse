package com.desafiolatam.f20220117;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> listaClientes = new ArrayList<String>();
		listaClientes.add("Juan");
		listaClientes.add("Susana");
		listaClientes.add("Ramiro");
		listaClientes.add("Cristina");
		listaClientes.add("Susana");

		//En primer lugar se muestra lista completa
		//Despues se pide elemento en posicion 3
		System.out.println(listaClientes);
		System.out.println();
		System.out.println(listaClientes.get(3));//aqui se esta llamando un String
		
		// formas de recorrer una lista o ArrayList
		
		System.out.println("*** for ***");
		for (int i = 0; i < listaClientes.size(); i++) {
			System.out.println(listaClientes.get(i));
		}

		System.out.println("*** for each ***");
		for (String data : listaClientes) {
			System.out.println(data);// (data= clientes)
		}

		System.out.println("*** for Iterator ***");
		for (Iterator iterator = listaClientes.iterator(); iterator.hasNext();) {
			String data = (String) iterator.next(); // data = clientes
			System.out.println(data);// (data clientes)
		}

		//metodos de busqueda
		System.out.println(listaClientes.indexOf("Isra"));// -1 no esta en l lista
		System.out.println(listaClientes.indexOf("Susana")); //Esta en posicion1, muestra la primera coincidencia que encuentra
	
		System.out.println(listaClientes.lastIndexOf("Susana")); //muestra la ultima coincidencia, posicion 4
	
	
	
	
	}
}
