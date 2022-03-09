package com.desafiolatam.f20220115Repaso;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductoServicio {
	Scanner sc = new Scanner(System.in);

	// atributos
	private ArrayList<Producto> listaProductos = new ArrayList<Producto>();

	// constructores

	public ProductoServicio() {
		super();
	}

	public ProductoServicio(ArrayList<Producto> listaProductos) {
		super();
		this.listaProductos = listaProductos;
	}

	// getters&setters
	public ArrayList<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(ArrayList<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}

	@Override
	public String toString() {
		return "ProductoServicio [listaProductos=" + listaProductos + "]";
	}

	public void listarProductos() {
		for (Producto producto : listaProductos) {

			System.out.println("----------------------------------");
			System.out.println("Datos del producto: ");
			System.out.println("Nombre articulo: " + producto.getArticulo());
			System.out.println("Código: " + producto.getCodigo());
			System.out.println("Marca: " + producto.getMarca());
			System.out.println("Color: " + producto.getColor());
			System.out.println("Descripción: " + producto.getDescripcion());
			System.out.println("Precio: " + producto.getPrecio());
			System.out.println("Talla: " + producto.getTalla());
			System.out.println("----------------------------------");

		}

	}

	public void agregarProductos() {
		Producto productoIngresado = new Producto();

		/*int numero = 0;
		do {*/
			System.out.println("Crear Producto");
			System.out.println("-------------------------------------");
			System.out.println("Ingresar nombre del articulo: ");
			productoIngresado.setArticulo(sc.nextLine());
			System.out.println("Ingresar precio: ");
			productoIngresado.setPrecio(sc.nextLine());
			System.out.println("Ingresar descripcion: ");
			productoIngresado.setDescripcion(sc.nextLine());
			System.out.println("Ingresar código: ");
			productoIngresado.setCodigo(sc.nextLine());
			System.out.println("Ingresar talla: ");
			productoIngresado.setTalla(sc.nextLine());
			System.out.println("Ingresar marca: ");
			productoIngresado.setMarca(sc.nextLine());
			System.out.println("Ingresar color: ");
			productoIngresado.setColor(sc.nextLine());
			System.out.println();
			System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");
			
			listaProductos.add(productoIngresado);
			System.out.println("Los productos ingresados son: \n" + listaProductos);
			System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");
			sc.nextLine();
			
						
		/*	System.out.println("¿Quiere agregar otro producto?\n");
			System.out.println("** (0)NO - (1) SI **");
			numero = sc.nextInt();
			sc.nextLine();

		} while (numero == 1);
		System.out.println("Sus productos fueron " + listaProductos);

		if (numero == 0) {
			System.out.println("Volviendo a Menú\n");
			
		}*/
	}
}
