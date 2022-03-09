package com.desafiolatam.f20220112Repaso;

import java.util.ArrayList;

import com.desafiolatam.f20220112Repaso.models.Botella;
import com.desafiolatam.f20220112Repaso.models.Botilleria;
import com.desafiolatam.f20220112Repaso.models.Cerveza;
import com.desafiolatam.f20220112Repaso.models.Cliente;
import com.desafiolatam.f20220112Repaso.models.Tienda;
import com.desafiolatam.f20220112Repaso.models.Vendedor;

public class Main {

	public static void main(String[] args) {
		
		Tienda tienda = new Tienda();
		tienda.setStock(200);
		
		Cliente cliente = new Cliente();
		cliente.setEdad(47);
		cliente.imprimeCliente();
		
		ArrayList<Vendedor> listaVendedores= new ArrayList<Vendedor>();
		
		Vendedor vendedor = new Vendedor("Gabriela Neruda 987");
		Vendedor vendedor2= new Vendedor ("Jorge Martinez 345");
		Vendedor vendedor3= new Vendedor ("Mauricio Sandoval 254");
		
		listaVendedores.add(vendedor);
		listaVendedores.add(vendedor2);
		listaVendedores.add(vendedor3);
		
		
		
		tienda.setCliente(cliente);
		tienda.setVendedor(vendedor);
		
		System.out.println(tienda.toString());
		System.out.println("*************************************");
		
		
		Botella botella = new Botella ("vidrio","polar");
		
		Cerveza cerveza = new Cerveza (1500, botella);
		System.out.println(cerveza.toString());
		
		Botilleria botilleria = new Botilleria();
		
		
	}
}
