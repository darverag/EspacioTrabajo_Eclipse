package com.indianajeans.general;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.indianajeans.models.Producto;

public class ExportarTxt extends ExportadorTxt {

	@Override
	public void exportar(ArrayList<Producto> listaProductos) {
		Scanner sc = new Scanner(System.in);
		String path = "com/indianajeans/";

		System.out.println("Exporatar Datos");
		System.out.println("Ingrese la opcion 1 para exportar");
		int opcion = sc.nextInt();

		if (opcion == 1) {
			System.out.println("Exportar Datos");
			System.out.println("Ingresa la ruta en donde desea exportar el archivo clientes.txt:");
			String ruta = sc.nextLine();

			File directorio = new File(path + ruta);
			// validar ruta
			if (!directorio.exists()) {
				directorio.mkdirs();
			}
			// crear el archivo
			try {
				File archivo = new File(directorio + "/clientes.txt");
				if(!archivo.exists()) {
					archivo.createNewFile();
				}
				FileWriter archivoWriter = new FileWriter(archivo);
				BufferedWriter archivoBuff = new BufferedWriter(archivoWriter);
				//
				for (Producto producto : listaProductos) {
					String lineaProducto = producto.getArticulo()+";"+
										   producto.getCodigo()+";"+
										   producto.getColor()+";"+
										   producto.getDescripcion()+";"+
										   producto.getMarca()+";"+
										   producto.getPrecio()+";"+
										   producto.getTalla()+";";
					archivoBuff.write(lineaProducto);
					archivoBuff.newLine();
				}
				archivoBuff.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Datos de clientes exportados correctamente en formato.txt");
			sc.close();
		}
	}

}
