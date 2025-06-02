/**
 * 
 */
package com.fortress.java.train.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 
 */
public class CheckedExceptionNewDemo {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream fileHanlde = new FileInputStream("file");
	}

}
