/**
 * 
 */
package com.fortress.java.train.exception;

/**
 * @author smamilla
 *
 */
public class UserDefinedException1 extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserDefinedException1() {
		super();
	}

	public UserDefinedException1(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public UserDefinedException1(String message, Throwable cause) {
		super(message, cause);
	}

	public UserDefinedException1(String message) {
		super(message);
	}

	public UserDefinedException1(Throwable cause) {
		super(cause);
	}
}