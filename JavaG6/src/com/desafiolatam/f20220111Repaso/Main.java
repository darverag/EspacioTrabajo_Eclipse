package com.desafiolatam.f20220111Repaso;

import com.desafiolatam.f20220111Repaso.models.Auto;
import com.desafiolatam.f20220111Repaso.models.Bus;
import com.desafiolatam.f20220111Repaso.models.Camion;
import com.desafiolatam.f20220111Repaso.models.Camioneta;
import com.desafiolatam.f20220111Repaso.models.MiniBus;

public class Main {

	public static void main(String[] args) {
		Camioneta camioneta = new Camioneta ();
		
		camioneta.setColor("Azul");
		
		System.out.println(camioneta.toString());
		System.out.println("***************************************");
		
		Auto auto = new Auto();
		System.out.println(auto.toString());
		System.out.println("***************************************");
		
		Camion camion = new Camion ();
		camion.setUso("Forestal");
		camion.setToneladas(2500);
		System.out.println(camion.toString());
		System.out.println("****************************************");
		
		Bus bus = new Bus ();
		bus.setCantidadAsientos(45);
		bus.setCantPax(40);
		bus.setColor("Blanco");
		System.out.println(bus.toString());
		System.out.println("*****************************************");
		
		
		MiniBus minibus = new MiniBus();
		minibus.setTipoViajes("Traslado Funcionarios Salud");
		minibus.setColor("Azul");
		minibus.setCantPax(15);
		System.out.println(minibus.toString());
	}

}
