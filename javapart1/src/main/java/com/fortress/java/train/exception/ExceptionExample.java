package com.fortress.java.train.exception;

public class ExceptionExample {

	public ExceptionExample() {
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
//case1
		String s = new String("sai");
		Object o = (Object) s;
		System.out.println(o);
		// case 2
		Object o1 = new String("sai");
		String s1 = (String) o1;
		System.out.println();
		// case 3
		Object o2 = new Object();
		String s2 = (String) o2;
		System.out.println();
	}

	@SuppressWarnings("null")
	public static void main1(String[] args) {
		String s = null;
		System.out.println(s.length());

	}

}