package com.desafiolatam.f20211220;

import com.desafiolatam.f20211220.models.Auto;
import com.desafiolatam.f20211220.models.Moto;
import com.desafiolatam.f20211220.models.Scooter;

public class Main {

	public static void main(String[] args) {
		// instancia de clase
		Auto auto = new Auto();//Auto() hace referencia al constructor vacío.
		auto.setColor("Negro");
		auto.aumentarVelocidad();//llamado a un metodo de auto
		auto.aumentarVelocidad();
		auto.aumentarVelocidad();
		auto.aumentarVelocidad();
		System.out.println(auto.toString());
		
		//instancia del moto
		Moto moto = new Moto ();
		moto.setColor("Blanca");
		moto.setRuedas(2);
		
		//metodo sobre escrito en moto
		moto.aumentarVelocidad();
		System.out.println(moto.toString());
		
		//metodo sobrecargado en auto
		moto.aumentarVelocidad(15);
		System.out.println(moto.toString());
		
		moto.aumentarVelocidad(false, true);
		System.out.println("frenar: "+moto.toString());
		
		Scooter scooter = new Scooter();	
		scooter.aumentarVelocidad(20);
		System.out.println("Scooter: "+scooter.toString());
	}


}
