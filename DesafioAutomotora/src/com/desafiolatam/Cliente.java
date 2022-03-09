package com.desafiolatam;

public class Cliente extends Persona{

	//atributos
	
	private int edad;

	
	//constructores
	public Cliente() {
		super();
	}

	public Cliente(int edad) {
		super();
		this.edad = edad;
	}

	//getters&setters
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	//ToString
	@Override
	public String toString() {
		return "Cliente [edad=" + edad + ", getRut()=" + getRut() + ", getNombre()=" + getNombre() + "]";
	}

	
	

	
	

	
	
}
