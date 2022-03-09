package modelo;

public class Persona {

	//atributos
	protected String rut;
	protected String nombre;
	protected boolean presente;
	
	
	//constructores
	public Persona(String rut, String nombre, boolean presente) {
		super();
		this.rut = rut;
		this.nombre = nombre;
		this.presente = presente;
	}
	
	//getters&setters


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


	public boolean isPresente() {
		return presente;
	}


	public void setPresente(boolean presente) {
		this.presente = presente;
	}

	@Override
	public String toString() {
		return "Persona [rut=" + rut + ", nombre=" + nombre + ", presente=" + presente + "]";
	}
	
}
