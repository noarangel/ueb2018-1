package com.unbosque.progII.modelo;

public class Capital {
	
	//Atributos
	private int id;
	private String nombre;
	
	//Constructor
	public Capital(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	
	//Getter's y Setter's
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}
