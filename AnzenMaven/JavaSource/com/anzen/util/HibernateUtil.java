package com.anzen.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	//Patron singleton: Esta clase es la única permitida para devolver las sesiones
	
	//Declaramos una SessionFactory la cual crea una fabrica de sesiones (buildSessionFactoy())
	private static final SessionFactory sf = buildSessionFactoy();

	private static SessionFactory buildSessionFactoy() {
		return new Configuration().configure().buildSessionFactory();
	}
	
	//Obtener las Sessiones o conexiones a la base de datos, 
	public static SessionFactory getSf() {
		return sf;
	}  

}
