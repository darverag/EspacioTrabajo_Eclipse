package com.desafiolatam.f20220111Repaso.models;

public class Auto extends Automovil{
	
	private int cantPax;

	public Auto() {
		super();
	}

	public Auto(int cantPax) {
		super();
		this.cantPax = cantPax;
	}

	public Auto(String color, float velocidad, int ruedas, String motor, int cantPax) {
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
		return "Auto [cantPax=" + cantPax + ", clase padre=" + super.toString() + "]";
	}
	
	
	
	

}
