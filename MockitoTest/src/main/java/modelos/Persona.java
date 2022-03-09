package modelos;

public class Persona {
	//atributos
	private String rut;
	private String nombre;
	
	//constructores
	public Persona() {
		super();
	}
	public Persona(String rut, String nombre) {
		super();
		this.rut = rut;
		this.nombre = nombre;
	}
	
	//getters&&setters
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//ToString
	@Override
	public String toString() {
		return "Persona [rut=" + rut + ", nombre=" + nombre + "]";
	}
	
	

}
