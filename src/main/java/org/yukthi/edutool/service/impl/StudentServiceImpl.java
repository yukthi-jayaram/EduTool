/**
 * 
 */
package org.yukthi.edutool.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.yukthi.edutool.dao.StudentDao;
import org.yukthi.edutool.entity.Student;
import org.yukthi.edutool.exception.DaoException;
import org.yukthi.edutool.exception.ServiceException;
import org.yukthi.edutool.service.StudentService;

/**
 * @author jayaram
 *
 */
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.yukthi.edutool.service.StudentService#addStudent(org.yukthi.edutool
	 * .entity.Student)
	 */
	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void addStudent(Student student) throws ServiceException {
		try {
			studentDao.create(student);
		} catch (DaoException e) {
			throw new ServiceException(e);
		}
	}

}
