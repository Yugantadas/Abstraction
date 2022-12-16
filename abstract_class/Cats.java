package com.electroverse.abstract_class;

public class Cats extends Animals{

	public static void main(String[] args) {

		Cats c = new Cats();
		
		c.cats();
		
	}
	
	public void dogs() {}
	
	public void cats() {
		System.out.println("cats meow");
	}

}
