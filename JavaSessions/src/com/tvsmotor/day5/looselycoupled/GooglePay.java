package com.tvsmotor.day5.looselycoupled;

public class GooglePay implements Banking {

	@Override
	public void transferFund() {
		// TODO Auto-generated method stub
		System.out.println("Fund transfer using google pay");

	}

	@Override
	public void transactionHistory() {
		// TODO Auto-generated method stub
		System.out.println("Transaction history about google pay");
	}
}
