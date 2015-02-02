/**
 * 
 */
package org.yukthi.edutool.dao;

import java.util.List;
import java.util.UUID;

import org.yukthi.edutool.entity.Admission;
import org.yukthi.edutool.exception.DaoException;

/**
 * @author M1019330
 *
 */
public interface AdmissionDao  extends GenricDao<Admission, UUID>{
	
	Admission findAdmissionByStudentId(long studentId) throws DaoException;
	
	List<Admission> listAdmissionsForGivenAcedamicYear(Integer acedemicYear) throws DaoException;
	
	List<Admission> listAdmissionsForGivenClass(UUID classID) throws DaoException;
	
	
}
