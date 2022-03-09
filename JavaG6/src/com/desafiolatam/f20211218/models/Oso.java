package com.desafiolatam.f20211218.models;

public class Oso extends Animal{
	//atributos	
	private String pelaje;
	private String hocico;

	
	//constructores
	public Oso() {
		super();
	}

	public Oso(String nombre, String raza, String color, String tipo, String pelaje, String hocico) {
		super(nombre, raza, color, tipo);
		this.pelaje = pelaje;
		this.hocico = hocico;
	}

	//getters&setters
	public String getPelaje() {
		return pelaje;
	}

	public void setPelaje(String pelaje) {
		this.pelaje = pelaje;
	}

	public String getHocico() {
		return hocico;
	}

	public void setHocico(String hocico) {
		this.hocico = hocico;
	}

	@Override
	public String toString() {
		return "Oso [pelaje=" + pelaje + ", hocico=" + hocico + ", nombre=" + nombre + ", raza=" + raza + ", color="
				+ color + ", tipo=" + tipo + ", getPelaje()=" + getPelaje() + ", getHocico()=" + getHocico()
				+ ", getNombre()=" + getNombre() + ", getRaza()=" + getRaza() + ", getColor()=" + getColor()
				+ ", getTipo()=" + getTipo() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
}
	


	