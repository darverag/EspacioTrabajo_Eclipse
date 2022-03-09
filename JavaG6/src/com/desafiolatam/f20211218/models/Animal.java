package com.desafiolatam.f20211218.models;

public class Animal {//PADRE

	
	//atributo
	public String nombre;
	public String raza;
	public String color;
	public String tipo;
	
	public Animal() {
		super();
		
	//constructores
		
	}

	public Animal(String nombre, String raza, String color, String tipo) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.color = color;
		this.tipo = tipo;
	}

	
	//getters&setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", raza=" + raza + ", color=" + color + ", tipo=" + tipo + "]";
	}
	
	
	public void comer() {
		System.out.println("El animal "+nombre+"esta comiendo...");
		
	}
	
	public void correr() {
		System.out.println("El animal "+nombre+"esta corriendo...");
		
	}
	
	
	
}
