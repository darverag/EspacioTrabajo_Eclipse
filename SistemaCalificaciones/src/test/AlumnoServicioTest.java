package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import modelo.Alumno;
import modelo.Materia;
import modelo.MateriaEnum;
import servicio.AlumnoServicioImp;


public class AlumnoServicioTest {

	private AlumnoServicioImp servicio;
	private Alumno alumno;

	@BeforeEach
	void setup() {
		servicio = new AlumnoServicioImp();
		alumno = new Alumno("1", "Juan", "Ayala", "calle falsa 123", null);

	}

	@Test
	public void crearAlumno() {
		// Given (Dados estos valores)
		Alumno alumno = new Alumno("1", "Juan", "Ayala", "calle falsa 123", null);
		// When (Cuando haga una acción)
		servicio.crearAlumno(alumno);
		// Then (Esperamos como resultado)
		Assertions.assertNotNull(servicio.listarAlumnos().get(alumno.getRut()));
	}

	@Test
	public void crearAlumno_null() {
		// Given (Dados estos valores)
		Alumno alumno = null;
		// When (Cuando haga una acción)
		servicio.crearAlumno(alumno);
		// Then (Esperamos como resultado)
		Assertions.assertEquals(servicio.listarAlumnos().size(), 0);
	}
	
	@Test
	public void crearMateria() {
		//Given
		String rut = alumno.getRut();
		Materia materia = new Materia();
		materia.setNombre(MateriaEnum.CIENCIA);
		servicio.crearAlumno(alumno);
		
		//when
		servicio.agregarMateria(rut, materia);
		//Then
		Alumno resultado = servicio.listarAlumnos().get(rut);
		Assertions.assertEquals(1, resultado.getMateria().size());
	}
	
	

}
