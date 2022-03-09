package com.desafiolatam;

public class Tienda {
	
	//atributos
	private Vendedor vendedor;
	private Vehiculo vehiculo;
	private int Stock;
	
	//constructores
	public Tienda() {
		super();
	}

	public Tienda(Vendedor vendedor, Vehiculo vehiculo, int stock) {
		super();
		this.vendedor = vendedor;
		this.vehiculo = vehiculo;
		Stock = stock;
	}

	//getters&setters
	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public int getStock() {
		return Stock;
	}

	public void setStock(int stock) {
		Stock = stock;
	}

	//ToString
	@Override
	public String toString() {
		return "Tienda [vendedor=" + vendedor + ", vehiculo=" + vehiculo + ", Stock=" + Stock + "]";
	}
	
	//metodo existeStock
	public int existeStock (int stock) {
		int venta=10;
		int saldoStock = stock -venta;
		System.out.println("Cantidad de stock es:" +saldoStock);
		return saldoStock;
	}
	

}
