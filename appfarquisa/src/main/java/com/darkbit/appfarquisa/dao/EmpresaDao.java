package com.darkbit.appfarquisa.dao;


import java.util.List;

import com.darkbit.appfarquisa.domain.Empresa;
import com.darkbit.appfarquisa.domain.Sede;
import com.darkbit.appfarquisa.util.dao.GenericDAO;

public interface EmpresaDao extends GenericDAO<Empresa, Integer> {

	public List<Empresa> getBySede(Sede sede);
	
}
