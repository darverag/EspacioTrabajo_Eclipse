package com.desafiolatam.f20211218.models;

public class Cargador {
	//atributos
	private String potencia;
	private String tipoConector;
    	
	//constructores
	public Cargador() {
		super();
	}

	public Cargador(String potencia, String tipoConector) {
		super();
		this.potencia = potencia;
		this.tipoConector = tipoConector;
	}

	//GETTERS&SETTER
	public String getPotencia() {
		return potencia;
	}

	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}

	public String getTipoConector() {
		return tipoConector;
	}

	public void setTipoConector(String tipoConector) {
		this.tipoConector = tipoConector;
	}

	//metodo toString
	@Override
	public String toString() {
		return "Cargador [potencia=" + potencia + ", tipoConector=" + tipoConector + "]";
	}
	

}
