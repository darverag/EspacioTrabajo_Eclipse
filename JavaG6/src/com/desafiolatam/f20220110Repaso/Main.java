package com.desafiolatam.f20220110Repaso;

import java.util.Scanner;

import com.desafiolatam.f20220110Repaso.models.Automovil;
import com.desafiolatam.f20220110Repaso.models.Rueda;

public class Main {

	public static void main(String[] args) {
		
		//Instancia de una clase
		Scanner sc = new Scanner(System.in);
		String palabra = "esto es un texto";new String ("esto es un texto");
		
		//creacion intancia de clase
		Automovil automovil = new Automovil();
		System.out.println(automovil.toString());
		//agregar informacion (Mutador/setters)
		automovil.setColor("Rojo");
		automovil.setRuedas(4);
		automovil.setMotor("qwer2345");
		automovil.setVelocidad(350.6f);

		//llamado a metodo a traves de imprimir
		System.out.println(automovil.toString());
		
		//acceder a los valores de los atributos individualmente
		System.out.println(automovil.getMotor());
		System.out.println(automovil.getColor());
		
		
		
		//Creación nueva instancia de clase
		Automovil auto = new Automovil();
		auto.setColor("Blanco");
		auto.setMotor("asd123");
		auto.setRuedas(5);
		auto.setVelocidad(180f);
		//acceder a los valores
		System.out.println(auto.getColor());
		System.out.println(auto.getMotor());
		System.out.println(auto.getRuedas());
		System.out.println(auto.getVelocidad());
		System.out.println(auto.toString());
		
		System.out.println("***************************");
		Automovil autito = new Automovil ("Verder", 240.5f,4,"zxc987");
		
		System.out.println(autito.getColor());
		autito.setColor("Amarillo");
		System.out.println(autito.toString());
		autito.arranca();
		autito.dobla();
		autito.frena();
		
		System.out.println("***********************************");
		//String perfil, String tamano, String marca
		Rueda rueda1 = new Rueda("255","22inch","michelin");
		autito.setRueda(rueda1);
		System.out.println(autito.toString());
		
}

}