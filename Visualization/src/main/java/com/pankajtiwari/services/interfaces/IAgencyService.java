package com.pankajtiwari.services.interfaces;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.pankajtiwari.dao.entities.Agency;

/**
 * @author pankajtiwari
 */
@Transactional
public interface IAgencyService {

	/**
	 * @return
	 * @throws RuntimeException
	 */
	List<Agency> fetchAllAgencies() throws RuntimeException;
}
