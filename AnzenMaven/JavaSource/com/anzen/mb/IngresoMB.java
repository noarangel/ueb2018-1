package com.anzen.mb;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.anzen.entities.Credenciales;
import com.anzen.logic.LoginControlador;
	
@SessionScoped
@ManagedBean (name="inMB")
public class IngresoMB {
	
	//Atributos
	private LoginControlador lc = new LoginControlador();
	private Credenciales cred = new Credenciales();
	
	//Logueo
	public String logueo () {
		boolean bandera = lc.login(cred);
		
		if(bandera == true) {
			System.out.println(bandera);
			return "agregarSuceso";
		}else {
			System.out.println(bandera);
			return "registro";
		}
		
	}
	
	
	//Getter's y Setter's
	public Credenciales getCred() {
		return cred;
	}

	public void setCred(Credenciales cred) {
		this.cred = cred;
	}
		
	//Método que obtiene el usuario logueado
	public String usuarioLogueado() {
		String usuario = lc.loginUsuario().getNombreAnzen();
		return usuario;
	}
	

}
