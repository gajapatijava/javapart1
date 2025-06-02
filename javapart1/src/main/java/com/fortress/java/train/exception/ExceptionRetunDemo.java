/**
 * 
 */
package com.fortress.java.train.exception;

/**
 * @author smamilla
 *
 */
public class ExceptionRetunDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExceptionRetunDemo obj = new ExceptionRetunDemo();
		System.out.println(obj.display());
	}

	public int display() {
		try {
			int a = 12 / 0;// Arithmetic exception is raised and first print the finally block and print
							// exception -1,
			return 1;
		} catch (Exception e) {
			return -10;
		} finally {
			System.out.println("Fom finally block");
		}
	}
}