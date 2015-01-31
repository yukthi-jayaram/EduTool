/**
 * 
 */
package org.yukthi.edutool.exception;

/**
 * @author M1019330
 *
 */
public class DaoException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public DaoException() {
	}

	/**
	 * @param arg0
	 */
	public DaoException(String arg0) {
		super(arg0);
	}

	/**
	 * @param cause
	 */
	public DaoException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public DaoException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public DaoException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
