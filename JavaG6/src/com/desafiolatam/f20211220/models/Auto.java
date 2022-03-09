package com.desafiolatam.f20211220.models;

public class Auto { //EL OBJETO SE COMPORTA COMO UNA PLANTILLA VACIA.

	//1.- atributos
	private String color;
	private float velocidad;//Aquí se usa float minúscula con valor primitivo.//Parte velocidad 0.0
	private int ruedas;
	private float motor;//Aquí se usa Float con mayúscula al ser usado con el objeto. 
	//*****Diferencias de trabajar con valor primitivo u objeto.
	//Cuando se trabaja con variables primitivas el resultado que muestra es 0, en cambio 
	//con los objetos (String, Float, Integer, double, long), siempre se muestra como valor inicial nulo (NULL).
	
	//2.-constructores
	public Auto() {
		super();
	}

	public Auto(String color, float velocidad, int ruedas, Float motor) {
		super();
		this.color = color;
		this.velocidad = velocidad;
		this.ruedas = ruedas;
		this.motor = motor;
	}
	//3.-Getters&Setters

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(float velocidad) {
		this.velocidad = velocidad;
	}

	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	public Float getMotor() {
		return motor;
	}

	public void setMotor(Float motor) {
		this.motor = motor;
	}
//4.-Métodos
	@Override
	public String toString() {
		return "Auto [color=" + color + ", velocidad=" + velocidad + ", ruedas=" + ruedas + ", motor=" + motor + "]";
	}
	
	public  void aumentarVelocidad () {
		this.velocidad = this.velocidad + 10;
				
	}
	//sobrecaraga del metodo aumentarVelocidad
	//con this se llama al atributo velocidad(this.velocidad)
	
	public void aumentarVelocidad (float velocidad) {
		this.velocidad = this.velocidad + velocidad;
	}
	
	//sobrecarga del metodo con 2 parametros
	public void aumentarVelocidad (boolean acelerar, boolean frenar) {
		if(acelerar) {
			this.velocidad = this.velocidad +15;
		}else if (frenar) {
			this.velocidad = this.velocidad -10;
		}
	}
	
	public static void frenar() {
		
	}
	
	public static void doblar() {
		
	}
}
