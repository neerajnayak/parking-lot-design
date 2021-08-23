package com.design.parkinglot.service;

import java.util.Date;

public class HourlyPriceCalculatorStrategy implements PriceCalculatorStrategy {

	@Override
	public double calculate(Date inDate, Date outDate, double rate) {
		long inTime = inDate.getTime();
		long outTime = outDate.getTime();
		
		int timeInHours = (int) Math.ceil((double)(outTime - inTime) / (1000 * 3600));

		return rate * timeInHours;
	}

}
