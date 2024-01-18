package com.cjc;

import java.util.*;

public class Student {
 private List myList;
 private Set mySet;
 private Map myMap;
 public List getMyList() {
	return myList;
}
public void setMyList(List myList) {
	this.myList = myList;
}
public Set getMySet() {
	return mySet;
}
public void setMySet(Set mySet) {
	this.mySet = mySet;
}
public Map getMyMap() {
	return myMap;
}
public void setMyMap(Map myMap) {
	this.myMap = myMap;
}
@Override
public String toString() {
	return "Student [myList=" + myList + ", mySet=" + mySet + ", myMap=" + myMap + "]";
}

 
}
