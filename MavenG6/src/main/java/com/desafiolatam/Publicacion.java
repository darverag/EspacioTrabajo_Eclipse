package com.desafiolatam;

public class Publicacion {

	//atributos
	private Integer userId;
	private Integer id;
	private String title;
	private String body;
	
	//constructores
	public Publicacion() {
		super();
	}

	public Publicacion(Integer userId, Integer id, String title, String body) {
		super();
		this.userId = userId;
		this.id = id;
		this.title = title;
		this.body = body;
	}

	//getters&setters
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	//metodo ToString
	@Override
	public String toString() {
		return "Publicacion [userId=" + userId + ", id=" + id + ", title=" + title + ", body=" + body + ", toString()="
				+ super.toString() + "]";
	}	
	
}
