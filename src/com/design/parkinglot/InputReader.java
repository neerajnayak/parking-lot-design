package com.design.parkinglot;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputReader {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static int readInput() {
		int in = -1;
		try {
			in = Integer.parseInt(br.readLine());
		} catch(Exception e) {
			System.out.println("IOException: "+ e.getMessage());
		}
		return in;
	}
	
	public static String readStringInput() {
		String in = "";
		try {
			in = br.readLine();
		} catch(Exception e) {
			System.out.println("IOException: "+ e.getMessage());
		}
		return in;
	}
}
