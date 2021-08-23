package com.design.parkinglot.service;

import com.design.parkinglot.ParkingLot;
import com.design.parkinglot.ParkingSpot;
import com.design.parkinglot.SpotType;

public interface AllotmentStrategy {
	public ParkingSpot getSpot(ParkingLot parkingLot, SpotType type);
}
