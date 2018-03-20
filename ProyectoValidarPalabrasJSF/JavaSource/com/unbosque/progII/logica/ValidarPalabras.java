package com.unbosque.progII.logica;

public class ValidarPalabras {
	
	public String validarSinMayusculas (String txt1, String txt2) {
		 String texto1 = txt1.toLowerCase().trim();
		 String texto2 = txt2.toLowerCase().trim();
		 String mensaje = "";
		if(texto1.equals(texto2)) {
			mensaje = "Los textos son iguales";
		}else {
			mensaje = "Los textos no son iguales";
		}
			
		return mensaje;
	}
	
	public String validarConMayusculas(String txt1, String txt2) {
		 String texto1 = txt1.trim();
		 String texto2 = txt2.trim();
		 String mensaje = "";
		 
		 if(texto1.equals(texto2)) {
				mensaje = "Los textos son iguales";
			}else {
				mensaje = "Los textos no son iguales";
			}
				
		return mensaje;
	}

}
