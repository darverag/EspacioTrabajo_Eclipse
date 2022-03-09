package com.desafiolatam.f20211215;

public class Cocina {

//atributos
	private double altura;
	private int cantidadHornillas;
	
	//metodo
	public static String prenderHorno() {
		return " ";
		
	}
//constructores
	//constructor vacio
	public Cocina() {
		super();
	}
	//constructor con parametros

	public Cocina(double altura, int cantidadHornillas) {
		super();
		this.altura = altura;
		this.cantidadHornillas = cantidadHornillas;
	}
	//setter&getters  

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getCantidadHornillas() {
		return cantidadHornillas;
	}

	public void setCantidadHornillas(int cantidadHornillas) {
		this.cantidadHornillas = cantidadHornillas;
	}

	@Override
	public String toString() {
		return "Cocina [altura=" + altura + ", cantidadHornillas=" + cantidadHornillas + "]";
	}
	
}
