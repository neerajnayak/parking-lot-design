package com.design.parkinglot;

public class VehicleDetail {
	private String vehicleNumber;
	private VehicleType type;
	
	public VehicleDetail(String vehicleNumber, VehicleType type) {
		this.vehicleNumber = vehicleNumber;
		this.type = type;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public VehicleType getType() {
		return type;
	}
	
}
