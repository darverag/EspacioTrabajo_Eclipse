package com.desafiolatam.f20211222.models;

public class Doctor {
	
	private String nombre;
	private String dni;
	private String registro;
	//colaboracion, implica que viene a colaborar o complementar informacion que esta en otro lugar a la clase Doctor.
	private Lapiz lapiz;
	private Especialidad especialidad;
	
	
	//constructores
	
	public Doctor(String nombre, String dni, String registro) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.registro = registro;
	}

	public Doctor() {
		super();
	}
	
	
	//getters&setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	
	//toString
	
	@Override
	public String toString() {
		return "Doctor [nombre=" + nombre + ", dni=" + dni + ", registro=" + registro + "]";
	}
	

}
