package com.anzen.facade;

import java.util.ResourceBundle;

import com.anzen.DAO.IRolUsuarioDAO;
import com.anzen.impl.RolUsuarioDAO_DBMarioaDB_Hibernate;

public class RolFacade {
	
	private IRolUsuarioDAO dao;
	
	public RolFacade() {
		ResourceBundle rb = ResourceBundle.getBundle("config");
		String tipoDB = rb.getString("tipoBaseDatos");
		if((tipoDB != null) && (tipoDB.equals("2"))) {
			dao = new RolUsuarioDAO_DBMarioaDB_Hibernate();
		}
	}
	
	public IRolUsuarioDAO getDao() {
		return dao;
	}

}
