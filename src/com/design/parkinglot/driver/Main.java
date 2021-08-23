package com.design.parkinglot.driver;

import com.design.parkinglot.Gate;
import com.design.parkinglot.GateType;
import com.design.parkinglot.ParkingFloor;
import com.design.parkinglot.ParkingLot;
import com.design.parkinglot.ParkingLotController;
import com.design.parkinglot.ParkingSpot;
import com.design.parkinglot.SpotType;

public class Main {

	public static void main(String[] args) {
		ParkingSpot spot1 = new ParkingSpot(SpotType.SMALL);
		ParkingSpot spot2 = new ParkingSpot(SpotType.MEDIUM);
		ParkingSpot spot3 = new ParkingSpot(SpotType.LARGE);
		
		ParkingFloor floor1 = new ParkingFloor();
		floor1.addSpot(spot1);
		floor1.addSpot(spot2);
		floor1.addSpot(spot3);
		
		Gate gate1 = new Gate(GateType.ENTRY);
		Gate gate2 = new Gate(GateType.EXIT);
		
		ParkingLot parkingLot = new ParkingLot();
		parkingLot.addFloor(floor1);
		parkingLot.addGate(gate1);
		parkingLot.addGate(gate2);
		
		ParkingLotController controller = new ParkingLotController(parkingLot);
		
		controller.operate();

	}

}
