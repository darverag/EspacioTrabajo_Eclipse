package com.desafiolatam.f20220118;

public class Alumno implements Comparable<Alumno>{

	
	private String nombre;
	private String apellido;
	
	public Alumno() {
		super();
	}
	public Alumno(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	@Override
	public int compareTo(Alumno o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
