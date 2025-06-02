/**
 * 
 */
package com.fortress.java.train.exception;

/**
 * @author smamilla
 *
 */
public class NumberFormatException {

	/**
	 * 
	 */
	public NumberFormatException() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int s = Integer.parseInt("sri");
		System.out.println(s);
	}
}
