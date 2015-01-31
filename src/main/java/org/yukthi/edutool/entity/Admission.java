package org.yukthi.edutool.entity;

import java.time.Year;
import java.util.Date;
import java.util.Set;


public class Admission {

	private long admissionId;
	
	private boolean active;
	
	private int acedemicYear;
	
	private Date doj;
	
	private double rteDiscount;
	
	private Student student;
	
	private Class associatedClass;
	
	private Set<Payment> payments;
	
	public enum AdmitType {
		NEW, PROMOTED, REPEATED
	};

	
}
