package com.desafioMirandoElPasado;

import java.util.Iterator;
import java.util.Map;
import java.util.Spliterator;
import java.util.TreeMap;

public class Ejercicio3_Golosinas {

	public static void main(String[] args) {

		// 1.- INSTANCIAR UN map<> TIPO STRING -INTEGER LLAMADO "golosinas" CON
		// TreeMap()

		Map<String, Integer> golosinas = new TreeMap<String, Integer>();

		// 2.- AGREGAR LAS SGTES "golsinas". Chocman $100 pesos - Trululú $100 pesos -
		// Centella $100 pesos- Kilate $50 pesos- Miti-miti $30 pesos
		// Traga Traga $150 pesos - Tabletón $5 pesos.

		golosinas.put("Chocman", 100);
		golosinas.put("Trululú", 100);
		golosinas.put("\nCentella", 100);
		golosinas.put("Kilate", 50);
		golosinas.put("Miti-miti", 30);
		golosinas.put("Traga Traga", 150);
		golosinas.put("Tabletón", 5);

		System.out.println("\nListado de golosinas: "+golosinas);
		System.out.println("**********************************************************************************************");

		// 3.- FILTRAR GOLOSINAS CON VALOR MENOR A $100 PESOS E IMPRIMIR POR PANTALLA EL
		// RESULTADO

		System.out.println("\n****Con Entry ****\n");
		System.out.println("Las golosinas con precio menor a $100 pesos son: ");
		golosinas.entrySet().stream().filter(precio -> precio.getValue() < 100).forEach(System.out::print);
		System.out.println("\n");
				
		
		System.out.println("*****Con Iterator*****");
		Iterator iterator = golosinas.keySet().iterator();
		while(iterator.hasNext()) {
			String valor = (String) iterator.next();
			Integer clave = golosinas.get(valor);
			if(clave < 100) {
				System.out.println("Golosinas menor a 100 pesos son: "+valor+"$ "+clave);
			}
		}
	}
}
