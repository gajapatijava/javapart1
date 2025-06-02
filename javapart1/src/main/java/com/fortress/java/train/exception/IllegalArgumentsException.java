/**
 * 
 */
package com.fortress.java.train.exception;

/**
 * @author smamilla
 *
 */
public class IllegalArgumentsException {

	/**
	 * 
	 */
	public IllegalArgumentsException() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread t = new Thread();
		t.setPriority(0);
//		t.setPriority(11);
		System.out.println("No Issues");
	}

}
