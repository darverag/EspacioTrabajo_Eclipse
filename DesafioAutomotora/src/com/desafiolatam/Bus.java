package com.desafiolatam;

public class Bus extends Vehiculo {
	
	//atributos
	public int cantidadDeAsientos;

	//constructores
	public Bus() {
		super();
	}

	public Bus(int cantidadDeAsientos) {
		super();
		this.cantidadDeAsientos = cantidadDeAsientos;
	}

	//getters&setters
	public int getCantidadDeAsientos() {
		return cantidadDeAsientos;
	}

	public void setCantidadDeAsientos(int cantidadDeAsientos) {
		this.cantidadDeAsientos = cantidadDeAsientos;
	}

	//ToString
	@Override
	public String toString() {
		return "Bus [cantidadDeAsientos=" + cantidadDeAsientos + "]";
	}
	
	//metodo asientosDisponibles
	public int calculoAsientosDisponibles (int cantidadDeAsientos) {
		int asientosOcupados=8;
		int asientosDisponibles = cantidadDeAsientos-asientosOcupados;
		return asientosDisponibles;
	}
	

}
