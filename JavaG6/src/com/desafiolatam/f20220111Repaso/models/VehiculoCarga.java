package com.desafiolatam.f20220111Repaso.models;

public class VehiculoCarga extends Automovil {
	
	private float toneladas;

	public VehiculoCarga() {
		super();
	}

	public float getToneladas() {
		return toneladas;
	}

	public void setToneladas(float toneladas) {
		this.toneladas = toneladas;
	}

	@Override
	public String toString() {
		return "VehiculoCarga [toneladas=" + toneladas + ", toString()=" + super.toString() + "]";
	}
	
	

}
