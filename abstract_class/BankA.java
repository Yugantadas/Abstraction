package com.electroverse.abstract_class;

public class BankA {
	
	public int getBalance() {
		return 100;
	}
	
	public static void main(String[] args) {
		BankA a = new BankA();
		System.out.println(a.getBalance());
	}

}