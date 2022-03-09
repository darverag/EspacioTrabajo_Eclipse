package com.desafiolatam.f20211222;

import com.desafiolatam.f20211222.models.Juguete;

public class Mainjuguete {

	public static void main(String[] args) {
		//instancia de una clase
		Juguete arbol = new Juguete();
		System.out.println(arbol.toString());
		
		arbol.setColor("Azul");
		System.out.println(arbol.toString());

	}

}
