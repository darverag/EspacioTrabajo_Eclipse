package com.desafiolatam;

public class Main {

	public static void main(String[] args) {
		
		Vehiculo vehiculo = new Vehiculo();
		Cliente cliente = new Cliente();
		LibroVenta libroVenta = new LibroVenta();
		
		vehiculo.setPatente("    ");
		vehiculo.setColor("Rojo");
		cliente.setRut("25467897-8");
		cliente.setNombre("Eduardo");
		cliente.setEdad(35);
		libroVenta.setFechaVenta("12122021");
		libroVenta.setNombreVenta("Contado");
		

		System.out.println(vehiculo.getColor());

		
		
	}

}
