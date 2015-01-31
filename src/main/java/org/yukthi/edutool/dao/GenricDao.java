package org.yukthi.edutool.dao;

import java.io.Serializable;

import org.yukthi.edutool.exception.DaoException;

interface GenricDao<T, S extends Serializable> {

	void create(T object) throws DaoException;

	T get(Class<T> typeOfClass, S id) throws DaoException;

	void update(T object) throws DaoException;

	void delete(T object) throws DaoException;

}