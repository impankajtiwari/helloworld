package com.pankajtiwari.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.pankajtiwari.dao.entities.Agency;
import com.pankajtiwari.dao.interfaces.IAgencyDAO;

/**
 * @author pankajtiwari
 */
@Repository("agencyDAO")
public class AgencyDAO extends BaseDAO implements IAgencyDAO {

	private static final long serialVersionUID = 352701100766695763L;

	/* (non-Javadoc)
	 * @see com.pankajtiwari.dao.interfaces.IAgencyDAO#fetchAllAgencies()
	 */
	public List<Agency> fetchAllAgencies() throws RuntimeException {
		List<Agency> result = null;
		String hql = "";
		Session session = getSession();
		try{
			hql=" FROM Agency";
			result = (List<Agency>)session.createQuery(hql).list();
		}catch(RuntimeException re){
			throw re;
		}
		return result;
	}

}
