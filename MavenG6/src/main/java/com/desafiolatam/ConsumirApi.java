package com.desafiolatam;

import java.util.List;
import java.util.Scanner;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class ConsumirApi {
	// metodos a utilizar; get, post, put, delete

	public void obtenerApi(Scanner sc) {// MOSTRAR DATOS FUNCIONA OK!! //getApi

		Client client = ClientBuilder.newClient();
		WebTarget target = 
				client.target("https://jsonplaceholder.typicode.com").path("posts");
		Invocation.Builder invocationBuilder = 
				target.request(MediaType.APPLICATION_JSON);
		Response respuesta = invocationBuilder.get();
		List<Publicacion> listaPublicaciones = respuesta.readEntity(new
				GenericType<List<Publicacion>>(){});
		System.out.println(listaPublicaciones.get(0));

		System.out.println("***Publicaciones***");
		for (Publicacion publicacion : listaPublicaciones) {
			System.out.println(publicacion.getUserId() + "-" + publicacion.getId() + "-" + publicacion.getTitle());
		}
		
	
		//comentarios
		target = client.target("https://jsonplaceholder.typicode.com").path("comments");
		invocationBuilder = target.request(MediaType.APPLICATION_JSON);
		respuesta = invocationBuilder.get();
		
		List<Comentario> listaComentarios = respuesta.readEntity(new
				GenericType<List<Comentario>>(){});
		System.out.println(listaComentarios.get(0));

		System.out.println("****Comentarios****");
		for (Comentario comentario : listaComentarios) {
			System.out.println(comentario.getPostId()+"-"+comentario.getId()+"-"+comentario.getName());
		}
		
}
	

	public void metodoPost(Scanner sc) {//AGREGAR DATOS FUNCIONA OK!!

		Publicacion publicacion = new Publicacion();
		
		System.out.println("Ingrese titulo que desee agregar ");
		publicacion.setTitle(sc.nextLine());
		System.out.println("Ingrese body que desee agregar");
		publicacion.setBody(sc.nextLine());
		System.out.println("Ingrese UserId que desee agregar");
		publicacion.setUserId (sc.nextInt());
		System.out.println("Ingrese Id que desee agregar");
		publicacion.setId(sc.nextInt());
		sc.nextLine();
		
		
		//publicacion.setTitle(tituloAgregar);//"LoTR" 
		//publicacion.setBody(bodyAgregar);//"A ring" 
		//publicacion.setUserId(userAgregar);//1
		//publicacion.setId(idAgregar);//101

		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("https://jsonplaceholder.typicode.com").path("posts");
		Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);
		Response publicacionRespuesta = invocationBuilder.post(Entity.entity(publicacion, MediaType.APPLICATION_JSON));
		//System.out.println(publicacionRespuesta);
		if (publicacionRespuesta.getStatus() == 201) {
			System.out.println("La publicación se realizó correctamente");
		} else {
			System.out.println("No se pudo agregar la publicación");
		}
	}

	public void metodoPut(Scanner sc) {// ACTUALIZAR FUNCIONA OK!!
		
		Publicacion publicacion = new Publicacion();
		System.out.println("Ingrese nuevo título:");
		publicacion.setTitle(sc.nextLine());
		System.out.println("Ingrese el cuerpo de la publicación");
		publicacion.setBody(sc.nextLine());
		System.out.println("Ingrese nuevo Id de usuario:");
		publicacion.setUserId(sc.nextInt());
		System.out.println("Ingrese nueva Id:");
		publicacion.setId(sc.nextInt());
		
		
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("https://jsonplaceholder.typicode.com").path("posts").path(publicacion.getId().toString());
		Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);
		Response publicacionRespuesta = invocationBuilder.put(Entity.entity(publicacion, MediaType.APPLICATION_JSON));
		//System.out.println(publicacionRespuesta);
		if(publicacionRespuesta.getStatus() == 200) {
			System.out.println("Publicación actualizada exitosamente");
		}else {
			System.out.println("Error al actualizar la publicación");
		}	
	}

	public void metodoDelete(Scanner sc) { //ELIMINAR FUNCIONA OK!!

		System.out.println("Ingrese elemento a eliminar");
		String idEliminar = sc.nextLine();
		System.out.println();

		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("https://jsonplaceholder.typicode.com").path("posts").path(idEliminar);
		Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);
		Response publicacionRespuesta = invocationBuilder.delete();
		//System.out.println(publicacionRespuesta);
		if (publicacionRespuesta.getStatus() == 200) {
			System.out.println("El elemento se eliminó de forma exitosa");
		} else {
			System.out.println("Error al momento de eliminar el elemento");
		}
	}

}
