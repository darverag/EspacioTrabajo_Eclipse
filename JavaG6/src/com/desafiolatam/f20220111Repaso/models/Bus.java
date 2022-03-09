package com.desafiolatam.f20220111Repaso.models;

public class Bus extends VehiculoPax{
	
	private int cantidadAsientos;

	public Bus() {
		super();
	}

	public Bus(int cantidadAsientos) {
		super();
		this.cantidadAsientos = cantidadAsientos;
	}

	public Bus(String color, float velocidad, int ruedas, String motor, int cantPax, int cantidadAsientos) {
		super(color, velocidad, ruedas, motor, cantPax);
		this.cantidadAsientos = cantidadAsientos;
	}

	public int getCantidadAsientos() {
		return cantidadAsientos;
	}

	public void setCantidadAsientos(int cantidadAsientos) {
		this.cantidadAsientos = cantidadAsientos;
	}

	@Override
	public String toString() {
		return "Bus [cantidadAsientos=" + cantidadAsientos + ", getCantPax()=" + getCantPax() + ", toString()="
				+ super.toString() + ", getColor()=" + getColor() + ", getVelocidad()=" + getVelocidad()
				+ ", getRuedas()=" + getRuedas() + ", getMotor()=" + getMotor() + "]";
	}

	
	
}
