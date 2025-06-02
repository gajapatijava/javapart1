/**
 * 
 */
package com.fortress.java.train.exception;

/**
 * @author smamilla
 *
 */
public class ExceptionImpl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	@SuppressWarnings("finally")
	public int method() {
		try {
			return 77;
		} catch (Exception ex) {
			return 777;
		} finally {
			return 7777;
		}
	}
}