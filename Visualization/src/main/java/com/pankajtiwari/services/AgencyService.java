package com.pankajtiwari.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pankajtiwari.dao.entities.Agency;
import com.pankajtiwari.dao.interfaces.IAgencyDAO;
import com.pankajtiwari.services.interfaces.IAgencyService;

/**
 * @author pankajtiwari
 */
@Component("agencyService")
@Scope("prototype")
@Transactional
public class AgencyService implements IAgencyService {
	
	@Autowired
	private IAgencyDAO agencyDAO;

	/* (non-Javadoc)
	 * @see com.pankajtiwari.services.interfaces.IAgencyService#fetchAllAgencies()
	 */
	public List<Agency> fetchAllAgencies() throws RuntimeException {
		return agencyDAO.fetchAllAgencies();
	}

}
