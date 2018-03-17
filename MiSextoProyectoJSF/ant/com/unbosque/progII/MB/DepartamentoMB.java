package com.unbosque.progII.MB;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.model.SelectItem;

import com.unbosque.progII.logica.DepartamentoLogica;
import com.unbosque.progII.modelo.Capital;
import com.unbosque.progII.modelo.Departamento;

@ManagedBean(name="dptoMB")
public class DepartamentoMB {
	
	//Atributos
	
	private ArrayList<Departamento> listaDepartamento;
	private DepartamentoLogica logicaDepartamento;
	private ArrayList<SelectItem> opcionesComboDepartamento;
	private int departamentoSeleccionado;
	private Capital capitalSeleccionada;
	private boolean mostrarCapital;
	
	//Constructor

	public boolean isMostrarCapital() {
		return mostrarCapital;
	}

	public void setMostrarCapital(boolean mostrarCapital) {
		this.mostrarCapital = mostrarCapital;
	}

	public DepartamentoMB(){
		logicaDepartamento = new DepartamentoLogica();
		listaDepartamento = logicaDepartamento.listaDepartamento();
		opcionesComboDepartamento = new ArrayList<SelectItem>();
		
		for(Departamento dpto: listaDepartamento) {
			SelectItem opcion = new SelectItem(dpto.getId(), dpto.getNombre());
			opcionesComboDepartamento.add(opcion);
		}
	}	
	
	//Metodo
	public void consultarCapital() {
		capitalSeleccionada = logicaDepartamento.consultarCapitalPorDepartamento(departamentoSeleccionado);
		mostrarCapital = true;
	}
	
	//Getter's y Setter's

	public ArrayList<Departamento> getListaDepartamento() {
		return listaDepartamento;
	}

	public void setListaDepartamento(ArrayList<Departamento> listaDepartamento) {
		this.listaDepartamento = listaDepartamento;
	}

	public DepartamentoLogica getLogicaDepartamento() {
		return logicaDepartamento;
	}

	public void setLogicaDepartamento(DepartamentoLogica logicaDepartamento) {
		this.logicaDepartamento = logicaDepartamento;
	}

	public ArrayList<SelectItem> getOpcionesComboDepartamento() {
		return opcionesComboDepartamento;
	}

	public void setOpcionesComboDepartamento(ArrayList<SelectItem> opcionesComboDepartamento) {
		this.opcionesComboDepartamento = opcionesComboDepartamento;
	}

	public int getDepartamentoSeleccionado() {
		return departamentoSeleccionado;
	}

	public void setDepartamentoSeleccionado(int departamentoSeleccionado) {
		this.departamentoSeleccionado = departamentoSeleccionado;
	}

	public Capital getCapitalSeleccionada() {
		return capitalSeleccionada;
	}

	public void setCapitalSeleccionada(Capital capitalSeleccionada) {
		this.capitalSeleccionada = capitalSeleccionada;
	}
	

}
