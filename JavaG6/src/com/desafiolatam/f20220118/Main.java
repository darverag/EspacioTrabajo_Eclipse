package com.desafiolatam.f20220118;

public class Main {

	public static void main(String[] args) {
		
		InstitutoEducativo desafioLatam = InstitutoEducativo.obtenerInstancia();
		desafioLatam.setNombre("Desafio latam");
		System.out.println(desafioLatam.getNombre());
		
		InstitutoEducativo desafioChile = InstitutoEducativo.obtenerInstancia();
		//desafioChile.setNombre("Desafio Chile");//sobre escribiendo
		System.out.println(desafioChile.getNombre());
		System.out.println(desafioLatam.getNombre());
	}

}