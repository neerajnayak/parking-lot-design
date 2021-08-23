package com.design.parkinglot;

public enum VehicleType {
	BIKE, CAR, BUS;

	public static VehicleType getType(int input) {
		for(VehicleType type: VehicleType.values()) {
			if(type.ordinal() == input) {
				return type;
			}
		}
		return null;
	}
}
