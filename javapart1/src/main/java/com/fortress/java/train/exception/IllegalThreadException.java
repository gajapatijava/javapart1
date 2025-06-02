package com.fortress.java.train.exception;

public class IllegalThreadException {

	public IllegalThreadException() {

	}

	public static void main(String[] args) {
		Thread obj = new Thread();
		obj.start();
		System.out.println("Hello");
		System.out.println("Hey");
		obj.start();
	}
}
