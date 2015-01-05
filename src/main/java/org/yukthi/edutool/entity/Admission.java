package org.yukthi.edutool.entity;

import java.time.Year;
import java.util.Date;
import java.util.Set;


public class Admission {

	private Long admissionId;
	
	private Year acedemicYear;
	
	private Date doj;
	
	private boolean rteEligibile;
	
	private Student student;
	
	private Class associatedClass;
	
	private Set<Payment> payments;
	
	public enum AdmitType {
		NEW, PROMOTED, REPEATED
	};

	
	
}
