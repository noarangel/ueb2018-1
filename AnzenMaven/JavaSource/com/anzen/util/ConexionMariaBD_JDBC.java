package com.anzen.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMariaBD_JDBC {
	
	/**Conexion con MariaDB**/
	public static Connection getConexion(){
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/anzenjsf", "root","12345");
			return connection;
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
