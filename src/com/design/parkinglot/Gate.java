package com.design.parkinglot;

public class Gate {
	private int id;
	private static final UIDGenerator uidGenerator = new UIDGenerator(0);
	private GateType type;
	
	public Gate(GateType type) {
		id = uidGenerator.getNext();
		this.type = type;
	}

	public GateType getType() {
		return type;
	}

	public void setType(GateType type) {
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public boolean parkVehicle() {
		if(this.type == GateType.EXIT) {
			System.out.println("Please use the Entry gate");
			return false;
		}
		
		return true;
	}

	public boolean exitVehicle() {
		if(this.type == GateType.ENTRY) {
			System.out.println("Please use the Exit gate");
			return false;
		}
		
		return true;
	}
	
}
