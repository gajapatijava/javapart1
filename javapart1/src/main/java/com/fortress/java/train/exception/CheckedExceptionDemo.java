/**
 * 
 */
package com.fortress.java.train.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author smamilla
 *
 */
public class CheckedExceptionDemo {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		String fileName = "";
		 FileInputStream fileHanlde = new FileInputStream(fileName);
	}

}
