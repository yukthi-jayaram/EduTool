/**
 * 
 */
package org.yukthi.edutool.entity;

import java.time.Year;

/**
 * @author M1019330
 *
 */
public class FeeStructure {

	private Long id;

	private String feeDescription;

	private Year acedemicYear;

	private Long fee;

	public enum PaymentPeriod {
		MONTLY, QUTERLY, HALFLY, YEARLY
	};

	private PaymentPeriod period;
	
	

}
