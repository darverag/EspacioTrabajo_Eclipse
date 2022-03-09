package com.desafiolatam;

public class Persona {
	
	//Atributos
	
	public String rut;
	public String nombre;
	public int edad;
	
	//constructores
	public Persona() {
		super();
	}

	public Persona(String rut, String nombre, int edad) {
		super();
		this.rut = rut;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	//getters&setters
	public String getRut() {
		return rut;
	}


	public void setRut(String rut) {
		this.rut = rut;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}

	//ToString

	@Override
	public String toString() {
		return "Persona [rut=" + rut + ", nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	
	
}