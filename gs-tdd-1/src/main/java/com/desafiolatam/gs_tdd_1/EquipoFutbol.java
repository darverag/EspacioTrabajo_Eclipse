package com.desafiolatam.gs_tdd_1;

public class EquipoFutbol {

	private Integer juegosGanados;
	private Integer juegosPerdidos;
	private Integer juegosEmpatados;

	

	public EquipoFutbol(int juegosGanados, int juegosPerdidos, int juegosEmpatados) {
		super();
		this.juegosGanados = juegosGanados;
		this.juegosPerdidos = juegosPerdidos;
		this.juegosEmpatados = juegosEmpatados;
		
	}

	public EquipoFutbol(int juegosEmpatados) {
		// TODO Auto-generated constructor stub
	}

	public Integer getJuegosGanados() {
		return juegosGanados;
	}

	public Integer getJuegosPerdidos() {
		return juegosPerdidos;
	}
	
	public void setJuegosEmpatados(int juegosEmpatados) {
		this.juegosEmpatados = juegosEmpatados;	
	}

	public Integer getJuegosEmpatados() {
		return juegosEmpatados;
	}
}
