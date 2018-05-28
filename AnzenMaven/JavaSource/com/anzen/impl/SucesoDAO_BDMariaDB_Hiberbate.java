package com.anzen.impl;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.anzen.DAO.ISucesoDAO;
import com.anzen.entities.Suceso;
import com.anzen.util.HibernateUtil;


public class SucesoDAO_BDMariaDB_Hiberbate implements ISucesoDAO {

	@Override
	public boolean createSuceso(Suceso crearSuceso) {
		Session s = HibernateUtil.getSf().getCurrentSession();
		s.beginTransaction();		
		s.persist(crearSuceso);
		s.getTransaction().commit();
		s.close();
		return true;
	}

	@Override
	public ArrayList<Suceso> readSuceso() {
		ArrayList<Suceso> lista;
		Session s = HibernateUtil.getSf().getCurrentSession();
		s.beginTransaction();
		Query q = s.createQuery("SELECT s FROM Suceso s ");
		lista = (ArrayList<Suceso>) q.list();
		s.getTransaction();
		s.close();

		return lista;
	}

	@Override
	public boolean updateSuceso(Suceso modificarSuceso) {

		Session s = HibernateUtil.getSf().getCurrentSession();
		s.beginTransaction();
		s.update(modificarSuceso);
		s.getTransaction().commit();
		s.close();
		return true;
	}

	@Override
	public boolean delateSuceso(Suceso eliminarSuceso) {

		Session s = HibernateUtil.getSf().getCurrentSession();
		s.beginTransaction();
		s.remove(eliminarSuceso);
		s.getTransaction().commit();
		s.close();
		return true;

	}

}
