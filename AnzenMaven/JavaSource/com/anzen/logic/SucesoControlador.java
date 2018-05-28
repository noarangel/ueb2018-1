package com.anzen.logic;

import java.util.ArrayList;
import java.util.List;

import com.anzen.entities.Suceso;
import com.anzen.facade.FachadaSuceso;

public class SucesoControlador {
	private FachadaSuceso fachada = new FachadaSuceso();

	public boolean createSuceso(Suceso insertarSuceso) {
		insertarSuceso.setId(this.idGenerator());
		System.out.println(insertarSuceso.getId());
		return fachada.getDao().createSuceso(insertarSuceso);
	}

	public ArrayList<Suceso> readSuceso() {
		return fachada.getDao().readSuceso();
	}

	public boolean updateSuceso(Suceso cambiarSuceso) {
		return fachada.getDao().updateSuceso(cambiarSuceso);
	}

	public boolean delateSuceso(Suceso borrarSuceso) {
		return fachada.getDao().delateSuceso(borrarSuceso);
	}

	// Método que genera id
	public int idGenerator() {
		int aId = 0;
		List<Integer> eId = new ArrayList<Integer>();
		if (fachada.getDao().readSuceso().isEmpty()) {
			aId = (int) (Math.random() * 80000) + 1;
		} else {
			for (int i = 0; i < fachada.getDao().readSuceso().size(); i++) {
				eId.add(fachada.getDao().readSuceso().get(i).getId());
			}

			boolean bandera = false;
			do {
				int n = (int) (Math.random() * 80000) + 1;
				for (int i = 0; i < eId.size(); i++) {
					int bn = eId.get(i).intValue();
					if (n != bn) {
						aId = n;
						bandera = true;
					} else {
						bandera = false;
					}
				}

			} while (bandera == false);
		}

		return aId;
	}

}
