/**
 * 
 */
package org.yukthi.edutool.dao.hibernate;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;
import org.yukthi.edutool.dao.AdmissionDao;
import org.yukthi.edutool.entity.Admission;
import org.yukthi.edutool.exception.DaoException;

/**
 * @author M1019330
 *
 */
@Repository
public class AdmissionDaoImpl extends GenricDaoImpl<Admission, UUID> implements
		AdmissionDao {

	public Admission findAdmissionByStudentId(long studentId)
			throws DaoException {
		return DaoUtil.singleObject(Admission.class, template
				.findByNamedQueryAndNamedParam("findAdmissionByStudentId",
						"student", studentId));
	}

	public List<Admission> listAdmissionsForGivenAcedamicYear(
			Integer acedemicYear) throws DaoException {
		return null;
	}

	public List<Admission> listAdmissionsForGivenClass(UUID classID)
			throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<Admission> getEntityClass() {
		return Admission.class;
	}

}
