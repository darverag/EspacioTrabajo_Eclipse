package com.desafiolatam.f20220119;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		//colas
		
		Queue<String> animales = new LinkedList<String>();
		animales.offer("Hasan");
		animales.offer("Mago");
		animales.offer("Galea");
		animales.offer("Jac");
		animales.offer("Tom");
		animales.offer("Zoe");
		animales.add("Tom");
		animales.add("Ayun");
		
		
		System.out.println("lista animales"+animales);
		System.out.println(animales.size());
		System.out.println();
		for (String mascota : animales) {
			System.out.println(mascota);
		}
		System.out.println();
		
		animales.offer("Jerry");//.offer inserta elementos al final
		String mascotaEliminada = animales.poll();//FIFO , se elimina el primer elemento
		System.out.println(mascotaEliminada);
		System.out.println("lista animales"+animales);
		System.out.println();
		
		System.out.println(animales.element());//Mostrar el primer elemento de la cola, no lo elimina de la lista
		System.out.println("lista animales" + animales);
		System.out.println();
		
		System.out.println(animales.peek());
		animales.remove("Tom");//remove remueve el dato que se solicita, tomando la primera coincidencia desde el punto de inicio
		System.out.println("lista animales" +animales);
		
		System.out.println();		
		animales.clear();//clear elimina todo
		System.out.println("lista animales 4" +animales);//lista vacia
		animales = null;//lista nula
		System.out.println(animales.peek());//retorna null en caso de estar vacia
		System.out.println("remove"+animales.remove("Tom"));
		System.out.println("poll"+ animales.poll());
		
		
	}

}