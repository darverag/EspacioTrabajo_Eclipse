package com.desafiolatam.f20220115Repaso;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArchivoServicio archivoServicio = new ArchivoServicio();
        ProductoServicio productoServicio = new ProductoServicio();
        
        productoServicio.setListaProductos(archivoServicio.cargarDatos());
        
        productoServicio.listarProductos();
        
	}

}
