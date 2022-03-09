package com.desafiolatam;

public class App 
{
    public static void main( String[] args ) {
    	
    	Calculadora calculadora = new Calculadora();
    	
    	//Llamado a los metodos
    	calculadora.metodoRestar(4.5D, 1.5D);
    	calculadora.metodoSumar(4.5D, 2.3D);
    	calculadora.metodoMultiplicar(5D, 5D);
    	calculadora.metodoDividir(6D, 2D);
    	
    }
}
