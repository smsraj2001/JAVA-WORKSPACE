package com.tvsmotor.day4.pojo.service;

import java.util.*;

import com.tvsmotor.day4.pojo.pojomodel.*;
public class AccountService {
	Account acc = new Account(); 
	Scanner sc = new Scanner(System.in);
	
	public double withdraw(Account account, double amount)
	{
		if(amount <= account.getBalance())
		{
			double balance = account.getBalance() - amount;
			account.setBalance(balance);
			return account.getBalance();
			
		}
		return account.getBalance();
		
		
	}
	public double deposit(Account account, double amount)
	{
		double balance = account.getBalance() + amount;
		account.setBalance(balance);
		return account.getBalance();
	}
}
