package com.design.parkinglot.service;

public class CardPayment implements PaymentStrategy {

	@Override
	public void receivePayment(double amount) {
		System.out.println("Payment of "+amount+ " successful through card");
	}

}
