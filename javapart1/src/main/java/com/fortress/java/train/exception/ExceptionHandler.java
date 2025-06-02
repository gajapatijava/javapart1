/**
 * 
 */
package com.fortress.java.train.exception;

/**
 * @author smamilla
 *
 */
public class ExceptionHandler {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			System.out.println("STAT1");
			System.out.println("STAT2");
			System.out.println("STAT3");
		} catch (Exception ex) {
			System.out.println("STAT4");
		}
		System.out.println("STAT5");
	}

}
