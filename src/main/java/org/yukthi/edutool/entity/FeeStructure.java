/**
 * 
 */
package org.yukthi.edutool.entity;


/**
 * @author M1019330
 *
 */
public class FeeStructure {

	private Long id;

	private String feeDescription;

	private Class associatedClass;

	private Integer acedemicYear;

	private Long fee;

	public enum PaymentPeriod {
		MONTLY, QUTERLY, HALFLY, YEARLY
	};

	private PaymentPeriod period;

}
