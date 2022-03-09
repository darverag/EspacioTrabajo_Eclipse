package com.desafiolatam.f20211218.models;

public class SmarthPhone extends Celular { //clase padre es la que nos compartira los atributos
	//ejercicio herencia
	//atributo
	private float camaraPixeles;
	private Float tarjetamemoriaTamanio;
	
	
	//constructores
	public SmarthPhone() {
		super();
		}
		
	public SmarthPhone(float camaraPixeles, Float tarjetamemoriaTamanio) {
			super();
			this.camaraPixeles = camaraPixeles;
			this.tarjetamemoriaTamanio = tarjetamemoriaTamanio;		
		
	}

	public SmarthPhone(String marca, String modelo, String color, Cargador cargador, float camaraPixeles,
			Float tarjetamemoriaTamanio) {
		super(marca, modelo, color, cargador);
		this.camaraPixeles = camaraPixeles;
		this.tarjetamemoriaTamanio = tarjetamemoriaTamanio;
	}

	//getters&setters
	public float getCamaraPixeles() {
		return camaraPixeles;
	}

	public void setCamaraPixeles(float camaraPixeles) {
		this.camaraPixeles = camaraPixeles;
	}

	public Float getTarjetamemoriaTamanio() {
		return tarjetamemoriaTamanio;
	}

	public void setTarjetamemoriaTamanio(Float tarjetamemoriaTamanio) {
		this.tarjetamemoriaTamanio = tarjetamemoriaTamanio;
	}

	@Override
	public String toString() {
		return "SmarthPhone [camaraPixeles=" + camaraPixeles + ", tarjetamemoriaTamanio=" + tarjetamemoriaTamanio
				+ ", getCamaraPixeles()=" + getCamaraPixeles() + ", getTarjetamemoriaTamanio()="
				+ getTarjetamemoriaTamanio() + ", getMarca()=" + getMarca() + ", getModelo()=" + getModelo()
				+ ", getColor()=" + getColor() + ", getCargador()=" + getCargador() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	@Override
	public void fotografiar() {
		super.fotografiar();
		System.out.println("Tomando la foto mas bacan del mundo!!!");
		
	}
}

	
	
