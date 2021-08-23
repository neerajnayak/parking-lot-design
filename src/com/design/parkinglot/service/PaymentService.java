package com.design.parkinglot.service;

import java.util.ArrayList;
import java.util.List;

import com.design.parkinglot.InputReader;

public class PaymentService {
	private List<PaymentStrategy> strategies;
	
	public PaymentService() {
		strategies = new ArrayList<>();
		strategies.add(new CashPayment());
		strategies.add(new CardPayment());
	}
	public void makePayment(double amount) {
		System.out.println("Please enter payment mode");
		System.out.println("0 - Cash");
		System.out.println("1 - Card");
		int input = InputReader.readInput();
		
		strategies.get(input).receivePayment(amount);
	}
}
