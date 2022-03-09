package com.desafiolatam.f20220111Repaso.models;

public class Camion extends VehiculoCarga {
	
	private String uso;

	public Camion() {
		super();
	}

	public Camion(String uso) {
		super();
		this.uso = uso;
	}

	public String getUso() {
		return uso;
	}

	public void setUso(String uso) {
		this.uso = uso;
	}

	@Override
	public String toString() {
		return "Camion [uso=" + uso + ", getToneladas()=" + getToneladas() + ", toString()=" + super.toString()
				+ ", getColor()=" + getColor() + ", getVelocidad()=" + getVelocidad() + ", getRuedas()=" + getRuedas()
				+ ", getMotor()=" + getMotor() + "]";
	}
	
	
	
}
