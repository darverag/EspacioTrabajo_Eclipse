package com.desafiolatam.f20211222;

public class MainCalculos {

	public static void main(String[] args) {

     saludo(); //llamado a un metodo
    Integer resultadoSuma = suma(400,777);//Esto es un llamado al metodo, aqui queda el resultado guardado.
	//para visualizarlo se debe crear una variable que nos permita visualizar e imprimirla. Antes era suma(400,777);
	System.out.println("El resultado en el main es "+resultadoSuma);
	
	
	}
	
	

  //metodo saludo , no recibe parametro y no retorna nada (void)
	public  static void saludo() {
		System.out.println("** Sistema de calculos de notas**");
		
	}
	
	//metodo suma, reciba 2 parametros, retorna un parametro de tipo Integer
	public static Integer suma (Integer numero1, Integer numero2) {
		//Antes del resultado se pueden hacer otras operaciones, condicionales, etc
		System.out.println("en el metodo suma "+(numero1+numero2));
		//Aqui se imprime el calculo de la suma dentro del mismo metodo, sin traspasar datos.
		
		
		return numero1+numero2;//Esto retorna el valor
   }
}

