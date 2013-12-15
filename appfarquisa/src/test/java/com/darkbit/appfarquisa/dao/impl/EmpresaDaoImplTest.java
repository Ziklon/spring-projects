package com.darkbit.appfarquisa.dao.impl;

import org.hibernate.Session;
import org.junit.BeforeClass;
import org.junit.Test;

import com.darkbit.appfarquisa.domain.Empresa;
import com.darkbit.appfarquisa.util.dao.impl.HibernateUtil;

public class EmpresaDaoImplTest {

	private Session session;
	
	@BeforeClass
	public void setUp(){
		session=HibernateUtil.getSessionFactory().getCurrentSession();		
	}
	
	
	@Test
	public void testAddNewEmpresa(){
		Empresa empresa=new Empresa();
		empresa.setDescripcion("direccion 1");	
	}

}
