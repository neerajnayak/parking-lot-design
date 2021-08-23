package com.design.parkinglot.service;

import com.design.parkinglot.ParkingFloor;
import com.design.parkinglot.ParkingLot;
import com.design.parkinglot.ParkingSpot;
import com.design.parkinglot.SpotType;

public class SequentialAllotmentStrategy implements AllotmentStrategy {

	@Override
	public ParkingSpot getSpot(ParkingLot parkingLot, SpotType type) {
		for(ParkingFloor floor: parkingLot.getFloors().values()) {
			for(ParkingSpot spot: floor.getSpots().values()) {
				if (spot.getType() == type && spot.isAvailable()) {
					return spot;
				}
			}
		}
		return null;
	}

}
