/**
 * 
 */
package com.fortress.java.train.exception;

/**
 * @author smamilla
 *
 */
public class ExceptionHandleDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        int i = 0;
		try {
        	// Risky code
        	i = 12/0;
          }catch(Exception ex) {
        	  i = -1;
        	  System.out.println(ex.getMessage());
          }
		System.out.println("Program terminates now gracefully");
       System.out.println(i);
	}

}
