/**
 * 
 */
package com.fortress.java.train.exception;

/**
 * @author smamilla
 *
 */
public class SubWithException extends SuperWithException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SubWithException obj = new SubWithException();
		obj.display();
	}
	
	protected void display() throws ArithmeticException{
		System.out.println("Hello I am from super class");
	}

}
