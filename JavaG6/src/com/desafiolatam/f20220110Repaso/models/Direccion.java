package com.desafiolatam.f20220110Repaso.models;

public class Direccion {
	//atributo
	private String nombre;
	private int numero;
	private String ciudad;
	
	//constructores
	public Direccion() {
		super();
	}

	public Direccion(String nombre, int numero, String ciudad) {
		super();
		this.nombre = nombre;
		this.numero = numero;
		this.ciudad = ciudad;
	}

	//getters&setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	//metodo
	@Override
	public String toString() {
		return "Direccion [nombre=" + nombre + ", numero=" + numero + ", ciudad=" + ciudad + "]";
	}
	
	


}
