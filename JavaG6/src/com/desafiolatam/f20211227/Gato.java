package com.desafiolatam.f20211227;

public class Gato extends Mascota{

	private boolean esRegalon;
	
	public Gato() {
		// TODO Auto-generated constructor stub
	}

	public Gato(String nombre, String color, int edad, String tamano, boolean esSalvaje, boolean esRegalon) {
		super(nombre, color, edad, tamano, esSalvaje);
		this.esRegalon = esRegalon;
	}
	
	

	public boolean isEsRegalon() {
		return esRegalon;
	}

	public void setEsRegalon(boolean esRegalon) {
		this.esRegalon = esRegalon;
	}

	@Override
	public String toString() {
		return "Gato [esRegalon=" + isEsRegalon() + ", nombre=" + nombre + ",\n color=" + color + ", edad=" + edad
				+ "\n, tamano=" + tamano + ", esSalvaje=" + esSalvaje + "]";
	}
	
	@Override
	public void comer() {
		System.out.println("El gato "+nombre+" está comiendo...");
	}
	
}
