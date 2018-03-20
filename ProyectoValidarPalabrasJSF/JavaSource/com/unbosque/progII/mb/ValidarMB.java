package com.unbosque.progII.mb;

import javax.faces.bean.ManagedBean;

import com.unbosque.progII.logica.ValidarPalabras;

@ManagedBean(name="valMB")
public class ValidarMB {
	
	//Atributos
	private String texto1;
	private String texto2;
	private String mensaje;
	private boolean mayusculas;
	private ValidarPalabras validador;
	
	//Constructor
	public ValidarMB() {
		this.texto1 = "";
		this.texto2 = "";
		this.mensaje = "";
		this.mayusculas = false;
		this.validador = new ValidarPalabras();
	}
	
	//Getter's y Setter's
	public String getTexto1() {
		return texto1;
	}
	public void setTexto1(String texto1) {
		this.texto1 = texto1;
	}
	public String getTexto2() {
		return texto2;
	}
	public void setTexto2(String texto2) {
		this.texto2 = texto2;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public boolean isMayusculas() {
		return mayusculas;
	}
	public void setMayusculas(boolean mayusculas) {
		this.mayusculas = mayusculas;
	}
	
	//Metodos
	
	public String validar() {
		
		if(this.mayusculas == true) {
			this.mensaje = this.validador.validarConMayusculas(texto1, texto2);
		}else {
			this.mensaje = this.validador.validarSinMayusculas(texto1, texto2);
		}
		
		return "/validarPalabras/respuesta";
	}
	

}
