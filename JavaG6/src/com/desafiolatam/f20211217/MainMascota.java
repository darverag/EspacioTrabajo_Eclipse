package com.desafiolatam.f20211217;

import java.util.Scanner;

import com.desafiolatam.f20211217.models.Mascota;

public class MainMascota {

	public static void main(String[] args) {
		
		Mascota mascotita1 = new Mascota("Firulais", "café",8,"grande",false);
		System.out.println(mascotita1.toString());
		
		
		Mascota mascotita2 = new Mascota("Pepito el Loro","verde",7,"pequeño",false);
		mascotita2.comer();
		mascotita1.comer();
		
		
		Mascota mascota3 = new Mascota();
		mascota3.setNombre("Sonic");
		mascota3.setColor("Azul");
		mascota3.setEdad(12);
		
		
		System.out.println("---------------------------------------------");
		System.out.println(mascota3.toString());
		
		
		Mascota mascota4 =new Mascota();
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Ingrese el nombre de la mascota: ");
		String nombreMascotas=sc.nextLine();
		System.out.println("Ingrese el color de la mascota: ");
		String colorMascota=sc.nextLine();
		System.out.println("Ingrese la edad de la mascota: ");
		int edadMascota=sc.nextInt();
		
		mascota4.setNombre(nombreMascotas);
		mascota4.setColor(colorMascota);
		mascota4.setEdad(edadMascota);
		
		System.out.println("Falt algo aquí");
	}
	

}
