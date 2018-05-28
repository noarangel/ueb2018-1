package com.anzen.DAO;

import java.util.ArrayList;

import com.anzen.entities.Suceso;

public interface ISucesoDAO {

	public boolean createSuceso(Suceso crearSuceso);

	public ArrayList<Suceso> readSuceso();

	public boolean updateSuceso(Suceso modificarSuceso);

	public boolean delateSuceso(Suceso eliminarSuceso);

}
