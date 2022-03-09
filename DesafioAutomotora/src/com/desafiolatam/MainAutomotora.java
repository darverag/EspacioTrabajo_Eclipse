package com.desafiolatam;

public class MainAutomotora {

	public static void main(String[] args) {
		
		//Instancias a utilizar para guardarVenta
		
		Vehiculo vehiculoA= new Vehiculo();
		Cliente clienteA=new Cliente();
		LibroVenta libroVentaA=new LibroVenta();
		
		//Se agregan parametros
		
		clienteA.setNombre("Francisco De Aguirre Sandoval");
		clienteA.setRut("12524689-4");
		clienteA.setEdad(55);
		vehiculoA.setPatente("FJJS25");
		vehiculoA.setColor("Azul");
		libroVentaA.setNombreVenta("Crédito");
		libroVentaA.setFechaVenta("25012022");
		
	//	System.out.println("Venta efectuada a  "+clienteA);
	//	System.out.println("Caracteristicas producto "+vehiculoA);
	//	System.out.println("Datos de transacción "+libroVentaA);
		
		//Llamado al metodo creado en libro venta
		libroVentaA.guardarVenta(clienteA, vehiculoA);
		
		
	}

}

