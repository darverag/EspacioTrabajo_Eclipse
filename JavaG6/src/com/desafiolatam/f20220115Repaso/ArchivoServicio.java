package com.desafiolatam.f20220115Repaso;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ArchivoServicio {
	
	public ArrayList<Producto> cargarDatos(){
		String archivo ="src/ProductosImportados.csv";
		ArrayList<Producto> productosARetornar = new ArrayList<Producto>();
		try {
			FileReader fr= new FileReader(archivo);
			BufferedReader br = new BufferedReader(fr);
			
			String lineaArchivo = br.readLine();
			//System.out.println(lineaArchivo);
			
			while(lineaArchivo!=null) {
				//System.out.println(lineaArchivo);
				
				String [] elementosProd = lineaArchivo.split(",");
				//String articulo, String precio, String descripcion, String codigo, String talla, String marca
			//	Producto productoTemp= new Producto(elementoProd[0],elementoProd[1],elementoProd[2]elementoProd[3]elementoProd[4],elementoProd[5],elementoProd[6]);
			//	productosARetornar.add(productoTemp);
			}
			fr.close();
			br.close();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		return productosARetornar;
	}

}
