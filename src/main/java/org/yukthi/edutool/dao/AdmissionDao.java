/**
 * 
 */
package org.yukthi.edutool.dao;

import java.io.Serializable;
import java.util.List;

import org.yukthi.edutool.entity.Admission;
import org.yukthi.edutool.exception.DaoException;

/**
 * @author M1019330
 *
 */
public interface AdmissionDao  extends GenricDao<Admission, Long>{
	
	Admission findAdmissionByStudentId(Serializable studentId) throws DaoException;
	
	List<Admission> listAdmissionsForGivenAcedamicYear(Integer acedemicYear) throws DaoException;
	
	List<Admission> listAdmissionsForGivenClass(Serializable classID) throws DaoException;
	
	
}
