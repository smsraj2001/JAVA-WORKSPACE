package com.tvsmotor.client;

import com.tvsmotor.pojomodel.*;
import com.tvsmotor.service.*;
public class MainApp {
	public static void main(String[] args) {
		AccountService accserve = new AccountService();
		Account account = new Account();
		account.setBalance(50000.00);
		System.out.println(accserve.withdraw(account, 5000));
		System.out.println(accserve.withdraw(account, 100000));
		System.out.println(accserve.deposit(account, 10000));
	}

}
