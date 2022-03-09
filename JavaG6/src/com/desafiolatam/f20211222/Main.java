package com.desafiolatam.f20211222;

import com.desafiolatam.f20211222.models.Doctor;

public class Main {

	public static void main(String[] args) {
		//instancia de una clase
		Doctor perro = new Doctor ();//perro es solo un nombre de variable, sigue siendo de tipo objeto Doctor.
		//perro.toString();//toString imprime la informacion del objeto, mediante un SYSO.
		//Aquí se genera el llamado al metodo
		System.out.println(perro.toString());
		//con set se realiza modificación de l atributo
		perro.setNombre("House");
		System.out.println(perro.toString());
		/******************************************************************/
		
		Doctor gato= new Doctor ("Queen","1-9","3416574634");
		System.out.println(gato.toString());
		//En caso de error y querer corregir un dato incorporar de la sgte forma.
		gato.setDni("5-4");
		System.out.println(gato.toString());
		
		//tarea crear el objeto Juguete
		

	}

}
