package com.indianaJeans;

public class Utilidad {

	public void limpiezaPantalla() {
		for (int i = 0; i < 8; i++) {
			System.err.println("\n");
		}

	}
	
	public void tiempoEspera () {
		try {
			Thread.sleep(4500);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
}
