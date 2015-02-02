/**
 * 
 */
package org.yukthi.edutool.dao.hibernate;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.yukthi.edutool.dao.GenricDao;
import org.yukthi.edutool.exception.DaoException;

/**
 * @author M1019330
 *
 */
public abstract class GenricDaoImpl<T, S extends Serializable> implements
		GenricDao<T, S> {

	@Autowired
	protected HibernateTemplate template;

	public void create(T object) throws DaoException {
		template.persist(object);
	}

	public T get(S id) throws DaoException {
		return template.load(getEntityClass(), id);
	}

	public void update(T object) throws DaoException {
		template.merge(object);
	}

	public void delete(T object) throws DaoException {
		template.delete(object);
	}

	public List<T> getAll() throws DaoException {
		return template.loadAll(getEntityClass());
	}

	
	protected abstract Class<T> getEntityClass();

}
