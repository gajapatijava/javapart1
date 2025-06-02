/**
 * 
 */
package com.fortress.java.train.exception;

/**
 * @author smamilla
 *
 */
public class NullPointerException {

	/**
	 * 
	 */
	public NullPointerException() {
	}
	static String s;
	static {
		s = null;
//		System.out.println(s.length());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		s = "null";
		System.out.println(s.length());
	}

}
