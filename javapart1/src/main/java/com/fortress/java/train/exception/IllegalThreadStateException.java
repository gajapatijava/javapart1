/**
 * 
 */
package com.fortress.java.train.exception;

/**
 * @author smamilla
 *
 */
public class IllegalThreadStateException {

	/**
	 * 
	 */
	public IllegalThreadStateException() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread t = new Thread();
		t.start();
		System.out.println("Hello");
		System.out.println("Hai");
		t.start();
	}

}
