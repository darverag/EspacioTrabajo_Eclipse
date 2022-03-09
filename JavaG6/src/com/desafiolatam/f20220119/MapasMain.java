package com.desafiolatam.f20220119;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapasMain {

	public static void main(String[] args) {
		//Map
		//Map<Clave,valor>
		//Si es la misma clave y el mismo valor persiste 1
		//Si es misma clave y distinto valor persiste el último que se ingresó
		Map<Integer, String> nombresAlumnos = new HashMap<Integer, String>();
		//Agregar (put)
		nombresAlumnos.put(11, "Edinson");
		nombresAlumnos.put(2, "Jaime");
		nombresAlumnos.put(32, "Jose");
		nombresAlumnos.put(46, "Monica");
		nombresAlumnos.put(5, "Dario");
		nombresAlumnos.put(65, "Hector");
		nombresAlumnos.put(71, "Isabel");
		nombresAlumnos.put(18, "Israel");
		nombresAlumnos.put(29, "Kevin");
		nombresAlumnos.put(10, "Nelson");
		nombresAlumnos.put(111, "Patricia");
		nombresAlumnos.put(120, "Yerkarin");
		nombresAlumnos.put(133, "Osvaldo");//Ausente
		nombresAlumnos.put(18, "Alexis");
		
		System.out.println(nombresAlumnos);
		
		
		System.out.println(nombresAlumnos.size());//tamaño o elementos del arreglo
		System.out.println(nombresAlumnos.get(65));//buscar valor por clave, si no existe null
		System.out.println(nombresAlumnos.remove(23));
		System.out.println(nombresAlumnos);
		System.out.println(nombresAlumnos.containsKey(71));//valida si existe esa clave
		System.out.println(nombresAlumnos.containsValue("Osvaldo"));
		System.out.println(nombresAlumnos.values());//retorna una collection
		System.out.println();
		//recorrer un map
		
		Iterator iterator = nombresAlumnos.keySet().iterator();
		while(iterator.hasNext()) {
			Integer clave = (Integer) iterator.next();
			System.out.println("La clave :"+clave+" - El valor: "+nombresAlumnos.get(clave));
			String valor = nombresAlumnos.get(clave);
			if(valor.equalsIgnoreCase("Dario")) {
				System.out.println("Dato encontrado");
			}
		
		}
		System.out.println();
		for (Iterator iterator2 = nombresAlumnos.keySet().iterator(); iterator2.hasNext();) {
			Integer clave = (Integer) iterator2.next();
			System.out.println("La clave :"+clave+" - El valor: "+nombresAlumnos.get(clave));
			String valor = nombresAlumnos.get(clave);
			if(valor.equalsIgnoreCase("Nelson")) {
				System.out.println("Dato encontrado");
			}
		}
		
		
	}

}
