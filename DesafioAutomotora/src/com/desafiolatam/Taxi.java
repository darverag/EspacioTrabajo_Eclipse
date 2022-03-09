package com.desafiolatam;

public class Taxi extends Vehiculo {
	
	//atributos
	
	private int valorPasaje;
	
	//Constructores
	public Taxi() {
		super();
	}
	
	public Taxi(int valorPasaje) {
		super();
		this.valorPasaje = valorPasaje;
	}

	//getters&setters
	public int getValorPasaje() {
		return valorPasaje;
	}

	public void setValorPasaje(int valorPasaje) {
		this.valorPasaje = valorPasaje;
	}

	//ToString
	@Override
	public String toString() {
		return "Taxi [valorPasaje=" + valorPasaje + "]";
	}
	
	//metodo pagarPasaje
	public int pagarPasaje(int pagoPasaje) {
		
		if(valorPasaje<=pagoPasaje) {
			int vuelto = pagoPasaje-valorPasaje;
			if(vuelto ==0) {
				System.out.println("Pasaje Pagado");
				
			}else {
					System.out.println("El vuelto es: "+vuelto);
			}
			return vuelto;
		}else {
			System.out.println("Monto incompleto, falta dinero");
		return pagoPasaje;
		}
		
	}
}
