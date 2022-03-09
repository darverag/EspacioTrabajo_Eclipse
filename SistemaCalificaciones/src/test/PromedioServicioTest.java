package test;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import servicio.PromedioServicio;

public class PromedioServicioTest {
	
	private PromedioServicio servicio;
	
	@BeforeEach
	public void setup() {
		servicio = new PromedioServicio();
	}
	
	@Test
	public void calcularPromedio() {
		//Given
		List<Double>valores = new ArrayList<Double>();
		valores.add(5.0);
		valores.add(6.0);
		
		//when
		double resultado = servicio.calculadoraPromedio(valores);
		//Then
		Assertions.assertEquals(5.5, resultado);
	}
	
	@Test
	public void calcularPromedio_sinValores() {
		//Given
		List<Double>valores = new ArrayList<Double>();
		//when
		double resultado = servicio.calculadoraPromedio(valores);
		//Then
		Assertions.assertEquals(0.0, resultado);
	}

}
