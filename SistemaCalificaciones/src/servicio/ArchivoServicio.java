package servicio;

import java.util.Map;

import modelo.Alumno;

public interface ArchivoServicio {
	
	Map<String, Alumno> cargarDatos (String ruta);
	
	void exportarDatos (Map<String, Alumno> alumnos, String ruta);

}
