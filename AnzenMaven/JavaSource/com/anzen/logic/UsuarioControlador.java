package com.anzen.logic;

import java.util.List;

import com.anzen.entities.Usuario;
import com.anzen.facade.UsuarioFacade;

public class UsuarioControlador {
	
	//Atributos
	private UsuarioFacade facade = new UsuarioFacade();
	
	//Metodos
	
	//Crea Usuario
	public boolean createUsuario(Usuario nuevoUsuario) {
		return facade.getDao().createUsuario(nuevoUsuario);
	}
	
	//Actualiza usuario
	public boolean updateUsuario(Usuario actualizarUsuario) {
		return facade.getDao().updateUsuario(actualizarUsuario);
	}
	
	//Elimina usuario
	public boolean deleteUsuario(Usuario eliminarUsuario) {
		return facade.getDao().deleteUsuario(eliminarUsuario);
	}
	
	//Obtiene los usuarios
	public List<Usuario> readUsuarios(){
		return facade.getDao().readUsuario();
	}
	

}
