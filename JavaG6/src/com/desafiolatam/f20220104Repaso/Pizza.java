package com.desafiolatam.f20220104Repaso;

import java.util.ArrayList;
import java.util.Scanner;


public class Pizza {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		ArrayList<String> pizza = new ArrayList<String>(); 
		pizza.add("masa");
		pizza.add("queso");
		pizza.add("salsa");
		
		int contador =0;
		boolean existe=false;
		
		System.out.println("Ingrese un ingrediente");
		String ingrediente =sc.nextLine();//queso
		
		//recorrer un arreglo dinamico
		for (int i = 0; i < pizza.size(); i++) {
			if(pizza.get(i).equalsIgnoreCase(ingrediente)) {
				System.out.println("Ingrediente ya existe en la pizza");
				contador++;//incrementando en 1
				existe = true;
			
		}
	}
	if(contador==0) { //if(existe==false){
		pizza.add(ingrediente);
	}
	System.out.println(pizza);

	}
}

