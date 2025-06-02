/**
 * 
 */
package com.fortress.java.train.exception;

/**
 * @author smamilla
 *
 */
public class ThroDemo {

	private static ArithmeticException ex = new ArithmeticException();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		throw ex;
	}

}
