package com.desafioMirandoElPasado;

import java.util.Set;
import java.util.TreeSet;

public class Ejercicio2_ExCompaneros {

	public static void main(String[] args) {
			
		//1.- INSTANCIAR UN SET TIPO STRING LLAMADO "invitados" PARA AGREGAR UN LISTADO 
		//DE COMPAÑEROS(AS). USAR TreeSet<>() PARA LISTARLOS ORDENADAMENTE
		
		Set<String>invitados = new TreeSet<String>();

		//2.- AGREGAR LOS SGTES NOMBRES; DANIEL-PAOLA-FACUNDO-PEDRO-JACINTA-FLORENCIA-JUAN PABLO

		invitados.add("Daniel");
		invitados.add("Paola");
		invitados.add("Facundo");
		invitados.add("Pedro");
		invitados.add("Jacinta");
		invitados.add("Florencia");
		invitados.add("Juan Pablo");
		
		System.out.println("Lista invitados ordenada Alfabeticamnete :" +invitados);
		
		//3.- CREAR NUEVA LISTA DE NOMBRE "posiblesInvitados". AGREGAR A JORGE-FRANCISCO-MARCOS
		// UNIR A SU VEZ, NUEVO LISTADO CON LISTADO INICIAL E IMPRIMIR POR PANTALLA
		
		Set<String> posiblesInvitados = new TreeSet<String>();
		
		posiblesInvitados.add("Jorge");
		posiblesInvitados.add("Francisco");
		posiblesInvitados.add("Marcos");
		invitados.addAll(posiblesInvitados);
		
		System.out.println("\nNuevo listado de invitados y posibles invitados " +invitados);
		System.out.println();
		
		//4.- ELIMINAR DE LA LISTA A "Jorge"  E IMPRIMIR EL LISTADO FINAL
		
		invitados.remove("Jorge");
		System.out.println("El listado final de invitados es el siguiente: "+invitados);
		
		
	}

}
