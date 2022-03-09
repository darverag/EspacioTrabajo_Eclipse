package com.desafiolatam.f20220110Repaso.models;

public class Automovil {
	// atributos
	private String color;
	private float velocidad;
	private int cantidadRuedas;
	private String motor;
	//colaboracion
	private Rueda rueda;

	public Automovil() {
		super();
	}

	public Automovil(String color, float velocidad, int ruedas, String motor) {
		super();
		this.color = color;
		this.velocidad = velocidad;
		this.cantidadRuedas = ruedas;
		this.motor = motor;
	}

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
		return cantidadRuedas;
	}

	public void setRuedas(int ruedas) {
		this.cantidadRuedas = ruedas;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public Rueda getRueda() {
		return rueda;
	}

	public void setRueda(Rueda rueda) {
		this.rueda = rueda;
	}

	@Override
	public String toString() {
		return "Automovil [color=" + color + ", velocidad=" + velocidad + ", ruedas=" + cantidadRuedas + ", motor=" + motor
				+ ", rueda=" + rueda + "]";
	}

	public void arranca() {
		System.out.println("Metodo arrancar");
	}

	public void frena() {
		System.out.println("Metodo frenar");
	}

	public void dobla() {
	}

}
