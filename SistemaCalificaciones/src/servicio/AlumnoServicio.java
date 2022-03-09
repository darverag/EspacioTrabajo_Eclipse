package servicio;

import java.util.List;
import java.util.Map;

import modelo.Alumno;
import modelo.Materia;

public interface AlumnoServicio {
	
	public void crearAlumno (Alumno alumno);
	
	public void agregarMateria( String rut, Materia materia);
	
	public List<Materia> materiasPorAlumno(String rut);
	
	public Map<String, Alumno> listarAlumnos();
	
	void setListaAlumnos (Map<String, Alumno>listaAlumnos);
	

}
