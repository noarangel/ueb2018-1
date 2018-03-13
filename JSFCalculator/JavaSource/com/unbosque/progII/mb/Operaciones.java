package com.unbosque.progII.mb;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="operacionesMB")
public class Operaciones {
	
	//Atributos
	private String num1, num2;
	private String respuesta;
	private String mensaje;
	
	//Getter's y Setter's
	public String getNum1() {
		return num1;
	}
	public void setNum1(String num1) {
		this.num1 = num1;
	}
	public String getNum2() {
		return num2;
	}
	public void setNum2(String num2) {
		this.num2 = num2;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public String getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}
	
	//Metodos
	
	public double stringToDouble(String cadena) {
		double numero = Double.parseDouble(cadena);
		return numero;
	}
	
	public void sumar() {
		double resp = this.stringToDouble(num1) + this.stringToDouble(num2);
		this.respuesta = Double.toString(resp);
	}
	
	public void restar() {
		double resp = this.stringToDouble(num1) - this.stringToDouble(num2);
		this.respuesta = Double.toString(resp);		
	}
	
	public void multiplicar() {
		
		double resp = this.stringToDouble(num1) * this.stringToDouble(num2);
		this.respuesta = Double.toString(resp);
	}
	
	public void dividir() {
		
		if(this.stringToDouble(num2) != 0) {
			double resp = this.stringToDouble(num1) / this.stringToDouble(num2);
			this.respuesta = Double.toString(resp);			
		}else {
			this.num1 = "";
			this.num2 = "";
			this.respuesta = "No se divide por 0";
		}
	}
}
