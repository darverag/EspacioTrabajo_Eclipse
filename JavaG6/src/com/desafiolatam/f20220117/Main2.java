package com.desafiolatam.f20220117;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import com.desafiolatam.f20220117.models.cliente.Cliente;


public class Main2 {

	public static void main(String[] args) {
		ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
		//Para poder agregar a la lista un cliente, al ser un Array de tipo objeto primero se deben crear los clientes 
		//e instanciarlos. (Por cada uno des los clientes que se requieran agregar , se debe generar una instancia.)
		Cliente cliente0 = new Cliente("Darío", "Vera");
		Cliente cliente1 = new Cliente("Alexis", "Quezada");
		Cliente cliente2 = new Cliente("Migail", "Palma");
		
		listaClientes.add(cliente0);//Aqui se agrega un cliente a la lista pero como objeto
		listaClientes.add(cliente1);
		listaClientes.add(cliente2);
		
		listaClientes.get(2);//con esta acción se esta obteniendo un objeto Cliente
		//En la lista cliente, en la posicion2 esta cliente "Migail".
		
		Cliente clienteVacio = new Cliente();
		listaClientes.add(clienteVacio);
		
		listaClientes.get(3).setNombre("Jaime");
		
		System.out.println("Cliente vacio"+clienteVacio.getNombre());
		clienteVacio.setApellido("Tapia");
		
		System.out.println("*** for ***");
		for (int i = 0; i < listaClientes.size(); i++) {
			System.out.println(listaClientes.get(i));//Aqui se esta obteniendo el objeto.
			System.out.println(listaClientes.get(i).getNombre());//Aqui se esta imprimiendo el nombre de los objetos..(Dario, alexis, migail.
			//Cliente cli = listaClientes.get(i);
		//En vez de  crear una variable de objeto cliente para obtener la lista de objeto, se hace de forma directa dentro de un syso, lo que se muestra arriba.
		
		}
		
		System.out.println("*** foreach ***");
		for (Cliente cliente : listaClientes) {
			System.out.println(cliente.getApellido());//se muestra el apellido
			System.out.println(cliente.getNombre());//se muestra nombre
		}
		System.out.println("*** for Iterator ***");
		for (Iterator iterator = listaClientes.iterator(); iterator.hasNext();) {
			Cliente cliente = (Cliente) iterator.next();
			System.out.println(cliente.getApellido());//se muestra el apellido
			
		}
		//metodo de busqueda objeto dentro de un arrayList lo  hacemos con algun for 
		System.out.println();
		cliente1 = new Cliente("Migail", "Palma");
		System.out.println(listaClientes.contains(cliente1));
		
		/**
		 * Iterator
		 * */
		System.out.println();
		//asignamos la lista creada anteriormente
		//a un listIterator 
		//Un ventaja del list iterator que se puede trabajar buscando hacia adelante y atras
		ListIterator<Cliente>  clientesIterator = listaClientes.listIterator();
		
		System.out.println(clientesIterator.hasNext());//retorna true, indicando que hay elemento en la lista
		System.out.println(clientesIterator.next());//accediendo al primer objeto
		
		System.out.println(clientesIterator.hasPrevious());//con esta accion tambien se pregunta si hay objetos en la lista
		System.out.println(clientesIterator.previous());//accediendo al primer objeto
		
		System.out.println("***");
		//¿hay elementos en la lista?
		while(clientesIterator.hasNext()) {
			System.out.println(clientesIterator.next());//parte desde el primero al ultimo
		}
		System.out.println("***");
		//¿hay elementos en la lista?
		while(clientesIterator.hasPrevious()) {
			System.out.println(clientesIterator.previous());//parte desde el ultimo al primero
		}
		
	}

}
