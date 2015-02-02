package org.yukthi.edutool.entity;

import java.util.Date;
import java.util.Set;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

@Entity
@NamedQueries(value={
@NamedQuery(name="findAdmissionByStudentId",query="from Admission a where a.student = :student") 
})

public class Admission {

	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(columnDefinition = "BINARY(16)")
	@Id
	private UUID admissionId;

	private boolean active;

	private int acedemicYear;

	private Date doj;

	private double rteDiscount;

	@ManyToOne(fetch = FetchType.LAZY)
	private Student student;

	@ManyToOne(fetch = FetchType.LAZY)
	private Class associatedClass;

	@OneToMany(mappedBy = "admission", fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	private Set<Payment> payments;

	public enum AdmitType {
		NEW, PROMOTED, REPEATED
	}

	public UUID getAdmissionId() {
		return admissionId;
	}

	public void setAdmissionId(UUID admissionId) {
		this.admissionId = admissionId;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public int getAcedemicYear() {
		return acedemicYear;
	}

	public void setAcedemicYear(int acedemicYear) {
		this.acedemicYear = acedemicYear;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public double getRteDiscount() {
		return rteDiscount;
	}

	public void setRteDiscount(double rteDiscount) {
		this.rteDiscount = rteDiscount;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Class getAssociatedClass() {
		return associatedClass;
	}

	public void setAssociatedClass(Class associatedClass) {
		this.associatedClass = associatedClass;
	}

	public Set<Payment> getPayments() {
		return payments;
	}

	public void setPayments(Set<Payment> payments) {
		this.payments = payments;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((admissionId == null) ? 0 : admissionId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Admission other = (Admission) obj;
		if (admissionId == null) {
			if (other.admissionId != null)
				return false;
		} else if (!admissionId.equals(other.admissionId))
			return false;
		return true;
	}

}
