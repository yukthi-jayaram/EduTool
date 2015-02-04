/**
 * 
 */
package org.yukthi.edutool.service;

import org.yukthi.edutool.entity.Student;
import org.yukthi.edutool.exception.ServiceException;

/**
 * @author jayaram
 *
 */
public interface StudentService {
	
	void addStudent(Student student)throws ServiceException;

}
