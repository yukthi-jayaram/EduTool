package org.yukthi.edutool.dao;

import java.io.Serializable;
import java.util.List;

import org.yukthi.edutool.exception.DaoException;

public interface GenricDao<T, S extends Serializable> {

	void create(T object) throws DaoException;

	T get(S id) throws DaoException;

	void update(T object) throws DaoException;

	void delete(T object) throws DaoException;
	
	List<T> getAll() throws DaoException;

}