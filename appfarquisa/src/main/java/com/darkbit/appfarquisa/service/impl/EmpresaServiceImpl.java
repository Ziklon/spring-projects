package com.darkbit.appfarquisa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.darkbit.appfarquisa.dao.EmpresaDao;
import com.darkbit.appfarquisa.domain.Empresa;
import com.darkbit.appfarquisa.service.EmpresaService;
import com.darkbit.appfarquisa.util.Pagination;

@Service
@Transactional(readOnly = true)
public class EmpresaServiceImpl implements EmpresaService {

	@Autowired
	private EmpresaDao empresaDao;

	@Transactional(readOnly=false)
	public void save(Empresa obj) {
		empresaDao.save(obj);
	}

	@Transactional(readOnly=false)
	public void delete(Empresa obj) {
		empresaDao.delete(obj);
	}

	public Empresa get(Integer id) {
		return empresaDao.get(id);
	}

	public List<Empresa> getAll() {
		return empresaDao.getAll();
	}

	public List<Empresa> getAll(Pagination pagination) {
		return empresaDao.getAll(pagination);
	}

}
