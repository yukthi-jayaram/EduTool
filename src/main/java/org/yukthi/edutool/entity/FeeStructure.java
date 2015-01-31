/**
 * 
 */
package org.yukthi.edutool.entity;


/**
 * @author M1019330
 *
 */
public class FeeStructure {

	private long id;

	private String feeDescription;

	private Class associatedClass;

	private int acedemicYear;

	private double fee;

	public enum PaymentPeriod {
		MONTLY, QUTERLY, HALFLY, YEARLY
	};

	private PaymentPeriod period;

}
