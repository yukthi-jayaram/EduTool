/**
 * 
 */
package org.yukthi.edutool.service.impl;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.yukthi.edutool.dao.AdmissionDao;
import org.yukthi.edutool.entity.Admission;
import org.yukthi.edutool.entity.Payment;
import org.yukthi.edutool.exception.ServiceException;
import org.yukthi.edutool.service.AdmissionService;

/**
 * @author Jayaram
 *
 */
public class AdmissionServiceImpl implements AdmissionService {
	
	@Autowired
	private AdmissionDao admissionDao;

	public void admitStudent(Admission admission) throws ServiceException {
		// TODO Auto-generated method stub
		
	}

	public void payAdmissionFee(UUID admissionID, Payment payment)
			throws ServiceException {
		// TODO Auto-generated method stub
		
	}

	public void deAbmitStudent(UUID admissionID) throws ServiceException {
		// TODO Auto-generated method stub
		
	}

	public void payAdmissionFeeDue(UUID admissionID, Payment payment)
			throws ServiceException {
		// TODO Auto-generated method stub
		
	}

}
