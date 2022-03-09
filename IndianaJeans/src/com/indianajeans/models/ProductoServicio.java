package com.indianajeans.models;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductoServicio {

	private ArrayList<Producto> listaProductos;

	public ProductoServicio() {
		super();
	}

	public ProductoServicio(ArrayList<Producto> listaProductos) {
		super();
		this.listaProductos = listaProductos;
	}

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
			System.out.println("Datos del Producto:");
			System.out.println("Nombre articulo: " + producto.getArticulo());
			System.out.println("Código: " + producto.getCodigo());
			System.out.println("Marca: " + producto.getMarca());
			System.out.println("Color:" + producto.getColor());
			System.out.println("Descripción: " + producto.getDescripcion());
			System.out.println("Precio: " + producto.getPrecio());
			System.out.println("Talla: " + producto.getTalla());

		}
}

	public void agregarProductos() {
		Scanner sc = new Scanner(System.in);

		// captura de informacion
		System.out.println("Crear Producto");
		System.out.println("Ingresar nombre articulo: ");
		String articulo = sc.nextLine();
		System.out.println("Ingresa precio:");
		String precio = sc.nextLine();
		System.out.println("Ingresa descripción:");
		String descripcion = sc.nextLine();
		System.out.println("Ingresa código:");
		String codigo = sc.nextLine();
		System.out.println("Ingresa talla:");
		String talla = sc.nextLine();
		System.out.println("Ingresa marca:");
		String marca = sc.nextLine();
		System.out.println("Ingresa color:");
		String color = sc.nextLine();

		// se realiza instancia objeto producto
		Producto producto = new Producto();
		// se agregan datos
		producto.setArticulo(articulo);
		producto.setPrecio(precio);
		producto.setDescripcion(descripcion);
		producto.setCodigo(codigo);
		producto.setTalla(talla);
		producto.setMarca(marca);
		producto.setColor(color);

		listaProductos.add(producto);// se recien aquí se agregan productos a la lista
		sc.close();
	}
}
