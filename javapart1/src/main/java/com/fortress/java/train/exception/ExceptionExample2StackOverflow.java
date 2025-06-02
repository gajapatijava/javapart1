/**
 * 
 */
package com.fortress.java.train.exception;

/**
 * @author smamilla
 *
 */
public class ExceptionExample2StackOverflow {

	/**
	 * 
	 */
	public ExceptionExample2StackOverflow() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		method1();
	}

	private static void method1() {
		method1();
	}

}
