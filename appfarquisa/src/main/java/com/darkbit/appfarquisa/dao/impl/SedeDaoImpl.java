package com.darkbit.appfarquisa.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.darkbit.appfarquisa.dao.SedeDao;
import com.darkbit.appfarquisa.domain.Sede;
import com.darkbit.appfarquisa.util.dao.impl.GenericDAOImpl;

@Repository
public class SedeDaoImpl extends GenericDAOImpl<Sede, Integer> implements
		SedeDao {

	@Autowired
	public SedeDaoImpl(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

}
