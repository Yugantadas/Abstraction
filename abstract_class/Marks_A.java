package com.electroverse.abstract_class;

public class Marks_A {
	
	int subject1;
	int subject2;
	int subject3;
	
	public Marks_A(int s1, int s2, int s3) {
		subject1=s1;
		subject2=s2;
		subject3=s3;
	}
	
	public String getPercentage() {
		
		return "Computer = "+subject1+" Maths = "+subject2+" Physics = "+subject3;

	}

	public static void main(String[] args) {
		
		Marks_A mb = new Marks_A(81,59,81);
		
		System.out.println(mb.getPercentage());
		
	}

}
