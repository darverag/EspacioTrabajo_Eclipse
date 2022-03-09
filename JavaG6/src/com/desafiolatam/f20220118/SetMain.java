package com.desafiolatam.f20220118;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {

	public static void main(String[] args) {
	
		//HASHSET
		//Hashet es una lista NO ordenada, no se muestra según el orden de ingreso.
		//NO permite la duplicidad de datos, datos unicos.
		Set<String>alumnosHashSet = new HashSet<String>();
		alumnosHashSet.add("Jose Cabreras");
		alumnosHashSet.add("Patricia Vera");
		alumnosHashSet.add("Yerkarin Villegas");
		alumnosHashSet.add("Patricia Vera");//repetida
		alumnosHashSet.add("Kevin Araya");
		alumnosHashSet.add("Patricia Vera");//repetida
		alumnosHashSet.add("Dario Vera");
		
		System.out.println(alumnosHashSet);
		System.out.println();
		
		//LinkdHashSet
		//Lista mantiene orden de ingreso y no permite la duplicidad de datos
		Set<String>alumnosLHS = new LinkedHashSet<String>();
		alumnosLHS.add("Jose Cabreras");
		alumnosLHS.add("Patricia Vera");
		alumnosLHS.add("Yerkarin Villegas");
		alumnosLHS.add("Patricia Vera");//repetida
		alumnosLHS.add("Kevin Araya");
		alumnosLHS.add("Patricia Vera");//repetida
		alumnosLHS.add("Dario Vera");
		
		System.out.println(alumnosLHS);
		System.out.println();
		
		//TreeSet
		//Lista ordenada alfabeticamente y no permite la duplicidad de datos
		Set<String>alumnosTree = new TreeSet<String>();
		alumnosTree.add("Jose Cabreras");
		alumnosTree.add("Patricia Vera");
		alumnosTree.add("Yerkarin Villegas");
		alumnosTree.add("Patricia Vera");//repetida
		alumnosTree.add("Kevin Araya");
		alumnosTree.add("Patricia Vera");//repetida
		alumnosTree.add("Dario Vera");
				
		System.out.println(alumnosTree);
		System.out.println();
		
		System.out.println("--------------------------------");
		System.out.println("********************************");
		System.out.println("--------------------------------");
		
		Set<Alumno>alumHashSet = new HashSet<Alumno>();
		
		Alumno alumno0 = new Alumno("Jose","Cabreras");
		Alumno alumno1 = new Alumno("Patricia", "Veras");
		Alumno alumno2 = new Alumno("Yerkarin","Villegas");
		//Alumno alumno3 = new Alumno("Patricia", "Vera");
		Alumno alumno3 = new Alumno ("Kevin","Araya");
		//Alumno alumno5 = new Alumno ("Patricia","Vera");
		Alumno alumno4 = new Alumno ("Dario","Vera");
		
		alumHashSet.add(alumno0);
		alumHashSet.add(alumno1);
		alumHashSet.add(alumno2);
		alumHashSet.add(alumno1);
		alumHashSet.add(alumno3);
		alumHashSet.add(alumno1);
		alumHashSet.add(alumno4);
		
		
		System.out.println(alumHashSet);
		System.out.println();
		
		
		Set<Alumno>alumLHS = new LinkedHashSet<Alumno>();
			
		alumLHS.add(alumno0);
		alumLHS.add(alumno1);
		alumLHS.add(alumno2);
		alumLHS.add(alumno1);
		alumLHS.add(alumno3);
		alumLHS.add(alumno1);
		alumLHS.add(alumno4);
		
		System.out.println(alumLHS);
		System.out.println();
		
		Set<Alumno>alumTree = new TreeSet<Alumno>();
		
		alumTree.add(alumno0);
		alumTree.add(alumno1);
		alumTree.add(alumno2);
		alumTree.add(alumno1);
		alumTree.add(alumno3);
		alumTree.add(alumno1);
		alumTree.add(alumno4);
		
		System.out.println(alumTree);
		System.out.println();
		
		
	}

}
