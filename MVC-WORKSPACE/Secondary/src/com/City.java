package com;

public class City {

	
	private int pincode;
	private String name;
	private State state;
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
