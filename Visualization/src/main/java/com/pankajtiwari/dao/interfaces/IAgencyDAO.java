package com.pankajtiwari.dao.interfaces;

import java.util.List;

import com.pankajtiwari.dao.entities.Agency;

/**
 * @author pankajtiwari
 */
public interface IAgencyDAO {

	/**
	 * @return
	 * @throws RuntimeException
	 */
	List<Agency> fetchAllAgencies() throws RuntimeException;
}
