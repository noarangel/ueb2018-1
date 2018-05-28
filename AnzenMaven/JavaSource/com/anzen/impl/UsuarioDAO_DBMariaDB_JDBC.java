package com.anzen.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.anzen.DAO.IUsuarioDAO;
import com.anzen.entities.Usuario;
import com.anzen.util.ConexionMariaBD_JDBC;

public class UsuarioDAO_DBMariaDB_JDBC implements IUsuarioDAO {

	@Override
	public boolean createUsuario(Usuario usuarioNuevo) {
		boolean creado = false;
		Connection con = ConexionMariaBD_JDBC.getConexion();
		String insert = "INSERT INTO usuario VALUES (?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement ps = con.prepareStatement(insert);
			ps.setInt(1, usuarioNuevo.getIdAnzen());
			//ps.setInt(2, usuarioNuevo.getRolUsuario());
			ps.setString(3, usuarioNuevo.getNombreAnzen());
			ps.setString(4, usuarioNuevo.getCorreoAnzen());
			ps.setString(5, usuarioNuevo.getClaveAnzen());
			ps.setBoolean(6, usuarioNuevo.getNotificacionesAnzen());
			creado = ps.execute();
			ps.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateUsuario(Usuario usuarioModificar) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUsuario(Usuario usuarioEliminar) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Usuario> readUsuario() {
		// TODO Auto-generated method stub
		return null;
	}

}
