package com.desafiolatam.f20220113Repaso;

import com.desafiolatam.f20220113Repaso.models.Animal;
import com.desafiolatam.f20220113Repaso.models.Gato;
import com.desafiolatam.f20220113Repaso.models.Perro;

public class Main {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.emitirSonido();
		animal.setSexo("Hembra");
		
		/**
		 * POLIMORFISMO
		 **/
		
		Animal perroAnimal = new Perro();
		perroAnimal.emitirSonido();
		perroAnimal.setSexo("Macho");
		
		/*casting, para utilizar los atributos y metodos de la clase hijo*/
		Perro perro = (Perro) perroAnimal;//Perro perrito = new Perro();
		perro.setRaza("Bulldog");
		System.out.println(perro.toString());
		
		
		Animal gatoAnimal = new Gato();
		gatoAnimal.emitirSonido();
		gatoAnimal.setSexo("Macho");
		
		Gato gato = (Gato) gatoAnimal;
		
		//convertir  clase a super clase
		
		Gato tom = new Gato();
		Animal tomas = tom;
		
	}

}
