package com.design.parkinglot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLot {
	private Map<Integer, ParkingFloor> floors = new HashMap<>();
	private Map<Integer, Gate> gates = new HashMap<>();
	
	public Map<Integer, ParkingFloor> getFloors() {
		return floors;
	}
	public void addFloor(ParkingFloor floor) {
		floors.put(floor.getId(), floor);
	}
	public Map<Integer, Gate> getGates() {
		return gates;
	}
	public void addGate(Gate gate) {
		gates.put(gate.getId(), gate);
	}
	
	
}
