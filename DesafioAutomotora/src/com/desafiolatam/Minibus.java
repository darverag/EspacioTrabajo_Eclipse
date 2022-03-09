package com.desafiolatam;

public class Minibus extends Bus{
	
	//atributos
	private String tipoViajes;

	//constructores
	public Minibus() {
		super();
	}
	
	public Minibus(String tipoViajes) {
		super();
		this.tipoViajes = tipoViajes;
	}

	//getters&setters
	public String getTipoViajes() {
		return tipoViajes;
	}

	public void setTipoViajes(String tipoViajes) {
		this.tipoViajes = tipoViajes;
	}

	@Override
	public String toString() {
		return "Minibus [tipoViajes=" + tipoViajes + ", getCantidadDeAsientos()=" + getCantidadDeAsientos()
				+ ", getColor()=" + getColor() + ", getPatente()=" + getPatente() + "]";
	}

	
	
	

}
