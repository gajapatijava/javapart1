/**
 * 
 */
package com.fortress.java.train.exception;

/**
 * @author smamilla
 *
 */
public class SubWithAcessSpecifier extends SuperWithAcessSpecifier {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SubWithAcessSpecifier obj = new SubWithAcessSpecifier();
		obj.display();
	}
	
	protected void display() {
		System.out.println("Hello I am from super class");
	}

}
