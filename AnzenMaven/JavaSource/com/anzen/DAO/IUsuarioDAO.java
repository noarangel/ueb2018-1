package com.anzen.DAO;

import java.util.List;

import com.anzen.entities.Usuario;

public interface IUsuarioDAO {
	
	public boolean createUsuario (Usuario usuarioNuevo);
	public boolean updateUsuario (Usuario usuarioModificar);
	public boolean deleteUsuario (Usuario usuarioEliminar);
	public List<Usuario> readUsuario ();
	
}
