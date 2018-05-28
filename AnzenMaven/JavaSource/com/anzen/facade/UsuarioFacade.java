package com.anzen.facade;

import java.util.List;
import java.util.ResourceBundle;

import com.anzen.DAO.IUsuarioDAO;
import com.anzen.entities.Credenciales;
import com.anzen.entities.Usuario;
import com.anzen.impl.UsuarioDAO_DBMariaDB_Hibernate;
import com.anzen.impl.UsuarioDAO_DBMariaDB_JDBC;

public class UsuarioFacade {

	private IUsuarioDAO dao;
	private Usuario user = new Usuario(); 

	public UsuarioFacade() {
		ResourceBundle rb = ResourceBundle.getBundle("config");
		String tipoBD = rb.getString("tipoBaseDatos");
		if ((tipoBD != null) && (tipoBD.equals("1"))) {
			dao = new UsuarioDAO_DBMariaDB_JDBC();
		} else if ((tipoBD != null) && (tipoBD.equals("2"))) {
			dao = new UsuarioDAO_DBMariaDB_Hibernate();
		}
	}

	public IUsuarioDAO getDao() {
		return dao;
	}

	// Método para iniciar Sesión
	public boolean loginUser(Credenciales cred) {
		boolean logueo = false;
		try {
			List<Usuario> usuarios = this.getDao().readUsuario();
			for (int i = 0; i < usuarios.size(); i++) {
				if (!usuarios.isEmpty()) {
					if ((cred.getUser().equals(usuarios.get(i).getCorreoAnzen()))
							&& (cred.getPass().equals(usuarios.get(i).getClaveAnzen()))) {
						user = usuarios.get(i);
						logueo = true;
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {

		}
		
		return logueo;
	}
	
	//obtener usuario logueado
	public Usuario getUser() {
		return user;
	}
}
