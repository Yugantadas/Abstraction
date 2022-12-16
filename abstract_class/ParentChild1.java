package com.electroverse.abstract_class;
public class ParentChild1 {
	public void message() {
		System.out.println("this is first subclass");
	}
	public static void main(String[] args) {
		ParentChild1 ch=new ParentChild1();
		ch.message();
	}
}
