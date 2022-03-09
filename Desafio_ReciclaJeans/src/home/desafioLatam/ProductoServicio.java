package home.desafioLatam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ProductoServicio {

	// atributos
	private ArrayList<Producto> listaProductos;

	// constructores

	public ProductoServicio() {
		super();
		listaProductos = new ArrayList<Producto>();
	}

	public ProductoServicio(ArrayList<Producto> listaProductos) {
		super();
		listaProductos = new ArrayList<Producto>();
	}

	// getters&setters
	public ArrayList<Producto> getProductos() {
		return listaProductos;
	}

	public void setListaProductos(ArrayList<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}

	@Override
	public String toString() {
		return "ProductoServicio [listaProductos=" + listaProductos + "]";
	}

	public void listarProductos(Scanner sc) {

		for (Producto producto : listaProductos) {
			System.out.println("Datos del producto: \n");
			System.out.println("Nombre articulo: " + producto.getArticulo());
			System.out.println("Código: " + producto.getCodigo());
			System.out.println("Marca: " + producto.getMarca());
			System.out.println("Color: " + producto.getColor());
			System.out.println("Descripción: " + producto.getDescripcion());
			System.out.println("Precio: " + producto.getPrecio());
			System.out.println("Talla: " + producto.getTalla());
			System.out.println("-----------------------------------------");

		}
	}

	public void editarDatos(Scanner sc) {

		System.out.println("\nEditar Producto");
		System.out.println("Ingrese el número 1 para editar los datos ingresados del Producto");
		int opcion = sc.nextInt();
		sc.nextLine();

		if (opcion == 1) {
			System.out.println("Ingrese código del producto a modificar");// Falta traer el codigo del producto llamado,
			String codigoEditar = sc.nextLine(); 

			for (Iterator iterator = listaProductos.iterator(); iterator.hasNext();) {
				Producto productoAModificar = (Producto) iterator.next();
				if (productoAModificar.getCodigo().equals(codigoEditar)) {

					System.out.println("------------------------------");
					System.out.println("1.- El nombre del articulo actual es: " + productoAModificar.getArticulo());
					System.out.println("2.- El código del producto es: " + productoAModificar.getCodigo());
					System.out.println("3.- El color del producto:" + productoAModificar.getColor());
					System.out.println("4.- La descripción del producto: " + productoAModificar.getDescripcion());
					System.out.println("5.- La marca del producto:" + productoAModificar.getMarca());
					System.out.println("6.- El precio del producto: " + productoAModificar.getPrecio());
					System.out.println("7.- La talla del producto: " + productoAModificar.getTalla());
					System.out.println("------------------------------");

					System.out.println("Ingrese la opción a editar de los datos del producto");// falta traer la opcion escogida a modificar
																								
					int opcionEditar = sc.nextInt();
					sc.nextLine();
					

					switch (opcionEditar) {
					case 1:
						System.out.println("Ingrese el nuevo nombre del producto");
						String nuevoarticulo = sc.nextLine();
						productoAModificar.setArticulo(nuevoarticulo);
						System.out.println("---------------------------------------------------");
						System.out.println("El cambio de nombre fue realizado correctamente!!");
						System.out.println("---------------------------------------------------");
						break;
					case 2:
						System.out.println("Ingrese el nuevo código del producto");
						String nuevoCodigo = sc.nextLine();
						productoAModificar.setCodigo(nuevoCodigo);
						System.out.println("---------------------------------------------------");
						System.out.println("El cambio de código fue realizado correctamente!!");
						System.out.println("---------------------------------------------------");
						break;
					case 3:
						System.out.println("Ingrese el nuevo color del producto");
						String nuevoColor = sc.nextLine();
						productoAModificar.setColor(nuevoColor);
						System.out.println("---------------------------------------------------");
						System.out.println("El cambio de color fue realizado correctamente!!");
						System.out.println("---------------------------------------------------");
						break;
					case 4:
						System.out.println("Ingrese la nueva descripción del producto\n");
						String nuevaDescripcion = sc.nextLine();
						productoAModificar.setDescripcion(nuevaDescripcion);
						System.out.println("---------------------------------------------------");
						System.out.println("El cambio de descripción fue realizado correctamente!!");
						System.out.println("---------------------------------------------------");
						break;
					case 5:
						System.out.println("Ingrese la nueva marca del producto");
						String nuevaMarca = sc.nextLine();
						productoAModificar.setMarca(nuevaMarca);
						System.out.println("---------------------------------------------------");
						System.out.println("El cambio de marca fue realizado correctamente!!");
						System.out.println("---------------------------------------------------");
						break;
					case 6:
						System.out.println("Ingrese el nuevo precio del producto");
						String nuevoPrecio = sc.nextLine();
						productoAModificar.setPrecio(nuevoPrecio);
						System.out.println("---------------------------------------------------");
						System.out.println("El cambio de precio fue realizado correctamente!!");
						System.out.println("---------------------------------------------------");
						break;
					case 7:
						System.out.println("Ingrese la nueva talla del producto");
						String nuevaTalla = sc.nextLine();
						productoAModificar.setTalla(nuevaTalla);
						System.out.println("---------------------------------------------------");
						System.out.println("El cambio de talla fue realizado correctamente!!");
						System.out.println("--------------------------------------------------");
						break;

					default:
						break;

					}

				}

			}
		}

	}
}
