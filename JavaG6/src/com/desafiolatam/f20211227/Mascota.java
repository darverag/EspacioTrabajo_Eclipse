package com.desafiolatam.f20211227;

public class Mascota {
		
		public String nombre;
		public String color;
		public int edad;
		public String tamano;
		public boolean esSalvaje;
		
		public Mascota() {
			super();
		}
		
		public Mascota(String nombre, String color, int edad) {
			super();
			this.nombre = nombre;
			this.color = color;
			this.edad = edad;	
		}

		public Mascota(String nombre, String color, int edad, String tamano, boolean esSalvaje) {
			super();
			this.nombre = nombre;
			this.color = color;
			this.edad = edad;
			this.tamano = tamano;
			this.esSalvaje = esSalvaje;
			
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

		public String getTamano() {
			return tamano;
		}

		public void setTamano(String tamano) {
			this.tamano = tamano;
		}

		public boolean isEsSalvaje() {
			return esSalvaje;
		}

		public void setEsSalvaje(boolean esSalvaje) {
			this.esSalvaje = esSalvaje;
		}

		/*@Override
		public String toString() {
			return "Mascota [nombre=" + nombre + ",\n color=" + color + ", edad=" + edad + ",\n tamano=" + tamano
					+ ",\n esSalvaje=" + esSalvaje + "]";
		}*/
		
		public void comer() {
			System.out.println("El animal "+nombre+" está comiendo...");
		}
		
		
		
		
	}