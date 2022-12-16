package com.electroverse.abstract_class;

public class BankC extends Bank{
	
	public int getBalance() {
		return 200;
	}
	
	public static void main(String[] args) {
		BankC c = new BankC();
		System.out.println(c.getBalance());
	}

}
