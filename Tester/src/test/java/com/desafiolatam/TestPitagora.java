package com.desafiolatam;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestPitagora {

	//primero se crea la prueba y despues debemos codificar
	@Test
	public void validarPitagoras() {
		//
		Pitagoras pitagoras = new Pitagoras();
        Integer hipo = pitagoras.obtenerHipotenusa(3,4);
        System.out.println(hipo);
       assertEquals(5, hipo);
		
	}


}
