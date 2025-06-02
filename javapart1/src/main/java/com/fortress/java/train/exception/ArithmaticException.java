/**
 * 
 */
package com.fortress.java.train.exception;

/**
 * @author smamilla
 *
 */
public class ArithmaticException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		 0/1 --> 0
//		 1/1 --> 1
//		 2/1 --> 2
//		 1/0 --> infinity
		try {
			System.out.println(1/0);
		}catch (Exception e) {
			System.out.println("Got the error cause / by zero");
		}
		System.out.println("Program terminates now gracefully");
	}

}
