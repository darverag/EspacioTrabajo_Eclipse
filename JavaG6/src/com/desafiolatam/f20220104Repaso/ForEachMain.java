package com.desafiolatam.f20220104Repaso;

import java.util.ArrayList;
import java.util.Iterator;

public class ForEachMain {

	public static void main(String[] args) {
		ArrayList<String> listaPersonas = new ArrayList<String>();

		listaPersonas.add("Nelson");
		listaPersonas.add("Monica");
		listaPersonas.add("Isabel");
		
		for (String persona : listaPersonas) {
			System.out.println(persona);
		}
		
		System.out.println();
		
		for (Iterator iterator = listaPersonas.iterator(); iterator.hasNext();) {
			String persona = (String) iterator.next();
			System.out.println(persona);
			
		}
		System.out.println();
		for (int i = 0; i < listaPersonas.size(); i++) {
			System.out.println(listaPersonas.get(i));
		}
	}

}
