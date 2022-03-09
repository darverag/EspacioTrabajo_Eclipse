package com.desafiolatam.f20220111Repaso.models;

public class MiniBus extends Bus {

	private String tipoViajes;

	public MiniBus() {
		super();
	}

	public MiniBus(String tipoViajes) {
		super();
		this.tipoViajes = tipoViajes;
	}

	public MiniBus(String color, float velocidad, int ruedas, String motor, int cantPax, int cantidadAsientos,
			String tipoViajes) {
		super(color, velocidad, ruedas, motor, cantPax, cantidadAsientos);
		this.tipoViajes = tipoViajes;
	}

	public String getTipoViajes() {
		return tipoViajes;
	}

	public void setTipoViajes(String tipoViajes) {
		this.tipoViajes = tipoViajes;
	}

	@Override
	public String toString() {
		return "MiniBus [tipoViajes=" + tipoViajes + ", getCantidadAsientos()=" + getCantidadAsientos()
				+ ", toString()=" + super.toString() + ", getCantPax()=" + getCantPax() + ", getColor()=" + getColor()
				+ ", getVelocidad()=" + getVelocidad() + ", getRuedas()=" + getRuedas() + ", getMotor()=" + getMotor()
				+ "]";
	}
	
	
}
