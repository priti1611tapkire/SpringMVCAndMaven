package com;

public class State {
	private String name;
	private County con;

	public County getCon() {
		return con;
	}

	public void setCon(County con) {
		this.con = con;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
