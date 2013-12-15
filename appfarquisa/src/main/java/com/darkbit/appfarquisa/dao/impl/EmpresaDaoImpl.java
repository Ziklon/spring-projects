package com.darkbit.appfarquisa.dao.impl;



import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.darkbit.appfarquisa.dao.EmpresaDao;
import com.darkbit.appfarquisa.domain.Empresa;
import com.darkbit.appfarquisa.domain.Sede;
import com.darkbit.appfarquisa.util.dao.impl.GenericDAOImpl;
@Repository
public class EmpresaDaoImpl extends GenericDAOImpl<Empresa, Integer> implements EmpresaDao {

	@Autowired
	public EmpresaDaoImpl(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	public List<Empresa> getBySede(Sede sede) {
		return null;
	}

}
