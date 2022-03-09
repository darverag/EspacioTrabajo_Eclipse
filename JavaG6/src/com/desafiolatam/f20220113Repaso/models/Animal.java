package com.desafiolatam.f20220113Repaso.models;

public class Animal {
	//atributo
	private String sexo;
	
	//constructores
	public Animal() {
		super();
	}

	public Animal(String sexo) {
		super();
		this.sexo = sexo;
	}

	//getters&setters
	
	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	
	
	//metodo
	public void emitirSonido() {
		System.out.println("cuac cuac");
	}

	@Override
	public String toString() {
		return "Animal [sexo=" + sexo + "]";
	}




}
