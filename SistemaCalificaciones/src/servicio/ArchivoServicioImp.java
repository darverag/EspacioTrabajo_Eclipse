package servicio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import modelo.Alumno;
import modelo.Materia;
import modelo.MateriaEnum;

public class ArchivoServicioImp implements ArchivoServicio {

	PromedioServicio promedioServicio= new PromedioServicio();
	
	/* rut pos 0,  nom pos1,  mat pos2,   nota pos3
	   *18.546.232-1,Pepe,MATEMATICAS,1.3
	   *18.546.232-1,Pepe,MATEMATICAS,4.4
       *18.546.232-1,Pepe,MATEMATICAS,5.6
       *18.546.232-1,Pepe,LENGUAJE,2.3
       *18.546.232-1,Pepe,LENGUAJE,4.4
       *18.546.232-1,Pepe,MATEMATICAS,6.4
       *
       *17.423.112-4,Samuel,MATEMATICAS,1.4
       *17.423.112-4,Samuel,MATEMATICAS,4.2
       *17.423.112-4,Samuel,MATEMATICAS,6.5
       *17.423.112-4,Samuel,MATEMATICAS,1.2
       *17.423.112-4,Samuel,MATEMATICAS,4.1
       *17.423.112-4,Samuel,MATEMATICAS,7.0

	 */
	@Override
	public Map<String, Alumno> cargarDatos(String ruta) {
		Map<String, Alumno>alumnos = new HashMap<String, Alumno>();
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(ruta+ "notas.csv"));
			
			String lineas;//se crea variable linea
			while(( lineas = reader.readLine()) != null){//se hace un ciclo que mientras se pueda leer desde el reader, y que esta linea que se esta leyendo no sea nula ocurrirá un error (catch)
				String [] datosAlumno = lineas.split(",");// Aquí se dividen las lineas por coma
				String rut = datosAlumno[0];//En su primera posicion de podrá obtener el rut
				if(alumnos.containsKey(rut)) {//se pregunta si existe el rut, si es que alumno esta creado
					
					Alumno alumno = alumnos.get(rut);
					List<Materia>materias = alumno.getMateria();
					
					Materia materia = obtenerMateria(datosAlumno[2]);
					
					//variable -> acción, aqui se busca la primera coincidencia en la busqueda de la materia, si no existe arrja un null
					Materia materiaPorAgregar = materias.stream().filter(m -> m.getNombre().equals(materia.getNombre())).findFirst().orElse(null);
					
					if(materiaPorAgregar !=null) {//ya existe materia, solo se agrega l anota
						materiaPorAgregar.getNotas().add(Double.valueOf(datosAlumno[3]));
					}else {// es una materia nueva
						List<Double> notas =  new ArrayList<Double>();//si es materia nueva se crea lista de notas y se agregan
						notas.add(Double.valueOf(datosAlumno[3])); //Se agrega la nota
						materia.setNotas(notas);//Se agrega nota a la materia que no existe
						
						materias.add(materia);
						
					}
					
				}else {//Alumno no ha sido creado
					List<Materia> materias = new ArrayList<Materia>();//si no existe alumno se declara lista de materia para obtener de los datos del alumno la materia asociada.
				
					Materia mat = obtenerMateria(datosAlumno[2]);//metodo auxiliar crearListaNotas, este permite obtener una materia en base a un string
					
					List<Double>notas = crearListaNotas(Double.valueOf(datosAlumno[3])); //metodo auxiliar crearListaNotas en base a una de las notas
					mat.setNotas(notas);
					
					materias.add(mat);
					
					Alumno alumno = new Alumno (rut, datosAlumno[1], "", "", materias);
					alumnos.put(rut, alumno);
				
				}
			}
			reader.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();//Error en caso de no encontrar el archivo
		}catch (IOException e) {
			e.printStackTrace();//Error en el proceso de lectura
		}
		return alumnos;
	}
	
	
	
	
	
	private List<Double> crearListaNotas(Double nota) {
		List<Double> notas = new ArrayList<Double>();
		notas.add(nota);
		return notas;
	}





	private Materia obtenerMateria(String nombre) {
		Materia mat = new Materia();
		
		switch(nombre) {
		case "MATEMATICAS":
			mat.setNombre(MateriaEnum.MATEMATICAS);
			break;
		case "LENGUAJE":
			mat.setNombre(MateriaEnum.LENGUAJE);
			break;
		case "HISTORIA":
			mat.setNombre(MateriaEnum.HISTORIA);
			break;
		case "CIENCIA":
			mat.setNombre(MateriaEnum.CIENCIA);
			break;
		}
		return mat;
	}



	/*
	 *Alumno : 17.423.112-4 - Samuel
	 *Materia : MATEMATICAS - Promedio : 4.1
	 *Alumno : 18.546.232-1 - Pepe
	 *Materia : MATEMATICAS - Promedio : 4.4
	 *Materia : LENGUAJE - Promedio : 3.4

*/
	@Override
	public void exportarDatos(Map<String, Alumno> alumnos, String ruta) {
		try {
			BufferedWriter writer = new BufferedWriter (new FileWriter(ruta+ "promedios.txt"));
			
			alumnos.entrySet().forEach(entry -> {
				try {
					Alumno alumno = entry.getValue();
					writer.write("Alumno: " +alumno.getRut() + " - " + alumno.getNombre());
					writer.newLine();
					if(alumno.getMateria() !=null) {
						for(Materia mat: alumno.getMateria()) {
							writer.write("Materia : " + mat.getNombre() + " - Promedio "+promedioServicio.calculadoraPromedio(mat.getNotas()));
							writer.newLine();
						}
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
			
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
