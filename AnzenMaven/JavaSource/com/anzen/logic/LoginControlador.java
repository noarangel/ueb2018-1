package com.anzen.logic;

import com.anzen.entities.Credenciales;
import com.anzen.entities.Usuario;
import com.anzen.facade.UsuarioFacade;

public class LoginControlador {
	
	private UsuarioFacade facadeUsu = new UsuarioFacade();
	
	//M�todo que obtiene si el logueo fue exitoso logueado
	public boolean login(Credenciales cred) {
		boolean bandera = facadeUsu.loginUser(cred);
		return bandera;
	}
	
	//M�todo que obtiene el usuario logueado
	public Usuario loginUsuario () {
		return facadeUsu.getUser();
	}
	

}
