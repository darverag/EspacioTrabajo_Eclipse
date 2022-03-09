package com.desafiolatam.f20220112Repaso.models;

public class Cerveza {
	//atributos
	private int precio;
	private Botella botella; //colaboracion
	
	
	//constructores
	public Cerveza() {
		super();
	}
	public Cerveza(int precio, Botella botella) {
		super();
		this.precio = precio;
		this.botella = botella;
	}
	
	//getters&setters
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public Botella getBotella() {
		return botella;
	}
	public void setBotella(Botella botella) {
		this.botella = botella;
	}
	
	//metodo
	@Override
	public String toString() {
		return "Cerveza [precio=" + precio + ", botella=" + botella + "]";
	}
	
	

}
