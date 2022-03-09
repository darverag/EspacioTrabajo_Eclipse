package modelo;

import java.util.List;

public class Materia {
	
	//atributos
	private MateriaEnum nombre;
	private List<Double> notas;//Al usar una interface como List, permite instanciarla con ArrayList
	
	//constructores
	public Materia(MateriaEnum nombre, List<Double> notas) {
		super();
		this.nombre = nombre;
		this.notas = notas;
	}

	public Materia() {
		
	}

	//getters&setters
	public MateriaEnum getNombre() {
		return nombre;
	}


	public void setNombre(MateriaEnum nombre) {
		this.nombre = nombre;
	}


	public List<Double> getNotas() {
		return notas;
	}


	public void setNotas(List<Double> notas) {
		this.notas = notas;
	}

	
	//ToString
	@Override
	public String toString() {
		return "Materia [notas=" + notas + "]";
	}
	
	

}
