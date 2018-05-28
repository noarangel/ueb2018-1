package com.anzen.impl;

import java.util.List;

import org.hibernate.Session;

import com.anzen.DAO.IRolUsuarioDAO;
import com.anzen.entities.RolUsuario;
import com.anzen.util.HibernateUtil;

public class RolUsuarioDAO_DBMarioaDB_Hibernate implements IRolUsuarioDAO {

	// Método que crea rol
	public boolean createRol(RolUsuario rolNuevo) {

		Session s = HibernateUtil.getSf().getCurrentSession();
		s.beginTransaction();
		s.save(rolNuevo);
		s.getTransaction().commit();
		s.close();

		return false;
	}

	// Método que actualiza rol
	public boolean updateRol(RolUsuario rolModificar) {
		Session s = HibernateUtil.getSf().getCurrentSession();
		s.beginTransaction();
		// Obtiene el objeto
		RolUsuario rol =  (RolUsuario) s.get(RolUsuario.class, rolModificar.getId());
		// inserta los valores del objeto a modificar
		rol.setTipoRol(rolModificar.getTipoRol());
		rol.setUsuarios(rolModificar.getUsuarios());
		s.update(rol);
		s.getTransaction().commit();
		s.close();
		return false;
	}

	// Método que delete rol
	public boolean deleteRol(RolUsuario rolEliminar) {
		Session s = HibernateUtil.getSf().getCurrentSession();
		s.beginTransaction();
		//Obtiene el objeto
		RolUsuario rol =  (RolUsuario) s.get(RolUsuario.class, rolEliminar.getId());
		//Elimina el objeto
		s.delete(rol);
		s.getTransaction().commit();
		s.close();
		return false;
	}

	// Método que obtiene roles
	public List<RolUsuario> readRol() {
		
		List<RolUsuario> roles;
		Session s = HibernateUtil.getSf().getCurrentSession();
		s.beginTransaction();
		roles = s.createQuery("SELECT e FROM RolUsuario e").list();
		//Query q = s.createQuery("SELECT u FROM Usuario u ");
		//usuarios = (List<Usuario>) q.list();
		s.getTransaction();
		s.close();
		
		return roles;
	}

}
