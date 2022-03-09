package com.desafiolatam.f20211215;

public class Televisor {

//atributos
	private String marca;
	private String definicion;
	
	
//metodo
	public static String apagarTelevisor() {
		return " ";
	}


//constructores
	//constructor vacio	
	public Televisor() {
	super();
	}
	//constructor con parametros

public Televisor(String marca, String definicion) {
	super();
	this.marca = marca;
	this.definicion = definicion;
}
//setter&getters


public String getMarca() {
	return marca;
}


public void setMarca(String marca) {
	this.marca = marca;
}


public String getDefinicion() {
	return definicion;
}


public void setDefinicion(String definicion) {
	this.definicion = definicion;
}


@Override
public String toString() {
	return "Televisor [marca=" + marca + ", definicion=" + definicion + "]";
	}

}

