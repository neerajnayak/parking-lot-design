package com.design.parkinglot.service;

import java.util.Date;

import com.design.parkinglot.SpotType;
import com.design.parkinglot.Ticket;

public class PriceCalculator {
	private PriceCalculatorStrategy strategy;
	
	public PriceCalculator(PriceCalculatorStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void calculateTotalAmount(Ticket ticket) {
		
		Date inTime = ticket.getInTime();
		Date outTime = ticket.getOutTime();
		double rate = SpotType.getPrice(ticket.getSpot().getType());
		double totalAmount = strategy.calculate(inTime, outTime, rate);
		
		ticket.setTicketAmount(totalAmount);
	}
}
