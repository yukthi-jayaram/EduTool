/**
 * 
 */
package org.yukthi.edutool.service;

import java.util.UUID;

import org.yukthi.edutool.entity.Admission;
import org.yukthi.edutool.entity.Payment;
import org.yukthi.edutool.exception.ServiceException;

/**
 * @author M1019330
 *
 */
public interface AdmissionService {

	void admitStudent(Admission admission )throws ServiceException;
	
	void payAdmissionFee(UUID admissionID , Payment payment)throws ServiceException;
	
	void deAbmitStudent(UUID admissionID)throws ServiceException;
	
	void payAdmissionFeeDue(UUID admissionID , Payment payment)throws ServiceException;
	
}
