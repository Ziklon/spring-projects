package com.darkbit.appfarquisa.util.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.springframework.transaction.annotation.Transactional;

import com.darkbit.appfarquisa.util.Pagination;

public abstract class GenericDAOImpl<T, Id extends Serializable> {

	protected SessionFactory sessionFactory;
	private Class<T> classObj;

	public GenericDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
		this.classObj = (Class<T>) ((ParameterizedType) getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0];
	}

	public void save(T obj) {
		sessionFactory.getCurrentSession().saveOrUpdate(obj);
	}

	public void delete(T obj) {
		sessionFactory.getCurrentSession().delete(obj);
	}

	@SuppressWarnings("unchecked")
	public T get(Id id) {
		return (T) sessionFactory.getCurrentSession().get(classObj, id);
	}

	@SuppressWarnings("unchecked")
	public List<T> getAll() {
		List<T> list = (List<T>) sessionFactory.getCurrentSession()
				.createQuery("from " + classObj.getSimpleName()).list();
		return list;
	}

	@SuppressWarnings("unchecked")
	public List<T> getAll(Pagination pagination) {
		if (pagination == null)
			return getAll();
		String hql = "from " + classObj.getSimpleName();
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setFirstResult(pagination.getStart());
		query.setMaxResults(pagination.getLimit());
		if (pagination.getTotalCount() == 0)
			pagination.setTotalCount(countAll());
		return query.list();
	}

	public Long countAll() {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(classObj);
		criteria.setProjection(Projections.rowCount());
		return Long.valueOf(criteria.uniqueResult().toString());
		
	}

}
