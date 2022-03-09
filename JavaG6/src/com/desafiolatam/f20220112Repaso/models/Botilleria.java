package com.desafiolatam.f20220112Repaso.models;

public class Botilleria {
	
	//atributos
	
	private Cerveza cerveza;
	private String nombre;
	
	
	//constructores
	public Botilleria() {
		super();
	}


	public Botilleria(Cerveza cerveza, String nombre) {
		super();
		this.cerveza = cerveza;
		this.nombre = nombre;
	}

	//getters&setters

	public Cerveza getCerveza() {
		return cerveza;
	}


	public void setCerveza(Cerveza cerveza) {
		this.cerveza = cerveza;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	//metodo
	@Override
	public String toString() {
		return "Botilleria [cerveza=" + cerveza + ", nombre=" + nombre + "]";
	}
	
	
	

}
