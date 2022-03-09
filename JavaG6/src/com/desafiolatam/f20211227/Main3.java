package com.desafiolatam.f20211227;

public class Main3 {

	public static void main(String[] args) {
		//String nombre, String telefono
		Persona persona1= new Persona("Pepe Lota","55545454");
		
		Perro perro1= new Perro("Firulais", "café", 7, "mediano", false, true, "quiltro");	
		
		//String titulo, String descripcion, String fecha
		FichaAdopcion ficha1 = new FichaAdopcion("Adopción de Firulais", "En esta jornada de adopción Firulais tiene una nueva familia","27122021");

		ficha1.guardar(persona1, perro1);
		
		System.out.println("----------------------------");
		/*guardamos otra ficha de adopción*/
		Persona persona2= new Persona("Joe Pine","7878787877");
		
		Perro perro2 = new Perro();
		perro2.setNombre("Patán");
		perro2.setColor("Gris");
		perro2.setEdad(10);
		
		//String titulo, String descripcion, String fecha
		FichaAdopcion ficha2 = new FichaAdopcion("Adopción de Patán", "En esta jornada de adopción Patán tiene una nueva familia","25122021");
	
		ficha2.guardar(persona2, perro2);
	}

}
