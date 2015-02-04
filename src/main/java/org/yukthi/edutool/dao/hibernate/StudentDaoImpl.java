/**
 * 
 */
package org.yukthi.edutool.dao.hibernate;

import org.springframework.stereotype.Repository;
import org.yukthi.edutool.dao.StudentDao;
import org.yukthi.edutool.entity.Student;

/**
 * @author jayaram
 *
 */
@Repository
public class StudentDaoImpl extends GenricDaoImpl<Student, Long> implements
		StudentDao {

	@Override
	protected Class<Student> getEntityClass() {
		return Student.class;
	}

}
