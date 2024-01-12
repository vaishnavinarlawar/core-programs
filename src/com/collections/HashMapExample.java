package com.collections;

import java.util.*;

class Room {
	String name, address;
	long rate;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getRate() {
		return rate;
	}

	public void setRate(long rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "Room [name=" + name + ", address=" + address + ", rate=" + rate + "]";
	}

	public Room(String name, String address, long rate) {
		super();
		this.name = name;
		this.address = address;
		this.rate = rate;
	}

}

class Guest {
	String FistName, LastName;

	public String getFistName() {
		return FistName;
	}

	public void setFistName(String fistName) {
		FistName = fistName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	@Override
	public String toString() {
		return "Guest [FistName=" + FistName + ", LastName=" + LastName + "]";
	}

	public Guest(String fistName, String lastName) {
		super();
		FistName = fistName;
		LastName = lastName;
	}

}

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Room, Guest> h1 = new HashMap<>();
		Room r1 = new Room("Delux", "pune", 2000l);
		Room r2 = new Room("Premeir", "pune", 3000l);

		Guest g1 = new Guest("sager", "Rai");
		Guest g2 = new Guest("sanket", "sarode");

		h1.put(r1, g1);
		h1.put(r2, g2);

		System.out.println(h1);

		Guest g = h1.put(r1, h1.remove(r2));
		System.out.println(h1);

		h1.putIfAbsent(r2, g);
		System.out.println(h1);
	}

}
