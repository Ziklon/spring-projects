package com.darkbit.appfarquisa.util.dao.impl;

import java.math.BigDecimal;

import org.hibernate.Session;

import com.darkbit.appfarquisa.domain.Sede;

public class App {

	public static void main(String[] args) {
		System.out.println("Maven + Hibernate + MySQL");
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();
		Sede sede = new Sede();
		sede.setDescripcion("descripcion 1");
		sede.setDireccion("direccion 1");
		session.save(sede);

		session.getTransaction().commit();

	}

}
