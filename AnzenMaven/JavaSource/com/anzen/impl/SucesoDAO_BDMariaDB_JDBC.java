package com.anzen.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.anzen.DAO.ISucesoDAO;
import com.anzen.entities.Suceso;
import com.anzen.entities.Tiposuceso;
import com.anzen.util.ConexionMariaBD_JDBC;

public class SucesoDAO_BDMariaDB_JDBC implements ISucesoDAO {
	//private ConexionMariaDB_JDBC conMDB = new ConexionMariaDB_JDBC();

	@Override
	public boolean createSuceso(Suceso crearSuceso) {
		Connection con = ConexionMariaBD_JDBC.getConexion();
		String insert = "INSERT INTO suceso (id,tiposuceso,fecha_registro,fecha_suceso,ubicacion,comentario) VALUES (?,?,?,?,?,?)";

		try {
			PreparedStatement ps = con.prepareStatement(insert);
			ps.setInt(1, 0);
			ps.setInt(2, crearSuceso.getTiposuceso().getId());
			java.sql.Date fechaR = new Date(crearSuceso.getFechaRegistro().getTime());
			ps.setDate(3, fechaR);
			java.sql.Date fechaS = new Date(crearSuceso.getFechaSuceso().getTime());
			ps.setDate(4, fechaS);
			ps.setString(5, crearSuceso.getUbicacion());
			ps.setString(6, crearSuceso.getComentario());
			ps.execute();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public ArrayList<Suceso> readSuceso() {

		ArrayList<Suceso> listaSucesos = new ArrayList<Suceso>();
		Connection con = ConexionMariaBD_JDBC.getConexion();
		String insert = "SELECT S.ID,S.FECHA_REGISTRO,S.FECHA_SUCESO,S.UBICACION,S.COMENTARIO FROM SUCESO S INNER JOIN TIPOSUCESO T ON T.ID=S.TIPOSUCESO";

		try {
			PreparedStatement ps = con.prepareStatement(insert);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Suceso suceso = new Suceso();
				suceso.setId(rs.getInt(1));

				Tiposuceso t = new Tiposuceso();
				t.setTipo(rs.getString(2));
				suceso.setTiposuceso(t);

				suceso.setFechaRegistro(rs.getDate(3));
				//Suceso.setFechaSuceso(rs.getDate(4));
				suceso.setUbicacion(rs.getString(5));
				suceso.setComentario(rs.getString(6));
				listaSucesos.add(suceso);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return listaSucesos;
	}

	@Override
	public boolean updateSuceso(Suceso modificarSuceso) {
		Connection con = ConexionMariaBD_JDBC.getConexion();
		String update = "UPDATE equipo SET  tiposuceso=?,fecha_registro =?,fecha_suceso=?, ubicacion=?, comentario=? WHERE id=? ";
		try {
			PreparedStatement ps = con.prepareStatement(update);
			ps.setInt(1, modificarSuceso.getTiposuceso().getId());
			java.sql.Date fechaR = new Date(modificarSuceso.getFechaRegistro().getTime());
			ps.setDate(2, fechaR);
			java.sql.Date fechaS = new Date(modificarSuceso.getFechaSuceso().getTime());
			ps.setDate(3, fechaS);
			ps.setString(4, modificarSuceso.getUbicacion());
			ps.setString(5, modificarSuceso.getComentario());
			ps.setInt(6, modificarSuceso.getId());
			ps.execute();
			con.close();
			ps = null;
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean delateSuceso(Suceso eliminarSuceso) {

		Connection con = ConexionMariaBD_JDBC.getConexion();
		String delete = "DELETE FROM suceso WHERE id =" + eliminarSuceso.getId();
		try {
			PreparedStatement ps = con.prepareStatement(delete);
			ps.execute();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

}
