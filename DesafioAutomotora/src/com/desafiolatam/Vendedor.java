package com.desafiolatam;

public class Vendedor extends Persona{
	
	//atributos
	
	private String direccion;

	//constructores
	public Vendedor() {
		super();
	}

	public Vendedor(String direccion) {
		super();
		this.direccion = direccion;
	}

	//getters&setters
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	//ToString
	@Override
	public String toString() {
		return "Vendedor [direccion=" + direccion + ", getRut()=" + getRut() + ", getNombre()=" + getNombre() + "]";
	}

}
