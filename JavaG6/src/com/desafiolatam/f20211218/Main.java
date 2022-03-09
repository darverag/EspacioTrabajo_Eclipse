package com.desafiolatam.f20211218;

import java.util.Scanner;

import com.desafiolatam.f20211218.models.Cargador;
import com.desafiolatam.f20211218.models.Celular;
import com.desafiolatam.f20211218.models.SmarthPhone;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);//Objeto sc de tipo Scanner.
		//instancia de la clase Celular
		Celular/*tipo Celular*/ celular /*Objeto*/= new Celular();
		//asignacion de valores (SETTERS)/*Atributos del objeto*/
		celular.setColor("Gris");
		celular.setMarca("Nokia");
		celular.setModelo("520");
		//obtener los valores de los atributos (GETTERS)
		//cuando un metodo nos devueve un valor, en este caso String hay que imprimirlo para poder verlo 
		System.out.println("Color celular: " +celular.getColor());
		System.out.println("Marca celular: " +celular.getMarca());
		System.out.println("Modelo celular: " +celular.getModelo());
		//La información se valida "Los datos ingresados con los que se muestran", mediante toString, este tambien se llama mediante un SYSO.
		
		System.out.println(celular.toString());
		celular.llamar("Donato");// En este caso no se ingresa en SYSO ya que se llama directo desde el metodo, y ya tenemos ingresado un SYSO.
		
		
		System.out.println("*************************");
		//instancia de la Clase celular
		Celular cellphone=new Celular("Alcatel","x123","Naranjo");//En el caso de ser datos String hay que tener cuidado de ingresarlo en el orden correspondiente según metodo.
		System.out.println(cellphone.toString());
		//si nos equivocamos en algo, se puede modificar. ejemplo"modelo"
		cellphone.setModelo("123x");
		
		
		System.out.println("************************");
		
		System.out.println("Ingrese color celular");
		String color=sc.nextLine();
		System.out.println("Ingrese marca celular");
		String marca=sc.nextLine();
		System.out.println("Ingrese modelo celular");
		String modelo=sc.nextLine();
		
		Celular phone = new Celular (marca, modelo, color);//Aqui se debe ingresar en el orden correspondiente.
		System.out.println("Usuario "+phone.toString());
		System.out.println("********************************");
		
		//instancia de clase con objeto colaborador
		
		Celular cellColaboracion = new Celular ("Xiaomi","1245","Azul",null);
		System.out.println(cellColaboracion.toString());
		

		Cargador cargador = new Cargador ();
		cellColaboracion.setCargador(cargador);
		
		//null.setPotencia("123");
		//null.setTipoConector("c");
		
		cellColaboracion.getCargador().setPotencia("124");
		cellColaboracion.getCargador().setTipoConector("AA");
		
		System.out.println(cellColaboracion.toString());
		
	
		//instancia clase hijo Smarthphone
		SmarthPhone smarthPhone=new SmarthPhone();
		//asignar valores a los atributos
		smarthPhone.setColor("Rojo");
		smarthPhone.setModelo("Chino");
//smarthPhone.setCargador(cargador);
		smarthPhone.setCamaraPixeles(16.0f);
		smarthPhone.setTarjetamemoriaTamanio(32.0f);
		
		System.out.println("");

   }
}
