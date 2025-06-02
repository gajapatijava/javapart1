/**
 * 
 */
package com.fortress.java.train.exception;

/**
 * @author smamilla
 *
 */
public class Exception2Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("SRI");
		try {
			System.out.println(10 / 0);// risky code
		} catch (Exception ex) {
			System.out.println(10 / 1);// handle code
			System.out.println("Ram");

		}

	}
}