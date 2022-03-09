package com.desafiolatam.f20220111Repaso.models;

public class VehiculoPax extends Automovil {
	
	private int cantPax;

	public VehiculoPax() {
		super();
	}

	public VehiculoPax(int cantPax) {
		super();
		this.cantPax = cantPax;
	}

	public VehiculoPax(String color, float velocidad, int ruedas, String motor, int cantPax) {
		super(color, velocidad, ruedas, motor);
		this.cantPax = cantPax;
	}

	public int getCantPax() {
		return cantPax;
	}

	public void setCantPax(int cantPax) {
		this.cantPax = cantPax;
	}

	@Override
	public String toString() {
		return "VehiculoPax [cantPax=" + cantPax + ", getColor()=" + getColor() + ", getVelocidad()=" + getVelocidad()
				+ ", getRuedas()=" + getRuedas() + ", getMotor()=" + getMotor() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
