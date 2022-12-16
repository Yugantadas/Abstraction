package com.electroverse.abstract_class;

public class BankB {
	
	public int getBalance() {
		return 150;
	}
	
	public static void main(String[] args) {
		BankB b = new BankB();
		System.out.println(b.getBalance());
	}

}