package com.anzen.mb;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import com.anzen.entities.Suceso;
import com.anzen.logic.SucesoControlador;


@ManagedBean
public class SucesoMB {

	private Suceso creacionSuceso = new Suceso();
	private Suceso modificacionSuceso;
	private Suceso eliminacionSuceso;
	private SucesoControlador logica = new SucesoControlador();
	private ArrayList<Suceso> ListaSuceso;

	public String iniciarCreacionSuceso() {
		creacionSuceso = new Suceso();
		return "";

	}

	public void consultarSuceso() {
		ListaSuceso = logica.readSuceso();

	}

	public String crearSuceso() {
		
		this.creacionSuceso.setId(0);
		logica.createSuceso(creacionSuceso);
		return "tablaSucesos";

	}

	public String actualizarSuceso() {
		logica.updateSuceso(modificacionSuceso);
		return "lista.xhtml";

	}

	public String eliminarSuceso() {
		logica.delateSuceso(eliminacionSuceso);
		return null;
	}

	public Suceso getCreacionSuceso() {
		return creacionSuceso;
	}

	public void setCreacionSuceso(Suceso creacionSuceso) {
		this.creacionSuceso = creacionSuceso;
	}

	public Suceso getModificacionSuceso() {
		return modificacionSuceso;
	}

	public void setModificacionSuceso(Suceso modificacionSuceso) {
		this.modificacionSuceso = modificacionSuceso;
	}

	public Suceso getEliminacionSuceso() {
		return eliminacionSuceso;
	}

	public void setEliminacionSuceso(Suceso eliminacionSuceso) {
		this.eliminacionSuceso = eliminacionSuceso;
	}

	public ArrayList<Suceso> getListaSuceso() {
		return ListaSuceso;
	}

	public void setListaSuceso(ArrayList<Suceso> listaSuceso) {
		ListaSuceso = listaSuceso;
	}
	
}
