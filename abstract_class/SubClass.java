package com.electroverse.abstract_class;

public class SubClass extends SuperClass {

	public static void main(String[] args) {

		SubClass sc = new SubClass();
		
		sc.a_Method();
		sc.method();
		
	}
	
	public void a_Method() {
		System.out.println("this is abstract method");
	}

}
