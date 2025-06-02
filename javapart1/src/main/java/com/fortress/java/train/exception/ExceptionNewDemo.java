/**
 * 
 */
package com.fortress.java.train.exception;

/**
 * 
 */
public class ExceptionNewDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			int c = 1 / 0;
		} catch (Exception e) {
//			System.out.println("Exception raised from try block");
//			e.printStackTrace();
			// name of the exception 
//			description of the exception 
//			and location at line number
			System.out.println(e.toString()); // name of the exception description of the exception
			//System.out.println(e.getMessage()); // description of the exception
			int f = 1 / 0;
		}
	}

}
