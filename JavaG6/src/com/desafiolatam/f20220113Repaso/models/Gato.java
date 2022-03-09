package com.desafiolatam.f20220113Repaso.models;

public class Gato extends Animal{

	private boolean caracter;
	
	
	public Gato() {
		super();
	}

	public Gato(boolean caracter) {
		super();
		this.caracter = caracter;
	}

	public boolean isCaracter() {
		return caracter;
	}

	public void setCaracter(boolean caracter) {
		this.caracter = caracter;
	}

	
	
	@Override
	public void emitirSonido() {
		System.out.println("miau miau");
	}

	@Override
	public String toString() {
		return "Gato [caracter=" + caracter + ", toString()=" + super.toString() + "]";
	}

	
	
}
