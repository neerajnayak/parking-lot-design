package com.design.parkinglot.service;

public interface PaymentStrategy {
	void receivePayment(double amount);
}
