package com.desafiolatam.f20220110Repaso.models;

public class Animal {
	//atributos
	
	private String nombre;
	private String raza;
	private String color;
	
	//constructores
	public Animal() {
		super();
	}
	public Animal(String nombre, String raza, String color) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.color = color;
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
	
	//metodo
	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", raza=" + raza + ", color=" + color + "]";
	}

}
