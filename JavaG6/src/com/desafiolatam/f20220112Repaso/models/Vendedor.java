package com.desafiolatam.f20220112Repaso.models;

public class Vendedor {
	
	private String direccion;

	public Vendedor() {
		super();
	}

	public Vendedor(String direccion) {
		super();
		this.direccion = direccion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Vendedor [direccion=" + direccion + "]";
	}

	
	

}
