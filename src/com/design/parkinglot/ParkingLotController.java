package com.design.parkinglot;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.design.parkinglot.service.AllotmentService;
import com.design.parkinglot.service.HourlyPriceCalculatorStrategy;
import com.design.parkinglot.service.PaymentService;
import com.design.parkinglot.service.PriceCalculator;
import com.design.parkinglot.service.SequentialAllotmentStrategy;

public class ParkingLotController {
	private ParkingLot parkingLot;
	private AllotmentService allotmentService;
	private PriceCalculator priceCalculator;
	private PaymentService paymentService;
	private Map<Integer, Ticket> tickets = new HashMap<>();
	
	public ParkingLotController(ParkingLot parkingLot) {
		this.parkingLot = parkingLot;
		this.allotmentService = new AllotmentService(parkingLot, new SequentialAllotmentStrategy());
		this.priceCalculator = new PriceCalculator(new HourlyPriceCalculatorStrategy());
		this.paymentService = new PaymentService();
	}
	
	public void operate() {
		int input = 0;
		boolean isProgress = true;
		while(isProgress) {
			System.out.println("Enter operation ------");
			System.out.println("1: park vehicle");
			System.out.println("2: exit vehicle");
			System.out.println("100: terminate");
			
			input = InputReader.readInput();
			
			switch(input) {
			case 1:
				System.out.println("Enter gate number");
				input = InputReader.readInput();
				if(parkingLot.getGates().get(input).parkVehicle()) {
					System.out.println("Enter vehicle number");
					String vehicleNumber = InputReader.readStringInput();
					System.out.println("Enter vehicle type ----");
					System.out.println("Bike - 0, Car - 1, Bus - 2");
					VehicleType type = VehicleType.getType(InputReader.readInput());
					VehicleDetail vd = new VehicleDetail(vehicleNumber, type);
					
					Ticket newTicket = allotmentService.allotParking(vd);
					
					if (newTicket != null) {
						tickets.put(newTicket.getId(), newTicket);
						System.out.println("Please park your vehicle in spot number: " + newTicket.getSpot().getId());
					}
				}
				break;
			case 2: 
				System.out.println("Enter gate number");
				input = InputReader.readInput();
				if (parkingLot.getGates().get(input).exitVehicle()) {
					System.out.println("Enter ticket number");
					input = InputReader.readInput();
					Ticket ticket = tickets.get(input);
					ticket.setOutTime(new Date());
					priceCalculator.calculateTotalAmount(ticket);
					System.out.println("Please pay amount: "+ ticket.getTicketAmount());
					paymentService.makePayment(ticket.getTicketAmount());
					ticket.getSpot().setAvailable(true);
					tickets.remove(ticket.getId());
					System.out.println("Thanks for using the parking service. Have a nice day!");
				}
				break;
			case 100:
			default: isProgress = false;
			}
			
		}
	}
	
}
