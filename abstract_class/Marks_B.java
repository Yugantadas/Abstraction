package com.electroverse.abstract_class;

public class Marks_B {
	
	int subject1;
	int subject2;
	int subject3;
	int subject4;
	
	public Marks_B(int s1, int s2, int s3, int s4) {
		subject1=s1;
		subject2=s2;
		subject3=s3;
		subject4=s4;
	}
	
	public String getPercentage() {
		return "English = "+subject1+" Maths = "+subject2+" Physics = "+subject3+" Computer = "+subject4;
	}

	public static void main(String[] args) {
		
		Marks_B mb = new Marks_B(69,69,81,95);
		
		System.out.println(mb.getPercentage());
		
	}

}
