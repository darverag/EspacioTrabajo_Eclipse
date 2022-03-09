package com.desafiolatam.f20211218.models;

public class Celular {
	//atributo
	private String marca;
	private String modelo;
	private String color;
	//colaboracion de clase
	private Cargador cargador;
	
	//atributo cargador
	//colaboracion de clase, atributo Cargador se utilizará en todas partes
	
	//constructores
	public Celular() {
		super();
	}
	public Celular(String marca, String modelo, String color) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
	}
	
	public Celular(String marca, String modelo, String color, Cargador cargador) {
			super();
			this.marca = marca;
			this.modelo = modelo;
			this.color = color;
			this.cargador = cargador;
		}
			
		
	///getters&setters, estos metodos son para acceder a los atributos privados
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Cargador getCargador() {
		return cargador;
	}
	public void setCargador(Cargador cargador) {
		this.cargador = cargador;
	}
	
	
	//metodos
	@Override
	public String toString() {
		return "Celular [marca=" + marca 
				+ ", modelo=" + modelo 
				+ ", color=" + color 
				+ ", cargador=" + cargador + "]";
	}
	
	public void llamar (String persona) {
		System.out.println("Llamando a la persona "+persona);
		
	}
	
	public void fotografiar() {
		
	}
	
	public void buscarContacto() {
		
	}
	
}
