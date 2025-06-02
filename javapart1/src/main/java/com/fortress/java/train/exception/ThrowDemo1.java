/**
 * 
 */
package com.fortress.java.train.exception;

/**
 * @author smamilla
 *
 */
public class ThrowDemo1 {
	private static ArithmeticException ex = null;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		throw ex;
	}

	public static void main1(String[] args) {
		Printwriter pw = new Printwriter();
	}
}