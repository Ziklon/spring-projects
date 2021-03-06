package com.darkbit.appfarquisa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.darkbit.appfarquisa.dao.EmpleadoDao;
import com.darkbit.appfarquisa.domain.Empleado;
import com.darkbit.appfarquisa.service.EmpleadoService;
import com.darkbit.appfarquisa.util.Pagination;

@Service
@Transactional(readOnly = true)
public class EmpleadoServiceImpl implements EmpleadoService {

	@Autowired
	private EmpleadoDao empleadoDao;

	@Transactional(readOnly = false)
	public void save(Empleado obj) {
		empleadoDao.save(obj);
	}

	@Transactional(readOnly = false)
	public void delete(Empleado obj) {
		empleadoDao.delete(obj);
	}

	public Empleado get(Integer id) {
		return empleadoDao.get(id);
	}

	public List<Empleado> getAll() {
		return empleadoDao.getAll();
	}

	public List<Empleado> getAll(Pagination pagination) {
		return empleadoDao.getAll(pagination);
	}

}
