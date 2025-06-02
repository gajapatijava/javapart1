package com.fortress.java.train.exception;

public class Exception2DemoAbnormalytermination {

	public static void main(String[] args) {
		System.out.println("SRI");
		try {
			System.out.println(10 / 0);// Abnormal termination
		} catch (ArithmeticException ex) {
			System.out.println(10 / 1);
			System.out.println("Ram");
		} finally {
			// cleanup code
		}

	}
}