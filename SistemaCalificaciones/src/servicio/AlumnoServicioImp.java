package servicio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import modelo.Alumno;
import modelo.Materia;

public class AlumnoServicioImp implements AlumnoServicio {
	//coleccion de alumno
	private Map<String, Alumno> listaAlumnos = new HashMap<>();

	public void setListaAlumnos(Map<String, Alumno> listaAlumnos) {
		this.listaAlumnos = listaAlumnos;
	}
	
	@Override
	public void crearAlumno(Alumno alumno) {
		if(alumno !=null) { //Se verifica si alumno no existe o es nulo, de no existir se agrega
			listaAlumnos.put(alumno.getRut(), alumno); //Se entrega como clave por parametro, el rut del alumno y como valor al alumno.
		}

	}

	@Override
	public void agregarMateria(String rut, Materia materia) {
		if(listaAlumnos.containsKey(rut)) {//Se verifica si existe el alumno, si la clave (rut del alumno) esta contenida en lista, si existe !!
			Alumno alumno = listaAlumnos.get(rut);//Si existe alumno, se recupera y se revisa si tiene materias asociadas.
			
			if (alumno.getMateria() !=null) {//Con esta condicion vemos si tiene materia
				Materia mat = alumno.getMateria().stream().filter(m -> m.getNombre().equals(materia.getNombre())).findAny().orElse(null);
				//materia mat tendrá el valor solo si existe en la lista de materia filtrada, de lo contrario tendrá valor null.
				
				if(mat ==null) { //Si materia (mat) es igual a null, significa que no existe y la podemos agregar. De lo contrario si existe 
					//se entrega mensaje indicando que alumno ya tiene esta materia.
					alumno.getMateria().add(materia);
					System.out.println("La materia ha sido agregada");
				}else {
					System.out.println("Este alumno ya contiene esta materia");
				}	
			}else {//Si alumno no tierne materias asociadas
				List<Materia> materias = new ArrayList<Materia>(); //Se crea nuevo listado de materia en donde se agrega la no existente
				materias.add(materia);
				alumno.setMateria(materias);//se le setea al alumno la materia agregada.
				System.out.println("Materia agregada");
			}	
				
		}else { //De lo contrario alumno no existe, se envia mensaje
			System.out.println("El alumno no existe");
		}
	}

	@Override
	public List<Materia> materiasPorAlumno(String rut) { //Se recibe por parametro el rut del alumno, esto retorna con un alista de materias
		List<Materia> materias = new ArrayList<Materia>();
		
		if(listaAlumnos.containsKey(rut)) {// se verifica si en listado de alumnos  existe el alumno en cuestión. Si alumno existe se obtiene de la listaalumno con el rut.
			Alumno alumno = listaAlumnos.get(rut);//se obtiene a alumno de la lista alumno con el rut
			if(alumno.getMateria() !=null){ //Y se verifica que tenga efectivamente a materias , distinto de null que contenga valores.
				materias = alumno.getMateria(); //Se le entrega a la variable materias, las materias que tenga asignada el alumnos
			}
		}
		return materias;//no se retorna null, se retorna una lista de materias vacía, en el caso que el alumno no tenga materias asociadas.
	}

	@Override
	public Map<String, Alumno> listarAlumnos() {//Este metodo esta retornando con un mapa, que tiene como clave un string y como valor un alumno. Que corresponde al atributo lista de alumnos.
				return listaAlumnos; //De esta forma directamente se retorna con una lista de alumnos.
	}

	
	

}
