package com.design.parkinglot.service;

public class CashPayment implements PaymentStrategy {

	@Override
	public void receivePayment(double amount) {
		System.out.println("Payment of "+amount+ " received in cash");
	}

}
