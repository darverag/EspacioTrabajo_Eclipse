package com.desafiolatam.f20220110Repaso.models;

public class Rueda {
	
	//atributos
	private String perfil;
	private String tamano;
	private String marca;
	
	//constructores
	public Rueda() {
		super();
	}
	public Rueda(String perfil, String tamano, String marca) {
		super();
		this.perfil = perfil;
		this.tamano = tamano;
		this.marca = marca;
	}
	//getters&setters
	
	public String getPerfil() {
		return perfil;
	}
	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}
	public String getTamano() {
		return tamano;
	}
	public void setTamano(String tamano) {
		this.tamano = tamano;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	//metodo
	@Override
	public String toString() {
		return "Rueda [perfil=" + perfil + ", tamano=" + tamano + ", marca=" + marca + "]";
	}
	
	
	
}
