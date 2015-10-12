/**
 * 
 */
package com.pankajtiwari.dao.interfaces;

import org.hibernate.Session;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author pankajtiwari
 */
@Transactional
public interface IBaseDAO {

	/**
	 * @return
	 * @throws RuntimeException
	 */
	Session getSession() throws RuntimeException;
}
