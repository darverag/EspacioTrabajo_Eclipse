package com.desafiolatam.f20220112Repaso.models;

public class Botella {
	
	//atributos
	
	private String tipoBotella;
	private String marca;
	
	//constructores
	public Botella() {
		super();
	}

	public Botella(String tipoBotella, String marca) {
		super();
		this.tipoBotella = tipoBotella;
		this.marca = marca;
	}

	//getters&setters
	public String getTipoBotella() {
		return tipoBotella;
	}

	public void setTipoBotella(String tipoBotella) {
		this.tipoBotella = tipoBotella;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	//metodos
	@Override
	public String toString() {
		return "Botella [tipoBotella=" + tipoBotella + ", marca=" + marca + "]";
	}
	
	
	
}
