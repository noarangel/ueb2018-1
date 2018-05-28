package com.anzen.DAO;

import java.util.List;

import com.anzen.entities.RolUsuario;


public interface IRolUsuarioDAO {
	
	public boolean createRol (RolUsuario rolNuevo);
	public boolean updateRol (RolUsuario rolModificar);
	public boolean deleteRol (RolUsuario rolEliminar);
	public List<RolUsuario> readRol ();
}
