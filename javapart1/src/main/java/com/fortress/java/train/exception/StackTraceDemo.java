/**
 * 
 */
package com.fortress.java.train.exception;

/**
 * @author smamilla
 *
 */
public class StackTraceDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		doStuff();
	}

	private static void doStuff() {
		doOtherStuff();
	}

	private static void doOtherStuff() {
		doMoreStuff();
	}

	private static void doMoreStuff() {
		System.out.println(1/0);
	}
}