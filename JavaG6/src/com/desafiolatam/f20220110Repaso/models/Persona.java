package com.desafiolatam.f20220110Repaso.models;

public class Persona {
	//atributos
	private String nombre;
	private String rut;
	private float altura;
	//colaboracion
	private Direccion direccion;
	
	//EL valor inicial para los atributos de tipo objeto es NULL
	
	//constructores
	public Persona() {
		super();
	}
	public Persona(String nombre, String rut) {
		super();
		this.nombre = nombre;
		this.rut = rut;
	}
	
	public Persona(String perro) {
		super();
		this.rut = perro;
	}
	
	public Persona(String nombre, String rut, float altura) {
		super();
		this.nombre = nombre;
		this.rut = rut;
		this.altura = altura;
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
	
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", rut=" + rut + ", altura=" + altura + ", direccion=" + direccion + "]";
	}
	
	
	
	
	
	
	
	
}
