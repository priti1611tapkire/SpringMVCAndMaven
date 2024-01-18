package com;

import java.util.Arrays;

public class Student {
private int rollno;
private String name;
private String mobno[];
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String[] getMobno() {
	return mobno;
}
public void setMobno(String[] mobno) {
	this.mobno = mobno;
}
@Override
public String toString() {
	return "Student [rollno=" + rollno + ", name=" + name + ", mobno=" + Arrays.toString(mobno) + "]";
}

}
