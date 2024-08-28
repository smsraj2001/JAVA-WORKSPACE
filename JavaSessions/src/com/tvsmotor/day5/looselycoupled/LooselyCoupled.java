package com.tvsmotor.day5.looselycoupled;

public class LooselyCoupled {
	public static void main(String[] args) {
		
		// This makes the code loosely coupled.
		Banking banking = new GooglePay();
		banking.transferFund();
		banking.transactionHistory();
		
		Banking banking2 = new PhonePay();
		banking2.transactionHistory();
		banking2.transferFund();
		
		
		
	}
}
