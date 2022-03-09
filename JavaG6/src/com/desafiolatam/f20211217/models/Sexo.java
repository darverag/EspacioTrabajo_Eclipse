package com.desafiolatam.f20211217.models;

public class Sexo {
	
	//atributo
	private String sexo;

	
	//constructores
	public Sexo() {
		super();
	}


	public Sexo(String sexo) {
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

//toString
	@Override
	public String toString() {
		return "Sexo [sexo=" + sexo + "]";
	}	
	
}
