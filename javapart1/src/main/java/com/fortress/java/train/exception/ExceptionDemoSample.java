package com.fortress.java.train.exception;

/**
 * 
 * @author smamilla
 *
 */
public class ExceptionDemoSample {
  
	public static void main(String[] args) {
		int a = 10, b = 0;
		try {
			System.out.println(a/b);
		}catch (Exception e) {
			System.out.println("Error occured");
		}finally {
			System.out.println("Hiii");
		}
		System.out.println("Terminates Normally!!");
	}
}
