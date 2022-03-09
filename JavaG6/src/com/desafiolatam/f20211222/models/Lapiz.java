package com.desafiolatam.f20211222.models;

public class Lapiz {
	//atributos
	private String color;
	private String tipo;
	private String marca;
	
	
	//constructores
	
	public Lapiz() {
		super();
	}
	public Lapiz(String color, String tipo, String marca) {
		super();
		this.color = color;
		this.tipo = tipo;
		this.marca = marca;
		
		//getters&setters
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	//toString
	@Override
	public String toString() {
		return "Lapiz [color=" + color + ", tipo=" + tipo + ", marca=" + marca + "]";
	}
	
	

}
