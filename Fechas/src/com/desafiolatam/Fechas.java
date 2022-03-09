package com.desafiolatam;

import java.util.Scanner;

public class Fechas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Ingrese Fecha 1 DD/MM/AAAA");
		String fecha1= sc.nextLine();
		//System.out.println(fecha1.substring(0, 2));
		//System.out.println(fecha1.substring(3, 5));
		//System.out.println(fecha1.substring(6));
		int dia1= Integer.parseInt(fecha1.substring(0, 2));
		int mes1= Integer.parseInt(fecha1.substring(3, 5));
		int año1= Integer.parseInt(fecha1.substring(6));
			
		
		System.out.println("Ingrese fecha 2 DD/MM/AAAA");
		String fecha2= sc.nextLine();
		//System.out.println(fecha2.substring(0, 2));
		//System.out.println(fecha2.substring(3, 5));
		//System.out.println(fecha2.substring(6));		
		int dia2=Integer.parseInt(fecha2.substring(0, 2));;
		int mes2=Integer.parseInt(fecha2.substring(3, 5));;
		int año2=Integer.parseInt(fecha2.substring(6));
		
		if (año1>año2) {
			System.out.println("Persona 2 es mayor");
		}else if(año1<año2) {
			System.out.println("Persona 1 es mayor");
		}else {
			if(mes1 >mes2) {
				System.out.println("Persona 2 es mayor");
			}else if(mes1<mes2) {
				System.out.println("Persona 1 es mayor");
		}else {
			if(dia1 >dia2) {
				System.out.println("Persona 2 es mayor");
			}else if(dia1<dia2) {
				System.out.println("Persona 1 es mayor");
		}else {
			System.out.println("Tienen la misma edad");
	 }	
	}
   }
 }
}


