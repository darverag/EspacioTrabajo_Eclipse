package com.desafiolatam;

public class Utilidad {

	public void limpiezaPantalla() {
		for (int i = 0; i < 9; i++) {
			System.err.println("\n");
		}

	}
	
	public void tiempoEspera () {
		try {
			Thread.sleep(4000);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
}
