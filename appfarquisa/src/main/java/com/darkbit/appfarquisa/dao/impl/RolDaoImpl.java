package com.darkbit.appfarquisa.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.darkbit.appfarquisa.dao.RolDao;
import com.darkbit.appfarquisa.domain.Rol;
import com.darkbit.appfarquisa.util.dao.impl.GenericDAOImpl;
@Repository
public class RolDaoImpl  extends GenericDAOImpl<Rol, Integer> implements RolDao {

	@Autowired
	public RolDaoImpl(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

		

}
