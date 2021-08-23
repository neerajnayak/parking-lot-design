package com.design.parkinglot.service;

import com.design.parkinglot.ParkingLot;
import com.design.parkinglot.ParkingSpot;
import com.design.parkinglot.SpotType;
import com.design.parkinglot.Ticket;
import com.design.parkinglot.VehicleDetail;

public class AllotmentService {
	private AllotmentStrategy strategy;
	private ParkingLot parkingLot;

	public AllotmentService(ParkingLot parkingLot, AllotmentStrategy strategy) {
		this.parkingLot = parkingLot;
		this.strategy = strategy;
	}

	public AllotmentStrategy getStrategy() {
		return strategy;
	}

	public void setStrategy(AllotmentStrategy strategy) {
		this.strategy = strategy;
	}

	public Ticket allotParking(VehicleDetail vehicleDetail) {
		ParkingSpot spot = null;

		switch (vehicleDetail.getType()) {
		case BIKE:
			spot = strategy.getSpot(parkingLot,SpotType.SMALL);
			if (spot != null) {
				break;
			}
		case CAR:
			spot = strategy.getSpot(parkingLot, SpotType.MEDIUM);
			if (spot != null) {
				break;
			}
		case BUS:
			spot = strategy.getSpot(parkingLot, SpotType.LARGE);
			if (spot != null) {
				break;
			}
		}
		
		if (spot == null) {
			System.out.println("No spot available...");
			return null;
		}
		
		spot.setAvailable(false);
		
		Ticket newTicket = new Ticket(vehicleDetail, spot);
		
		return newTicket;
	}
}
