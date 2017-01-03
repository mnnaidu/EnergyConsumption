package com.oroprise.enc.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

public abstract class AbstractDao<T extends Serializable, K> {

	private static final Logger logger = Logger.getLogger(AbstractDao.class.getName());
	
	private Class<T> entityClzz;

	public void create(T t) {
	}

	public void update(T t, K... key) {
	}

	public List<T> getAll() {
		return new ArrayList<T>();
	}

	public T get(K key) {
		return null;
	}

	public void delete(K key) {
	}
	
	


	protected void setEntityClzz(Class<T> clz) {
		this.entityClzz = clz;
	}
	
	public abstract Class<T> getEntityClzz();

}
