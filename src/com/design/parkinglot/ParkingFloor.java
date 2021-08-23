package com.design.parkinglot;

import java.util.HashMap;
import java.util.Map;

public class ParkingFloor {
	private int id;
	private static final UIDGenerator uidGenerator = new UIDGenerator(0);
	private Map<Integer, ParkingSpot> spots = new HashMap<>();
	
	public ParkingFloor() {
		this.id = uidGenerator.getNext();
	}
	
	public int getId() {
		return id;
	}

	public Map<Integer, ParkingSpot> getSpots() {
		return spots;
	}

	public void addSpot(ParkingSpot spot) {
		spots.put(spot.getId(), spot);
	}
	
	public void removeSpot(int spotId) {
		if(spots.containsKey(spotId)) {
			spots.remove(spotId);
		}
	}
	
	
}
