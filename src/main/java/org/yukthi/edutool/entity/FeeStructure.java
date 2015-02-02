/**
 * 
 */
package org.yukthi.edutool.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

/**
 * @author Jayaram Raju
 *
 */
@Entity
public class FeeStructure {

	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(columnDefinition = "BINARY(16)")
	@Id
	private UUID id;

	private String feeDescription;

	@ManyToOne(fetch = FetchType.LAZY)
	private Class associatedClass;

	private int acedemicYear;

	private double fee;

	public enum PaymentPeriod {
		MONTLY, QUTERLY, HALFLY, YEARLY
	};

	private PaymentPeriod period;

	
	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getFeeDescription() {
		return feeDescription;
	}

	public void setFeeDescription(String feeDescription) {
		this.feeDescription = feeDescription;
	}

	public Class getAssociatedClass() {
		return associatedClass;
	}

	public void setAssociatedClass(Class associatedClass) {
		this.associatedClass = associatedClass;
	}

	public int getAcedemicYear() {
		return acedemicYear;
	}

	public void setAcedemicYear(int acedemicYear) {
		this.acedemicYear = acedemicYear;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public PaymentPeriod getPeriod() {
		return period;
	}

	public void setPeriod(PaymentPeriod period) {
		this.period = period;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		FeeStructure other = (FeeStructure) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
