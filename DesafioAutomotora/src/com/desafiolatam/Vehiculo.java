package com.desafiolatam;

public class Vehiculo {
	
	//atributos
	public String  color;
	public String patente;
	
	
	//constructores
	public Vehiculo() {
		super();
	}

	public Vehiculo(String color, String patente) {
		super();
		this.color = color;
		this.patente = patente;
	}
	
	//getters&setters

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}
	
	//ToString

	@Override
	public String toString() {
		return "Vehiculo [color=" + color + ", patente=" + patente + "]";
	}


    
	
	
	
	

}
