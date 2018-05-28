package com.anzen.pruebas;

import java.util.List;
import java.util.Set;

import com.anzen.entities.RolUsuario;
import com.anzen.entities.Usuario;
import com.anzen.logic.UsuarioControlador;

public class pruebaCrudUsuarios {

	public static void main(String[] args) {
		
		
		Usuario user = new Usuario();
		user.setIdAnzen(null);
		RolUsuario rol = new RolUsuario(1, "usuario", (Set<Usuario>) user);
		user.setRolUsuario(rol);
		
	}

}
