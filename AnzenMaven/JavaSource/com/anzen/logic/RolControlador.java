package com.anzen.logic;

import java.util.List;

import com.anzen.entities.RolUsuario;
import com.anzen.facade.RolFacade;

public class RolControlador {

	/** Atributos**/
	RolFacade facadeRol = new RolFacade();

	/** M�todo crea un rol**/
	public boolean createRol(RolUsuario nuevoRol) {

		return facadeRol.getDao().createRol(nuevoRol);
	}

	/** M�todo modifica un rol**/
	public boolean updateRol(RolUsuario modificarRol) {

		return facadeRol.getDao().updateRol(modificarRol);
	}

	/** M�todo elimina un rol**/
	public boolean deleteRol(RolUsuario eliminarRol) {
		return facadeRol.getDao().deleteRol(eliminarRol);
	}

	/** M�todo lee un rol**/
	public List<RolUsuario> readRol() {
		return facadeRol.getDao().readRol();
	}
}
