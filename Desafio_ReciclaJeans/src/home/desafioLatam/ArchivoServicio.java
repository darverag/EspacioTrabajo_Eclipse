package home.desafioLatam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ArchivoServicio {

	public ArrayList<Producto> cargarDatos(Scanner sc) {
		
		System.out.println("Cargar Datos");
		System.out.println("Por favor ingrese la ruta en donde se encuentra el archivo\nConsidere todos los campos..Ej: src/home/desafioLatam/ProductosImportados.csv\n");
		String archivo = sc.nextLine();
		
		ArrayList<Producto> productosARetornar = new ArrayList<Producto>();
		
		try {
			FileReader fr = new FileReader(archivo);
			BufferedReader br = new BufferedReader(fr);

			String lineaArchivo = br.readLine();

			while (lineaArchivo != null) {
				String[] elementoProd = lineaArchivo.split(",");
								
				Producto productoTemp = new Producto(elementoProd[0], elementoProd[1], elementoProd[2], elementoProd[3],elementoProd[4], elementoProd[5], elementoProd[6]);
				productosARetornar.add(productoTemp);

				lineaArchivo = br.readLine();
			}
			br.close();

		} catch (FileNotFoundException fnfe) {
			System.out.println("Archivo NO encontrado");
		} catch (IOException ioe) {
			System.out.println("Error en el ingreso de la información");
		}
		System.out.println("\nLa base importada corresponde a: "+productosARetornar);
		System.out.println("Datos cargados correctamente en la lista!!\n\n");
		

		return productosARetornar;
	}

}
