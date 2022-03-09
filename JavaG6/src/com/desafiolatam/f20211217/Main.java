package com.desafiolatam.f20211217;

import com.desafiolatam.f20211217.models.Auto;

public class Main {

	public static void main(String[] args) {// Main metodo para ejecutar acciones
		
		 /* Scanner sc=new Scanner (system.in); ArrayList<String> arreglos =new
		 * ArrayList<String>(); String palabra="";//new String();
		 *CON TODOS LOS OBJETOS SE PUEDE REALIZAR ESTA OPERACION (INSTANCIA DE UNA CLASE)
		 // INSTANCIA DE UNA CLASE, ES CREAR UNA VARIABLE, UNA NUEVA INSTANCIA, ES DECIR SE ASIGNARA
		 // UN NUEVO ESPACIO DE MEMORIA INVOCANDO AL CONSTRUCTOR VACÍO.*/

		// Instancia de una clase
		Auto auto = new Auto();// Se utilizan palabras significativas, en el ejemplo " la variable es auto de
								// tipo Auto.(objeto)
		// Si la variable fuese de cualquier nombre, por ejemplo GATO, siempre será de
		// tipo Auto.
		// El invocar al constructor vacío quiere decir que al posicionarnos en el
		// objeto (new Auto) con ctrl + click, este nos llevará
		// al constructor vacío, de la clase Auto.

		System.out.println(auto.toString());// En esta secuencia de código se accede al método toString
		// Aquí se muestra e imprime la información que aparece en el método toString
		// del objeto Auto

		// (SET) Asignar valores a los atributos // Para que no aparezcan en CERO o NULL
		// se asigna valor al inicio.
		auto.setColor("Negro"); // Los Setters, modificadores o mutadores, colocan un valor en el atributo o
								// variable,
		// en ejemplo (color"negro")
		auto.setMotor(2.0f);// Al ser float variable primitivo debe ir f en el dato, si es objeto no es
							// necesario, pero como buena practica se coloca al final de digito, para
							// asegurarnos que ante cambios siga fncionando sin problemas el código.
		auto.setVelocidad(240f);// Se debe incorporar la letra "f" minúscula para hacer alusión a variable
								// float.
		auto.setRuedas(4);
		System.out.println(auto.toString());
		// (GET) acceder a los valores de los atributos
		System.out.println("El color es: " + auto.getColor());
		System.out.println("El tamaño de motor: " + auto.getMotor());
		System.out.println("velocidad maxima:  " + auto.getVelocidad());
		System.out.println("cantidad ruedas:  " + auto.getRuedas());

		System.out.println();
		// nueva instancia de la clase Auto//TODAS LAS INSTANCIAS SON IGUALES.//APENAS
		// SE HACE LA INSTANCIA SE ASIGNAN VALORES
		Auto autito = new Auto("Azul", 120f, 5, 1.0f);// Se invoca en parentesis directamente al constructor con
														// parametros para los atributos. (Se declaran los valores a los
														// atributos en mismo parentesis)
		System.out.println("Autito " + autito.toString());
		// Se puede cambiar el color desde aqui mismo.Con el GET y SET se puede acceder
		// al atributo
		autito.setColor("Amarillo");
		System.out.println("El color del autito es: " + autito.getColor());
	}
}
