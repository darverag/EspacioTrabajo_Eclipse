package com.desafiolatam;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;

public class LibroVenta {

	// atributos

	private String nombreVenta;
	private String fechaVenta;

	// constructores
	public LibroVenta() {
		super();
	}

	public LibroVenta(String nombreVenta, String fechaVenta) {
		super();
		this.nombreVenta = nombreVenta;
		this.fechaVenta = fechaVenta;
	}

	// getters&setters

	public String getNombreVenta() {
		return nombreVenta;
	}

	public void setNombreVenta(String nombreVenta) {
		this.nombreVenta = nombreVenta;
	}

	public String getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(String fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	// ToString

	@Override
	public String toString() {
		return "LibroVenta [nombreVenta=" + nombreVenta + ", fechaVenta=" + fechaVenta + "]";
	}

	// metodo guardarVenta

	public void guardarVenta(Cliente clienteA, Vehiculo vehiculoA) {
		// crear directorio
		File carpeta = new File("src/com/desafiolatam/manejoExcepciones/ficheros");
		{
			File archivo = new File("src/com/desafiolatam/manejoExcepciones/ficheros/nombreVenta.txt");

			if (!carpeta.exists()) {
				System.out.println("Carpeta fichero no existe");
				if (carpeta.mkdirs()) {
					System.out.println("Carpeta fichero creado");
					try {
						if (archivo.createNewFile()) {
							System.out.println("Archivo nombreVenta creado");
						} else {
							System.out.println("Archivo nombreVenta NO pudo ser creado");
						}

					} catch (IOException ioe) {
						System.out.println("Excepcion: " + ioe);
					} catch (Exception e) {
						System.out.println("Excepcion: " + e);
					}

				} else {
					System.out.println("Error al crear carpeta fichero");
				}
			} else {
				System.out.println("Carpeta fichero ya esta creado");
			}
			System.out.println();

			
			
			// validacion de ingreso datos patenteVehiculo

			String patenteVehiculo = vehiculoA.getPatente();

			try {
				if (patenteVehiculo.length() == 6 && !patenteVehiculo.contains(" ")) {
					System.out.println("Patente ingresada corresponde a " + patenteVehiculo);
				} else {
					System.out.println("Patente ingresada "+ patenteVehiculo);
					System.out.println("Patente ingresada NO es valida, no cumple con número de caracteres solicitados");
				}
			} catch (NullPointerException npe) {
				System.out.println("Patente no puede ser nula " + npe);
				patenteVehiculo = "BBBBBB";
			}
			System.out.println("****************************************************");

			
			// validacion de ingreso datos edadCliente
			int edadCliente = clienteA.getEdad();
			try {
				if (edadCliente >= 18 && edadCliente <= 120) {
					System.out.println("Edad de cliente ingresada: " + edadCliente + " años");
				} else {
					System.out.println("Edad ingresada no válida, menor de edad o fuera de rango");
					System.out.println("Solo valido ingreso de números, sin espacios");
				}
			} catch (Exception e) {
				System.out.println("Error en la información ingresada, favor revisar");
			}
			System.out.println("****************************************************");

			
			// validacion de ingreso datos fechaVenta
			try {
				if (fechaVenta.length() == 8) {
					int fechaIngresada = Integer.parseInt(fechaVenta);
					System.out.println("La fecha ingresada corresponde a " + fechaIngresada);
					System.out.println("Fecha ingresada cumple con formato");
				} else {
					System.out.println("Fecha ingresada no válida, formato correcto a ingresar DDMMAAAA");
				}
			} catch (NumberFormatException nfe) {
				System.out.println("Ingrese solo números en fecha");
				fechaVenta = "25122022";
			}catch (InputMismatchException ime) {
				System.out.println("Ingreso de datos incorrecto!!");
				System.out.println(ime.getMessage());
				fechaVenta ="33334444";
			}catch (Exception e) {
				System.out.println("Error de ingreso en la información");
			}
			System.out.println("****************************************************");
			
			// Guardar información de venta en archivo nombreVenta

			try {
				FileWriter FW = new FileWriter(archivo);
				BufferedWriter BW = new BufferedWriter(FW);

				// Escritura del archivo: patente del vehÃ­culo, la edad del cliente, la fecha
				// de venta y el nombre de la venta
				BW.write("Patente del vehiculo: " + patenteVehiculo);
				BW.newLine();
				BW.write("Edad del cliente es " + edadCliente);
				BW.newLine();
				BW.write("Fecha de venta: " + Integer.parseInt(fechaVenta));
				BW.newLine();
				BW.write("El tipo de venta es " + nombreVenta);
				BW.close();
			} catch (IOException ioe) {
				System.out.println("Excepcion: " + ioe);
			}

		}

	}
}
