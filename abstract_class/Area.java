package com.electroverse.abstract_class;

import java.util.Scanner;

public class Area extends Shape {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter length and breadth for a rectangle in decimal format");
			System.out.println("enter length");
			double l=sc.nextDouble();
			System.out.println("enter breadth");
			double b=sc.nextDouble();

			
			System.out.println("enter side for square");
			double s=sc.nextDouble();
			
			
			System.out.println("enter radius of a circle");
			double r=sc.nextDouble();
			
			Area A = new Area();
			
			System.out.println("Area of the Rectangle = "+A.rectangleArea(l, b));
			System.out.println("Area of the Square = "+A.squareArea(s));
			System.out.println("Area of the Circle = "+A.circleArea(r));
		}

		
	}
	
	public double rectangleArea(double l,double b) {
		return l*b;
	}
	
	public double squareArea(double s) {
		return s*s;
	}
	
	public double circleArea(double r) {
		return 3.14*r*r;
	}

}
