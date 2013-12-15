package com.darkbit.appfarquisa.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.darkbit.appfarquisa.dao.EmpleadoDao;
import com.darkbit.appfarquisa.domain.Empleado;
import com.darkbit.appfarquisa.util.dao.impl.GenericDAOImpl;

@Repository
public class EmpleadoDaoImpl extends GenericDAOImpl<Empleado, Integer> implements EmpleadoDao{

	@Autowired
	public EmpleadoDaoImpl(SessionFactory sessionFactory) {
		super(sessionFactory);
	}
	


}
