package com.darkbit.appfarquisa.service;

import java.util.List;

import com.darkbit.appfarquisa.domain.Empresa;
import com.darkbit.appfarquisa.domain.Sede;
import com.darkbit.appfarquisa.util.service.GenericService;

public interface EmpresaService extends GenericService<Empresa, Integer> {
	
	
	
	public List<Empresa> findBySede(Sede sede);
	
	

}
