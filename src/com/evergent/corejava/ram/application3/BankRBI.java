package com.evergent.corejava.ram.application3;

public class BankRBI {
	static {
		System.out.println("Welcome to Employee details");
	}
	public BankRBI() {
		System.out.println("RBI Loan home loan and personal loan interest");
	}
	public BankRBI(double p,double r) {
		System.out.println(p*r/100);
	}
	public static final void getBankDetails() {
		System.out.println("Home loan interest is 8.5");
		System.out.println("Personal loan Intrest is 11%");
	}

}
