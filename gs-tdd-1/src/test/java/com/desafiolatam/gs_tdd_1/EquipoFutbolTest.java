package com.desafiolatam.gs_tdd_1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class EquipoFutbolTest {
	private static final int JUEGOS_GANADOS = 8;
	private static final int JUEGOS_EMPATADOS =8;
	private static final int JUEGOS_PERDIDOS=8;

	@Test
	public void juegosGanados() {
		EquipoFutbol equipoFutbol = new EquipoFutbol(JUEGOS_GANADOS, JUEGOS_PERDIDOS, JUEGOS_EMPATADOS);
		Integer ganados = equipoFutbol.getJuegosGanados();
		assertEquals(JUEGOS_GANADOS, ganados);
	}
	
	@Test
	public void juegosPerdidos() {
		EquipoFutbol equipoFutbol = new EquipoFutbol(JUEGOS_GANADOS, JUEGOS_PERDIDOS, JUEGOS_EMPATADOS);
		Integer perdidos = equipoFutbol.getJuegosPerdidos();
		assertEquals(JUEGOS_PERDIDOS, perdidos);
		
	}
	
	@Test
	public void juegosEmpatados() {
		EquipoFutbol equipoFutbol = new EquipoFutbol(JUEGOS_GANADOS, JUEGOS_PERDIDOS, JUEGOS_EMPATADOS);
		Integer empatados =equipoFutbol.getJuegosEmpatados();
		assertEquals(JUEGOS_EMPATADOS, empatados);

	
	}
}
