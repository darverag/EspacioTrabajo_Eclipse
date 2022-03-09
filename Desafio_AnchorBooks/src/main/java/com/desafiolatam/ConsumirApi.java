package com.desafiolatam;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class ConsumirApi {
		//atributo
	    private List<Book> listaBook;
	    private List<BookDetail> listaBookDetail;
	    
	    //getters&&setters
		public List<Book> getListaBook() {
			return listaBook;
		}

		public void setListaBook(List<Book> listaBook) {
			this.listaBook = listaBook;
		}

		public List<BookDetail> getListaBookDetail() {
			return listaBookDetail;
		}

		public void setListaBookDetail(List<BookDetail> listaBookDetail) {
			this.listaBookDetail = listaBookDetail;
		}
		
		
	   
	public void metodoObtenerListaLibros() { //METODO OBTENER LISTA LIBROS DESDE PRIMERA API - FUNCIONA OK OPC1

		
		Client client = ClientBuilder.newClient();
	    WebTarget target = client.target("https://my-json-server.typicode.com").path("Himuravidal/anchorBooks/books");
	    Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);
	    Response bookrespuesta = invocationBuilder.get();
	    //Variable global
	    this.listaBook = bookrespuesta.readEntity(new GenericType<List<Book>>() {
	    });
	    
	    //System.out.println(bookrespuesta);
		System.out.println("***Lista de libros Completa *** ");
		System.out.println("---------------------------------------------------------\n");
		for (Book book : listaBook) {
			System.out.println(book.toString());
		}
		System.out.println("--------------------------------------------");
		if (bookrespuesta.getStatus() == 200) {
			System.out.println("****¡Los datos se obtuvieron correctamente!****\n");
		} else {
			System.out.println("****¡No se pudo ejecutar su solicitud!****\n");
		}
	}
	

	public void metodoObtenerListaAutorTitulo() { //METODO OBTENER LISTA LIBROS CON AUTOR + TITULO - FUNCIONA OK OPC2
		
		System.out.println("*** Lista de libros por Autor y título ***");
		System.out.println("------------------------------------------\n");
		for (Book book : listaBook) {
			System.out.println(book.getAuthor() + ": " + book.getTitle());
		}
		System.out.println("---------------------------------------------");
	}

	
	public void metodoObtenerListaPosicion() { //METODO OBTENER LISTA LIBROS POR POSICIÓN 3 Y 8 - FUNCIONA OK OPC3

		System.out.println("*** Lista de libros por posición ( 3 y 8) ***");
		System.out.println("------------------------------------------\n");

		Integer contador = 0;
		for (Book book : listaBook) {
			contador++;
			if (contador == 4) {
				System.out.println(" Libro número 3 : " + book.getAuthor()+ " , "  + book.getTitle() + " , "
						+book.getCountry());
			}
			if (contador == 9) {
				System.out.println(" Libro número 8 : " + book.getAuthor()+ " , "  +book.getTitle() + " , "
						+book.getCountry());
			}
		}
		System.out.println("-------------------------------------------------------------");
	}

	
	public void metodoObtenerApiDetalles() {//METODO OBTENER LISTA LIBROS CON DETALLES (BOOKDETAILS) - FUNCIONA OK OPC4

		// BOOKDETAIL
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("https://my-json-server.typicode.com").path("Himuravidal/anchorBooks/bookDetail");
		Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);
		Response bookDetailrespuesta = invocationBuilder.get();
		//variable global
		this.listaBookDetail = bookDetailrespuesta.readEntity(new GenericType<List<BookDetail>>() {
		});
		//System.out.println(bookDetailrespuesta);
		
		System.out.println("*** Lista de libros detallada ***");
		System.out.println("------------------------------------------\n");
		for (BookDetail bookDetail : listaBookDetail) {
			System.out.println(bookDetail.toString());
		}
		System.out.println("---------------------------------------------");
		if (bookDetailrespuesta.getStatus() == 200) {
			System.out.println("****¡Los datos se obtuvieron correctamente!****\n");
		} else {
			System.out.println("****¡No se pudo ejecutar su solicitud!****\n");
		}
	}
	
	

	public void metodoObtenerAutorUknown() { // METODO OBTENER LISTA LIBRO CON AUTOR  UNKNOWN O DESCONOCIDO - FUNCIONA OK OPC5

		
		System.out.println("*** Lista de libros con autor anónimo o desconocido***");
		System.out.println("------------------------------------------\n");
		for (Book book : listaBook) {
			if (book.getAuthor().contains("Unknow")) {
				System.out.println("Autor: " + book.getAuthor()+ " - "+" libro: " + book.getTitle());
			}
		}
		System.out.println("---------------------------------------------");	
	}

	
	
	public void metodoObtenerDelivery() {// METODO OBTENER LISTA LIBRO CON DELIVERY TRUE - FUNCIONA OK OPC6

		
		System.out.println("Lista de libros con delivery");
		System.out.println("------------------------------------------\n");
		
		
		for (BookDetail bookDetail : listaBookDetail) {
			if (bookDetail.getDelivery().equalsIgnoreCase("True")) {
				System.out.println("Libro: " + bookDetail.getTitle());
			}
		}
		System.out.println("---------------------------------------------");	
	}
}
