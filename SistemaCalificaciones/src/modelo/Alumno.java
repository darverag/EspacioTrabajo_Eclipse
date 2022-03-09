package modelo;

import java.util.List;

public class Alumno {
	
	//atributos
	private String rut;
	private String nombre;
	private String apellido;
	private String direcci�n;
	private List <Materia> materia;
	
	//Constructores
	public Alumno(String rut, String nombre, String apellido, String direcci�n, List<Materia> materia) {
		super();
		this.rut = rut;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direcci�n = direcci�n;
		this.materia = materia;
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


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getDirecci�n() {
		return direcci�n;
	}


	public void setDirecci�n(String direcci�n) {
		this.direcci�n = direcci�n;
	}


	public List<Materia> getMateria() {
		return materia;
	}


	public void setMateria(List<Materia> materia) {
		this.materia = materia;
	}

	//ToString
	//En video solo se crearon getters y setters (No toStrign)
	@Override
	public String toString() {
		return "Alumno [rut=" + rut + ", nombre=" + nombre + ", apellido=" + apellido + ", direcci�n=" + direcci�n
				+ ", materia=" + materia + "]";
	}
	
	
	
	

}
