package com.design.parkinglot.service;

import java.util.Date;

public interface PriceCalculatorStrategy {

	double calculate(Date inTime, Date outTime, double rate);
}
