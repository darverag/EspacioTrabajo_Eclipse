package com.indianaJeans;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ExportarTxt extends ExportadorTxt {

	@Override
	public void exportar(ArrayList<Producto> listaProductos) {
		Scanner sc = new Scanner(System.in);
		String path = "src/home/desafioLatam/";

		System.out.println("Exportar Datos");
		System.out.println("Ingrese la opcion 1 para exportar");
		int opcion = sc.nextInt();
		
		
		

		if (opcion == 1) {
			System.out.println("Exportar Datos");
			System.out.println("Ingresa la ruta en donde desea exportar el archivo clientes.txt");
			sc.nextLine();
			String ruta = sc.nextLine();
			

			File directorio = new File(path + ruta);
			// valida ruta
			if (!directorio.exists()) {
				directorio.mkdirs();
			}
			// crear el archivo
			try {
				File archivo = new File(directorio + "/clientes.txt");
				if (!archivo.exists()) {// archivo NO existe
					archivo.createNewFile();
				}
				FileWriter archivoWriter = new FileWriter(archivo);
				BufferedWriter archivoBuff = new BufferedWriter(archivoWriter);

				for (Producto producto : listaProductos) {
					String lineaProducto = producto.getArticulo() + ";\n" + 
										   producto.getCodigo() + ";\n"+
										   producto.getColor() + ";\n" + 
										   producto.getDescripcion() + ";\n" + 
										   producto.getMarca() + ";\n"+
										   producto.getPrecio() + ";\n" +
										   producto.getTalla() + ";\n";
					archivoBuff.write(lineaProducto);
					archivoBuff.newLine();
				}
				System.out.println("Datos de clientes exportados correctamente en formato.txt\n");
				archivoBuff.close();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
