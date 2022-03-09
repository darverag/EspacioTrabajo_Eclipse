package com.desafiolatam.f20220113Repaso.models;

public class Perro extends Animal{
	
	//atributo
	private String raza;
	
	
	//constructores
	public Perro() {
		super();
	}

	public Perro(String raza) {
		super();
		this.raza = raza;
	}

	
	//getters&setters
	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	//metodo
	@Override
	public void emitirSonido() {
		System.out.println("guau guau");
		
	}

	@Override
	public String toString() {
		return "Perro [raza=" + raza + ", toString()=" + super.toString() + "]";
	}

	
	
	
	
	

}
