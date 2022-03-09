package com.desafiolatam.f20220104Repaso;

import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioCasa {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Ingrese un nuevo mueble a su casa");
		String nuevoElementoCasa = sc.nextLine();
		
		agregarElemento(nuevoElementoCasa);
	}
	
	public static void agregarElemento (String nuevoElementoCasa) {
		
		ArrayList<String> elementos = new ArrayList<String>();
		elementos.add("mesa");
		elementos.add("Refrigerador");
		elementos.add("Cocina");
		elementos.add("lavadora");
		
		int contador=0;
		
		for (int i = 0; i < elementos.size(); i++) {
			if(elementos.get(i).equalsIgnoreCase(nuevoElementoCasa)) {
				System.out.println("Elemento ya existe");
				contador++;
				
				}
			}
		if(contador==0) { 
			elementos.add(nuevoElementoCasa);
		}
		System.out.println(elementos);

	}
}
