package com.design.parkinglot;

import java.util.HashMap;
import java.util.Map;

public enum SpotType {
	SMALL, MEDIUM, LARGE;
	
	private static Map<String, Double> price = new HashMap<>();
	
	static {
		price.put(SpotType.SMALL.name(), 10.0);
		price.put(SpotType.MEDIUM.name(), 20.0);
		price.put(SpotType.LARGE.name(), 50.0);
	}
	
	public static double getPrice(SpotType spotType) {
		return price.get(spotType.name());
	}
	
	public static void setPrice(SpotType spotType, double rate) {
		price.put(spotType.name(), rate);
	}
}
