package com.desafiolatam;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import modelos.Persona;
import repositorio.PersonaRepositorio;




public class PersonaRepositorioTest {

	private PersonaRepositorio personaRepositorio = mock(PersonaRepositorio.class);

	
	@Test
	public void testCrearPersona() {
		Persona pepe = new Persona("1-2", "Pepe");// instancia de la clase.

		when(personaRepositorio.crearPersona(pepe)).thenReturn("OK");
		// Al no coindicir el mensaje NOK enviado al crear la persona con el mensaje
		// esperado OK, verify indica que
		// la validación es roja
		String crearPersonaRes = personaRepositorio.crearPersona(pepe);
		assertEquals("OK", crearPersonaRes);
		verify(personaRepositorio).crearPersona(pepe);
	}

	   @Test
	public void testActualizarPersona() {
		Persona juanito = new Persona("1-2", "Juanito");

		when(personaRepositorio.actualizarPersona(juanito)).thenReturn("OK");
		String actualizarRes = personaRepositorio.actualizarPersona(juanito);
		assertEquals("OK", actualizarRes);
		verify(personaRepositorio).actualizarPersona(juanito);
	}
	   
	@Test
	public void testEliminarPersona() {

		Persona pedro = new Persona("1-5", "pedro");

		when(personaRepositorio.eliminarPersona(pedro)).thenReturn("OK");
		String eliminar = personaRepositorio.eliminarPersona(pedro);
		assertEquals("OK", eliminar);
		verify(personaRepositorio).eliminarPersona(pedro);

	}

	public void testListarPersona() {

		Map<String, String> map = new HashMap<String, String>();

		when(personaRepositorio.listarPersonas()).thenReturn(map);
		Map<String, String> listar = personaRepositorio.listarPersonas();
		assertEquals(map, listar);

		verify(personaRepositorio).listarPersonas();
	}

}
