package com.desafiolatam.f20211210;

import java.util.ArrayList;
import java.util.Collections;

public class NotaMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       obtener();
	}
	
	public static void obtener () {
		ArrayList<Float> notas = new ArrayList<Float>();
		notas.add(4.7f);
		notas.add(2.2f);
		notas.add(5.4f);
		notas.add(6.9f);
		notas.add(4.4f);
		notas.add(2.6f);
		System.out.println("Nota maxima: "+Collections.max((notas)));
		System.out.println("Nota minima: "+Collections.max((notas)));
		
		
		
	}

}
