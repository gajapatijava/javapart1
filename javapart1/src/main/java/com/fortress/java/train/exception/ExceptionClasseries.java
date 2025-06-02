package com.fortress.java.train.exception;

public class ExceptionClasseries {

	public ExceptionClasseries() {

	}

	public static void main(String[] args) {
		try {
			args = null;
			@SuppressWarnings("null")
			int b = args.length;
			System.out.println("b=" + b);
			int a = 10;
			int c = a / b;
			System.out.println(c);
			int arr[] = { 10, 20, 30 };
			arr[4] = 50;
		} catch (ArithmeticException ae) {
			System.out.println(ae);
			System.out.println("Arithmetic exception");
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println(ae);
			System.out.println("Array Exception");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Exceptiuon");
		} catch (Throwable e) {
			System.out.println(e);
			System.out.println("exception");
		} finally {
			System.out.println("Finally block statement");

		}
	}

}
