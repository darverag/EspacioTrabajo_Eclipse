package com.desafiolatam.f20211217.models;

public class Persona {

	// 1.- atributos
	private String nombre;
	private String rut;
	private float altura;
	private Sexo sexo;
	//colaboracion de clase

	// constructores
	public Persona() {
		super();
	}


	public Persona(String nombre, String rut, float altura, Sexo sexo) {
		super();
		this.nombre = nombre;
		this.rut = rut;
		this.altura = altura;
		this.sexo = sexo;
	}

	//getters&setters
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getRut() {
		return rut;
	}


	public void setRut(String rut) {
		this.rut = rut;
	}


	public float getAltura() {
		return altura;
	}


	public void setAltura(float altura) {
		this.altura = altura;
	}


	public Sexo getSexo() {
		return sexo;
	}


	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

//toString
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", rut=" + rut + ", altura=" + altura + ", sexo=" + sexo + "]";
	}

}