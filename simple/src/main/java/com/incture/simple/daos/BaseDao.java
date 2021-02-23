package com.incture.simple.daos;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.StatelessSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.incture.simple.dtos.BaseDto;
import com.incture.simple.entities.BaseDo;

public abstract class BaseDao<E extends BaseDo, D extends BaseDto> {

	@Autowired
	private SessionFactory sessionFactory;

	// Connection
	public Session getSession() {
		try {
			return sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
			return sessionFactory.openSession();
		}
	}

	public StatelessSession getStatelessSession() {
		return sessionFactory.openStatelessSession();
	}

	protected abstract E importDto(D fromDto);

	protected abstract D exportDto(E entity);

}