/**
 * 
 */
package com.fortress.java.train.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * @author smamilla
 *
 */
public class ExceptionTypes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
		} catch (ArithmeticException ex) {
			// handle code;
		} catch (FileNotFoundException ex) {
			// Handle code;
		} catch (Exception ex) {
			// handle code;
		} finally {
			// cleanup code;
		}
	}

}
