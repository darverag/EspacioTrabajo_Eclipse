package com.desafiolatam;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void metodoPruebaRestarEquals() {
		Calculadora calculadora = new Calculadora();
		Double resultadoRestar = calculadora.metodoRestar(4.5D, 3.5D);
		assertEquals(1, resultadoRestar);
	}
	
	@Test
	public void metodoPruebaRestarNotNull() {
		Calculadora calculadora = new Calculadora();
		Double resultadoRestar = calculadora.metodoRestar(4.5D, null);
		assertNotNull(resultadoRestar);
	}
		
	@Test
	public void metodopruebaRestarNotEquals() {
		Calculadora calculadora = new Calculadora();
		Double resultadoRestar = calculadora.metodoRestar(4.5D, 3.5D);
		assertNotEquals(2, resultadoRestar);
		
	}
	
	
	
	
	@Test
	public void metodoPruebaSumar() {
		Calculadora calculadora = new Calculadora();
		Double resultadoSumar = calculadora.metodoSumar(4.2D, 5.1D);
		assertEquals(9.3 , resultadoSumar);
	}
	
	@Test
	public void metodoPruebaSumarNotNull() {
		Calculadora calculadora = new Calculadora();
		Double resultadoSumar = calculadora.metodoSumar(4.2D, null);
		assertNotNull(resultadoSumar);
	}
	
	@Test
	public void metodopruebaSumarNotEquals() {
		Calculadora calculadora = new Calculadora();
		Double resultadoSumar = calculadora.metodoSumar(4.2D, 5.1D);
		assertNotEquals(15, resultadoSumar);
	}
		
	
	
	
	
	@Test
	public void metodoPruebaMultiplicar() {
		Calculadora calculadora =new Calculadora();
		Double resultadoMultiplicar = calculadora.metodoMultiplicar(3D, 3D);
		assertEquals(9, resultadoMultiplicar);
	}
	
	@Test
	public void metodoPruebaMultiplicarNotNull() {
		Calculadora calculadora =new Calculadora();
		Double resultadoMultiplicar = calculadora.metodoMultiplicar(3D, null);
		assertNotNull(resultadoMultiplicar);
	}
	
	@Test
	public void metodopruebaMultiplicarNotEquals() {
		Calculadora calculadora = new Calculadora();
		Double resultadoMultiplicar = calculadora.metodoMultiplicar(3D, 3D);
		assertNotEquals(5, resultadoMultiplicar);
	}
	
	
	
	
	@Test
	public void metodoPruebaDividir() {
		Calculadora calculadora = new Calculadora();
		Double resultadoDividir = calculadora.metodoDividir(16D, 2D);
		assertEquals(8, resultadoDividir);
	}
	
	@Test
	public void metodoPruebaDividirNotNull() {
		Calculadora calculadora = new Calculadora();
		Double resultadoDividir = calculadora.metodoDividir(16D, null);
		assertNotNull(resultadoDividir);
	}
	
	@Test
	public void metodopruebaDividirNotEquals() {
		Calculadora calculadora = new Calculadora();
		Double resultadoDividir = calculadora.metodoDividir(16D, 2D);
		assertNotEquals(4, resultadoDividir);
	}
	
}
