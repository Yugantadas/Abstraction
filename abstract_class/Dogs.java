package com.electroverse.abstract_class;

public class Dogs extends Animals{

	public static void main(String[] args) {

		Dogs c = new Dogs();
		
		c.dogs();
		
	}
	
	public void dogs() {
		System.out.println("dogs bark");

	}
	
	public void cats() {}

}
