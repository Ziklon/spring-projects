package com.darkbit.appfarquisa.util.dao;

import java.io.Serializable;
import java.util.List;

public interface GenericDAO<T, Id extends Serializable> {
	
	public void save(T obj);
	
	public void delete(T obj);
	
	public T get(Id id);
	
	public List<T> getAll();
	
	

}
