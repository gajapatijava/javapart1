package com.fortress.java.train.exception;

public class ArithamaticExceptionDemo {

	public static void main(String[] args) {
		dostuff();

	}

	private static void dostuff() {
		domorestuff();

	}

	private static void domorestuff() {
		try {
			System.out.println(10 / 0);
		} catch (Exception obj) {
			obj.printStackTrace();
			System.out.println(obj.getMessage());// get message get only description of exception
			System.out.println(obj.toString());// toString get name,description and location of exception
		}
		System.out.println("HAI");

	}

}
