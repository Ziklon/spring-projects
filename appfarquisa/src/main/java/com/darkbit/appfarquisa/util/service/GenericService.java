package com.darkbit.appfarquisa.util.service;

import java.io.Serializable;
import java.util.List;

public interface GenericService<T, Id extends Serializable> {

	public void save(T obj);

	public void delete(T obj);

	public T get(Id id);

	public List<T> getAll();

}
