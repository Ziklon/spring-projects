package com.darkbit.appfarquisa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.darkbit.appfarquisa.dao.SedeDao;
import com.darkbit.appfarquisa.domain.Sede;
import com.darkbit.appfarquisa.service.SedeService;
import com.darkbit.appfarquisa.util.Pagination;

@Transactional(readOnly = true)
@Service
public class SedeServiceImpl implements SedeService {

	@Autowired
	private SedeDao sedeDao;

	@Transactional(readOnly = false)
	public void save(Sede obj) {
		sedeDao.save(obj);
	}

	@Transactional(readOnly = false)
	public void delete(Sede obj) {
		sedeDao.delete(obj);
	}

	public Sede get(Integer id) {
		return sedeDao.get(id);
	}

	public List<Sede> getAll() {
		return sedeDao.getAll();
	}

	public List<Sede> getAll(Pagination pagination) {
		return sedeDao.getAll(pagination);
	}

}
