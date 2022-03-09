package com.desafiolatam.f20220104Repaso;


import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//Array o arreglos dinámicos
		//Estos se declaran, inicializar, usar.
		
		       //Esto es declaracion//      //Inicializacion, después del new//
		 ArrayList<Integer> numerosPares = new ArrayList<Integer>(); //Entre los parantesis se declara el tipode dato a trabajar
		System.out.println(numerosPares);//Al imprimir en esta instancia se puede ver que arreglo esta vacío
		System.out.println(numerosPares.size()); //cantidad de elementos o tamaño, en este caso es cero, siempre es así cuando se inicia.
		//agregar elementos al arreglo
		numerosPares.add(22);
		numerosPares.add(12);
		numerosPares.add(36);
		numerosPares.add(102);
		System.out.println(numerosPares);//Al imprimir acá ya podemos ver que una vez ingresados los datos ya el array tiene información.
		System.out.println(numerosPares.size()); //cantidad de elementos o tamaño, en este caso es 4
		
		numerosPares.add(4, 88);//insertar en una posicion cuando no existe.
		numerosPares.add(3,44);//Si existe un elemento lo desplaza hacia la derecha, ocupando su lugar.
		System.out.println(numerosPares);
		
		//acceder a un elemnto del arreglo por su posicion
		//arreglo.get(posicion)
		System.out.println(numerosPares.get(3));
		
		ArrayList<Integer> datosAEliminar= new ArrayList<Integer>();
		datosAEliminar.add(36);
		datosAEliminar.add(102);
		
		//eliminar a partir de otro array
		numerosPares.removeAll(datosAEliminar);
		
		System.out.println("arreglo final: "+numerosPares);
	}

}