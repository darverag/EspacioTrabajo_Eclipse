package com.desafiolatam.f20220112Repaso.models;

import com.desafiolatam.f20220110Repaso.models.Persona;

public class Cliente extends Persona{
	
	private int edad;

	public Cliente() {
		super();
	}

	public Cliente(int edad) {
		super();
		this.edad = edad;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Cliente [edad=" + edad + "]";
	}
	
	
	public void imprimeCliente() {
		System.out.println("edad:" + this.edad);
		System.out.println("nombre: "+getNombre());
	}

}
