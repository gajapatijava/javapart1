package com.fortress.java.train.exception;

public class FinalKeyWord {// If Kept Final keyword before class that class not extend a class//

	static int a=10;	// if kept final keyword before variable that variable should be consatant//
	
	 public FinalKeyWord() {
		
	}
	public static void main(String []args) { // if kept keyword before method that method should not be ovveride// 
		System.out.println(a++);
		System.out.println(a);
	}
}
