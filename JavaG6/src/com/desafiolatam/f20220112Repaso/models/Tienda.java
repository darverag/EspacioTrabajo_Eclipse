package com.desafiolatam.f20220112Repaso.models;

public class Tienda {
	private int stock;
	private Vendedor vendedor;
	private Cliente cliente;
	
	public Tienda() {
		super();
	}
	public Tienda(int stock, Vendedor vendedor, Cliente cliente) {
		super();
		this.stock = stock;
		this.vendedor = vendedor;
		this.cliente = cliente;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public Vendedor getVendedor() {
		return vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	@Override
	public String toString() {
		return "Tienda [stock=" + stock + ", vendedor=" + vendedor + ", cliente=" + cliente + "]";
	}
	
	

}
