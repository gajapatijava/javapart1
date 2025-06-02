/**
 * 
 */
package com.fortress.java.train.exception;

/**
 * @author smamilla
 *
 */
public class AIOBExceptionIndexoutofbounds {
	public AIOBExceptionIndexoutofbounds() {

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] x = new int[3];
		System.out.println(x[0]);
		System.out.println(x[4]);
	}

}