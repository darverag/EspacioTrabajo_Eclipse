package com.desafiolatam;

public class Pitagoras {
	
	public Integer obtenerHipotenusa(Integer a, Integer b) {
		Integer h =0;
		if (a !=null && b !=null) {
		   h = (int) Math.sqrt((a*a)+(b*b));
		   System.out.println("El valor de la hipotenusa es: "+h);
		}
		return h;
	}

}
