package com.desafiolatam.f20211218.models;

public class Ave extends Animal {
//atributos
	private String plumaje;
	private String pico;
	
	//constructores
	public Ave() {
		super();
	}

	public Ave(String nombre, String raza, String color, String tipo, String plumaje, String pico) {
		super(nombre, raza, color, tipo);
		this.plumaje = plumaje;
		this.pico = pico;
	}

	//getters&setters
	public String getPlumaje() {
		return plumaje;
	}

	public void setPlumaje(String plumaje) {
		this.plumaje = plumaje;
	}

	public String getPico() {
		return pico;
	}

	public void setPico(String pico) {
		this.pico = pico;
	}

	@Override
	public String toString() {
		return "Ave [plumaje=" + plumaje + ", pico=" + pico + ", nombre=" + nombre + ", raza=" + raza + ", color="
				+ color + ", tipo=" + tipo + ", getPlumaje()=" + getPlumaje() + ", getPico()=" + getPico()
				+ ", getNombre()=" + getNombre() + ", getRaza()=" + getRaza() + ", getColor()=" + getColor()
				+ ", getTipo()=" + getTipo() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

}

