package com.darkbit.appfarquisa.util.dao;

import java.io.Serializable;
import java.util.List;

import com.darkbit.appfarquisa.util.Pagination;

public interface GenericDAO<T, Id extends Serializable> {
	
	public void save(T obj);
	
	public void delete(T obj);
	
	public T get(Id id);
	
	public List<T> getAll();
	
	public List<T> getAll(Pagination pagination);
	
	public Integer countAll();
	

}
