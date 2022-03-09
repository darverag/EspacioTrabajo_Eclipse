package com.desafiolatam.f20220104Repaso;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EjercicioCasa2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese un elemento de una casa");
		String nuevoElementoCasa = sc.nextLine();

		agregarElemento(nuevoElementoCasa);
	}

	private static void agregarElemento(String nuevoElementoCasa) {

		ArrayList<String> elementos = new ArrayList<String>();
		elementos.add("mesa");
		elementos.add("Refrigerador");
		elementos.add("Cocina");
		elementos.add("lavadora");

		for (Iterator iterator = elementos.iterator(); iterator.hasNext();) {
			String elemento = (String) iterator.next();
			if (elemento.contains(nuevoElementoCasa)) {
				System.out.println("Elemento ya existe");
			} else {
				elementos.add(nuevoElementoCasa);
			}

		}

	}

}
