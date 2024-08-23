package com.evergent.corejava.ram.application3;

public class EmployeeInformation extends BankAccountDetails implements EmployeeInterface{
	int empno;
	double sal;
	String address;
	@Override
	public void employeeInfo(int eno, float sal) {
		this.empno=eno;
		this.sal=sal;	
	}

	@Override
	public void employeeAddress(String add) {
		this.address=add;
	}

	@Override
	public void employeeDetails() {
		System.out.println("Employee no:"+empno);
		System.out.println("Employee sal:"+sal);
		System.out.println("Employee address:"+address);
		
	}

	@Override
	public void accountDetails() {
		System.out.println("My account details is:1234567");
		
	}
	public void show() {
		System.out.println("This is local method..");
	}
	public static void main(String[] args) {
		EmployeeInformation emp=new EmployeeInformation();
		emp.employeeInfo(100, 500);
		emp.employeeAddress("Hyderabad");
		emp.employeeDetails();
		emp.accountDetails();
		emp.bankDetails();
		BankRBI rbi=new BankRBI();
		BankRBI rbi1=new BankRBI(3.3,3.3);
		BankRBI.getBankDetails();
	}
}
