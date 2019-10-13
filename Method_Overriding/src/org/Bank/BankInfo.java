package org.Bank;

public class BankInfo extends AxisBank {
	public void saving() {
		System.out.println("savings");
		
	}
	public void deposit() {
		System.out.println("deposit");
	}
	public void fixed() {
		System.out.println("fixed");
	}
	public static void main(String[] args) {
		BankInfo B=new AxisBank();
		B.saving();
		B.deposit();
		B.fixed();
	}

}

