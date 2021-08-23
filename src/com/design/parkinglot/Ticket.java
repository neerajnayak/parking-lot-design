package com.design.parkinglot;

import java.util.Date;

public class Ticket {
	private int id;
	private static final UIDGenerator uidGenerator = new UIDGenerator(0);
	private VehicleDetail vehicleDetail;
	private ParkingSpot spot;
	private Date inTime;
	private Date outTime;
	private double ticketAmount;
	
	public Ticket(VehicleDetail vehicleDetail, ParkingSpot spot) {
		this.id = uidGenerator.getNext();
		this.vehicleDetail = vehicleDetail;
		this.spot = spot;
		this.inTime = new Date();
	}

	public VehicleDetail getVehicleDetail() {
		return vehicleDetail;
	}

	public void setVehicleDetail(VehicleDetail vehicleDetail) {
		this.vehicleDetail = vehicleDetail;
	}

	public ParkingSpot getSpot() {
		return spot;
	}

	public void setSpot(ParkingSpot spot) {
		this.spot = spot;
	}

	public double getTicketAmount() {
		return ticketAmount;
	}

	public void setTicketAmount(double ticketAmount) {
		this.ticketAmount = ticketAmount;
	}

	public int getId() {
		return id;
	}

	public Date getOutTime() {
		return outTime;
	}

	public void setOutTime(Date outTime) {
		this.outTime = outTime;
	}

	public Date getInTime() {
		return inTime;
	}
	
}
