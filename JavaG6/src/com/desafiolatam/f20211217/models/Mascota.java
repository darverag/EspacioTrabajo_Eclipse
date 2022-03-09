package com.desafiolatam.f20211217.models;

public class Mascota {

	//atributos
	public String nombre;
	public String color;
	public int edad;
	public String tamano;
	public boolean esSalvaje;
	
	
	//constructores
	public Mascota() {
		super();
	}

	public Mascota(String nombre, String color, int edad, String tamano, boolean esSalvaje) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.edad = edad;
		this.tamano = tamano;
		this.esSalvaje = esSalvaje;
	}

	
	//Getters&Setters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getTamano() {
		return tamano;
	}

	public void setTamano(String tamano) {
		this.tamano = tamano;
	}

	public boolean isEsSalvaje() {
		return esSalvaje;
	}

	public void setEsSalvaje(boolean esSalvaje) {
		this.esSalvaje = esSalvaje;
	}

	
//toString
	
	@Override
	public String toString() {
		return "Mascota [nombre=" + nombre + ",\n color=" + color + ",\n edad=" + edad + ",\n tamano=" + tamano
				+ ",\n esSalvaje=" + esSalvaje + "]";
	
	}
	
	public void comer() {
		System.out.println("El animal " + nombre +" esta comiendo");
	}
}
