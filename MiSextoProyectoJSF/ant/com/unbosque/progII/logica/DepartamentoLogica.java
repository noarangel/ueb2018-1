package com.unbosque.progII.logica;

import java.util.ArrayList;

import com.unbosque.progII.modelo.Capital;
import com.unbosque.progII.modelo.Departamento;

public class DepartamentoLogica {
	
	public ArrayList<Departamento> listaDepartamento() {
		
		ArrayList<Departamento> lista = new ArrayList<Departamento>();
		Departamento d1 = new Departamento(1, "Bogotá D.C.");
		Departamento d2 = new Departamento(1, "Cundinamarca");
		Departamento d3 = new Departamento(1, "Antioquia");
		Departamento d4 = new Departamento(1, "Valle");
		Departamento d5 = new Departamento(1, "Amazonas");
	
		lista.add(d1);
		lista.add(d2);
		lista.add(d3);
		lista.add(d4);
		lista.add(d5);
		
		return lista;
	}
	
	public Capital consultarCapitalPorDepartamento(int idDepartamento) {
		Capital capital;
		
		switch (idDepartamento) {
		case 1:
			capital = new Capital(1, "BOGOTÁ D.C.");
			break;
		case 2:
			capital = new Capital(2, "BOGOTÁ D.C.");
			break;
		case 3:
			capital = new Capital(3, "MEDELLIN");
			break;
		case 4:
			capital = new Capital(4, "CALI");
			break;
		case 5:
			capital = new Capital(5, "LETICIA");
			break;

		default:
			capital = new Capital (0, "NINGUNA");
			break;
		}	
		
		return capital;
	}
}
