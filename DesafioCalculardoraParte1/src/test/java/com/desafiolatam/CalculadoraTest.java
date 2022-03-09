package com.desafiolatam;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.logging.Logger;

import org.junit.Test;

public class CalculadoraTest {
	
	private static Logger logger = Logger.getLogger("com.desafiolatam.CalculadoraTest");
	
	@Test
	public void metodoRestar() {
		
		logger.info("Metodo Restar");
		Calculadora calculadora = new Calculadora();
		Double resultadoRestar = calculadora.metodoRestar(4.5D, 1.5D);
		assertEquals(3, resultadoRestar);
	}
	
	@Test
	public void metodoSumar() {
		
		logger.info("Metodo Sumar");
		Calculadora calculadora = new Calculadora();
		Double resultadoSumar= calculadora.metodoSumar(4.5D, 2.3D);
		assertEquals(6.8, resultadoSumar);
	}
	
	@Test
	public void metodoMultiplicar() {
		
		logger.info("Metodo Multiplicar");
		Calculadora calculadora = new Calculadora();
		Double resultadoMultiplicar = calculadora.metodoMultiplicar(5D, 5D);
		assertEquals(25, resultadoMultiplicar);
	}
	
	@Test
	public void metodoDividir() {
		
		logger.info("Metodo Dividir");
		Calculadora calculadora = new Calculadora();
		Double resultadoDividir = calculadora.metodoDividir(6D, 2D);
		assertEquals(3, resultadoDividir);
	}

}
