package com.tvsmotor.day5.looselycoupled;

public class PhonePay extends Bank implements Banking, TicketBooking{

	@Override
	public void transferFund() {
		// TODO Auto-generated method stub
		System.out.println("Fund transfer using Phone pay");

	}

	@Override
	public void transactionHistory() {
		// TODO Auto-generated method stub
		System.out.println("Transaction history about Phone pay");

	}

	@Override
	public void trainTicket() {
		// TODO Auto-generated method stub
		System.out.println("Booked the train ticket");
		
	}

	@Override
	public void movieTicket() {
		// TODO Auto-generated method stub
		System.out.println("Booked the movie ticket.");
	}
}
