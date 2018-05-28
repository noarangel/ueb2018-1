package com.anzen.facade;

import java.util.ResourceBundle;

import com.anzen.DAO.ISucesoDAO;
import com.anzen.impl.SucesoDAO_BDMariaDB_Hiberbate;
import com.anzen.impl.SucesoDAO_BDMariaDB_JDBC;


public class FachadaSuceso {
	private ISucesoDAO dao;

	public FachadaSuceso() {
		ResourceBundle rb = ResourceBundle.getBundle("config");
		String tipoBD = rb.getString("tipoBaseDatos");

		if (tipoBD != null && tipoBD.equals("1")) {
			dao = new SucesoDAO_BDMariaDB_JDBC();
		} else if (tipoBD != null && tipoBD.equals("2")) {
			dao = new SucesoDAO_BDMariaDB_Hiberbate();
		} 
	}

	public ISucesoDAO getDao() {
		return dao;
	}

}
