package com.desafiolatam;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.logging.Logger;

import org.junit.Test;

public class ImcTest {
	 
	private Logger logger =Logger.getLogger("");

	@Test
	public  void validarEdad() {
		
		Imc imc = new Imc();
		Integer resultado =	imc.validarEdad(18);
		System.out.println(resultado);
		assertEquals(18, resultado);
	}
	
	@Test
	public void obtenerEstatura() {
		
		Imc imc = new Imc();
		Float resultado = imc.obtenerEstatura();
		System.out.println(resultado);
		assertNotNull(resultado);
	}
	
	@Test
	public void obtenerKilos() {
		
		Imc imc = new Imc();
		Float resultado = imc.obtenerKilos(80f);
		System.out.println(resultado);
		assertNotEquals(0, resultado);
	}
	
	@Test
	public void calcularIMCnotNull() {
		
		Imc imc = new Imc();
		Float resultado = imc.calcularIMC(null, null);
		System.out.println(resultado);
		assertNotNull(resultado);
	}
	
	@Test
	public void calcularIMCnotEquals() {
		
		Imc imc = new Imc();
		Float resultado = imc.calcularIMC(80f, 1.80f);
		System.out.println(resultado);
		assertNotEquals(0f, resultado);
	}
	
	@Test
	public void calcularIMCEquals() {
		
		Imc imc = new Imc();
		Float resultado = imc.calcularIMC(80f, 1.80f);
		System.out.println(resultado);
		assertEquals(24.69136f, resultado);
	}
	
	@Test
	public void calcularIMC0() {
		
		Imc imc = new Imc();
		Float resultado = imc.calcularIMC(0f, 0f);
		System.out.println(resultado);
		assertEquals(0f, resultado);
	}
}
