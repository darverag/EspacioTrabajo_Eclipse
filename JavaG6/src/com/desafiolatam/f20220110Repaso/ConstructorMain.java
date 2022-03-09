package com.desafiolatam.f20220110Repaso;

import com.desafiolatam.f20220110Repaso.models.Direccion;
import com.desafiolatam.f20220110Repaso.models.Persona;

public class ConstructorMain {

	public static void main(String[] args) {
		Persona persona =new Persona("Darío", "1-4", 1.73f);
		
		//Crear instancia Direccion
		Direccion direccion = new Direccion();
		direccion.setNombre("Alberto Valenzuela Llanos");
		direccion.setNumero(21);
		direccion.setCiudad("Valparaíso");
		
		persona.setDireccion(direccion);
		System.out.println(persona.toString());
	
		
	}

}
