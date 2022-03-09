package com.desafiolatam.f20211222.models;

public class Juguete {
	
	private String tamano;
	private String tipoJueguete; //figura accion, preescolar, juegos de mesa, etc.
	private String color;
	
	//constructores
	public Juguete() {
		super();
	}
	public Juguete(String tamano, String tipoJueguete, String color) {
		super();
		this.tamano = tamano;
		this.tipoJueguete = tipoJueguete;
		this.color = color;
	}
	
	//getters&setters
	public String getTamano() {
		return tamano;
	}
	public void setTamano(String tamano) {
		this.tamano = tamano;
	}
	public String getTipoJueguete() {
		return tipoJueguete;
	}
	public void setTipoJueguete(String tipoJueguete) {
		this.tipoJueguete = tipoJueguete;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	//toString
	@Override
	public String toString() {
		return "Juguete [tamano=" + tamano + ", tipoJueguete=" + tipoJueguete + ", color=" + color + "]";
	}
	
	
	
	
	
}
