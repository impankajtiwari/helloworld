package com.pankajtiwari.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pankajtiwari.dao.interfaces.IBaseDAO;

/**
 * @author pankajtiwari
 */
@Repository("baseDAO")
public class BaseDAO implements IBaseDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public Session getSession() throws RuntimeException{
		if(sessionFactory!=null){
			System.out.println(sessionFactory);
			return sessionFactory.getCurrentSession();
		}else{
			throw new RuntimeException("DB Error: Database session not available");
		}
	}

}
