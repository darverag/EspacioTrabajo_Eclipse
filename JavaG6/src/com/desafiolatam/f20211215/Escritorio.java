package com.desafiolatam.f20211215;

public class Escritorio {
//atributos
	
	private double tamano;
	private String tipo;
	
	
	//constructores
	public Escritorio() {
		super();
	}


	public Escritorio(double tamano, String tipo) {
		super();
		this.tamano = tamano;
		this.tipo = tipo;
	}

	
	//getters&setters
	
	public double getTamano() {
		return tamano;
	}


	public void setTamano(double tamano) {
		this.tamano = tamano;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	@Override
	public String toString() {
		return "Escritorio [tamano=" + tamano + ", tipo=" + tipo + "]";
	}
	
		
}
