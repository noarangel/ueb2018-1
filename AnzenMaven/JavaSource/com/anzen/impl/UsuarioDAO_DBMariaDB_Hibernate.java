package com.anzen.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.anzen.DAO.IUsuarioDAO;
import com.anzen.entities.RolUsuario;
import com.anzen.entities.Usuario;
import com.anzen.facade.RolFacade;
import com.anzen.util.HibernateUtil;

public class UsuarioDAO_DBMariaDB_Hibernate implements IUsuarioDAO{

	//Método que crea el usuario
	public boolean createUsuario(Usuario usuarioNuevo) {
		
		Session s = HibernateUtil.getSf().getCurrentSession();
		s.beginTransaction();
		s.save(usuarioNuevo);
		s.getTransaction().commit();
		s.close();
		return false;
	}

	//Método que actualiza un usuario
	public boolean updateUsuario(Usuario usuarioModificar) {
		
		Session s = HibernateUtil.getSf().getCurrentSession();
		s.beginTransaction();
		//Obtiene el objeto
		Usuario user = (Usuario) s.get(Usuario.class, usuarioModificar.getIdAnzen());
		//inserta los valores del objeto a modificar
		RolUsuario rol = s.get(RolUsuario.class, usuarioModificar.getRolUsuario());
		user.setRolUsuario(rol);
		user.setIdAnzen(0);
		user.setNombreAnzen(usuarioModificar.getNombreAnzen());
		user.setCorreoAnzen(usuarioModificar.getCorreoAnzen());
		user.setClaveAnzen(usuarioModificar.getClaveAnzen());
		user.setNotificacionesAnzen(usuarioModificar.getNotificacionesAnzen());
		s.update(user);
		s.getTransaction().commit();
		s.close();
		return false;
	}

	//Método que elimina un usuario
	public boolean deleteUsuario(Usuario usuarioEliminar) {
		Session s = HibernateUtil.getSf().getCurrentSession();
		s.beginTransaction();
		//Obtiene el objeto
		Usuario user = (Usuario) s.get(Usuario.class, usuarioEliminar.getIdAnzen());
		//Elimina el objeto
		s.delete(user);
		s.getTransaction().commit();
		s.close();
		return false;
	}

	//Método que obtiene los usuarios
	public List<Usuario> readUsuario() {
		
		List<Usuario> usuarios;
		Session s = HibernateUtil.getSf().getCurrentSession();
		s.beginTransaction();
		usuarios = s.createQuery("SELECT e FROM Usuario e").list();
		//Query q = s.createQuery("SELECT u FROM Usuario u ");
		//usuarios = (List<Usuario>) q.list();
		s.getTransaction();
		s.close();
		return usuarios;
	}
	
	public static void main(String[] args) {
		
		UsuarioDAO_DBMariaDB_Hibernate dao = new UsuarioDAO_DBMariaDB_Hibernate();
		//List<Usuario> users = dao.readUsuario();
		//System.out.println(users.get(0));
	
		Usuario user =  new Usuario();
		RolFacade rol = new RolFacade();
		List<RolUsuario> roles = rol.getDao().readRol();
		user.setIdAnzen(null);
		user.setRolUsuario(roles.get(0));
		user.setNombreAnzen("Diana Andrea Aponte Sanabria");
		user.setCorreoAnzen("dapontes@unbosque.edu.co");
		user.setClaveAnzen("12345");
		user.setNotificacionesAnzen(true);
		dao.createUsuario(user);
		System.out.println(dao.readUsuario().size());
		
		
	}

}
