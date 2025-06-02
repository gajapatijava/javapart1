package com.fortress.java.train.exception;

public class ExplicitExceptionDemo {

	private int age;

	public ExplicitExceptionDemo() {
	}

	/**
	 * @param age
	 */
	public ExplicitExceptionDemo(int age) {
		super();
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void performLogic() throws UserDefinedException {
		if (age < 0)
			throw new UserDefinedException("Age Can't be Negative");
		else
			System.out.println(age);
	}

	public static void main(String[] args) throws UserDefinedException {
		ExplicitExceptionDemo obj1 = new ExplicitExceptionDemo(12);
		obj1.performLogic();
		ExplicitExceptionDemo obj2 = new ExplicitExceptionDemo(-12);
		obj2.performLogic();
	}

}
