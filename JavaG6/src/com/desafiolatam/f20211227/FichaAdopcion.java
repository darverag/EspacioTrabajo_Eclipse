package com.desafiolatam.f20211227;

public class FichaAdopcion {
	
	private String titulo;
	private String descripcion;
	private String fecha;
	
	
	public FichaAdopcion() {
		super();
	}


	public FichaAdopcion(String titulo, String descripcion, String fecha) {
		super();
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.fecha = fecha;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	
	public void guardar(Persona persona, Perro perro) {
		System.out.println("En la jornada de adopcion " +titulo+"la persona "+persona.getNombre() + "adoptó  a: "+perro.getNombre());
	
	}
	
	

}
