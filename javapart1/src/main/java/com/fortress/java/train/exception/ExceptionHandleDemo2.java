/**
 * 
 */
package com.fortress.java.train.exception;

/**
 * @author smamilla
 *
 */
public class ExceptionHandleDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Sai");   // Sai
		try {
			System.out.println(20/0);  // / by zero exception object 
          }catch(Exception ex) {
        	  ex.printStackTrace();
        	  System.out.println(20/1);   // 20
        	  System.out.println("Sree Sai"); // sree Sai
          }
		System.out.println("Jai Sri Ram!!");  // Jai Sri Ram!!
	}
}