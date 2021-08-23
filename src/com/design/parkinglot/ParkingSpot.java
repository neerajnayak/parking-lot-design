package com.design.parkinglot;

public class ParkingSpot {
	private int id;
	private SpotType type;
	private boolean isAvailable;
	private static final UIDGenerator uidGenerator = new UIDGenerator(0);
	
	public ParkingSpot(SpotType type) {
		this.type = type;
		this.id = uidGenerator.getNext();
		isAvailable = true;
	}

	public int getId() {
		return id;
	}

	public SpotType getType() {
		return type;
	}

	public void setType(SpotType type) {
		this.type = type;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	
}
