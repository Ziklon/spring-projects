package com.darkbit.appfarquisa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.darkbit.appfarquisa.dao.RolDao;
import com.darkbit.appfarquisa.domain.Rol;
import com.darkbit.appfarquisa.service.RolService;
import com.darkbit.appfarquisa.util.Pagination;

@Service
@Transactional(readOnly=true)
public class RolServiceImpl implements RolService {

	@Autowired
	private RolDao rolDao;

	@Transactional(readOnly=false)
	public void save(Rol obj) {
		rolDao.save(obj);
	}

	@Transactional(readOnly=false)
	public void delete(Rol obj) {
		rolDao.delete(obj);
	}

	public Rol get(Integer id) {
		return rolDao.get(id);
	}

	public List<Rol> getAll() {
		return rolDao.getAll();
	}

	public List<Rol> getAll(Pagination pagination) {
		return rolDao.getAll(pagination);
	}

}
