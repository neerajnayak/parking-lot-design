package com.design.parkinglot;

public class UIDGenerator {
	private int uid;
	
	public UIDGenerator(int val) {
		this.uid = val;
	}
	
	public int getNext() {
		return uid++;
	}
}
