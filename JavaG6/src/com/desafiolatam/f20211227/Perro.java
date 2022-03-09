package com.desafiolatam.f20211227;

public class Perro extends Mascota {
	
	private boolean daLaPata;
	private String raza;
	
	public Perro() {
		// TODO Auto-generated constructor stub
	}
	
	public Perro(String nombre, String color, int edad, String tamano, boolean esSalvaje, boolean daLaPata,
			String raza) {
		super(nombre, color, edad, tamano, esSalvaje);
		this.daLaPata = daLaPata;
		this.raza = raza;
	}
	
	public boolean isDaLaPata() {
		return daLaPata;
	}

	public void setDaLaPata(boolean daLaPata) {
		this.daLaPata = daLaPata;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public void ladrar() {
		System.out.println(super.nombre+": Guau!!!");
	}

}
