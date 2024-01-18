package com.collections;

import java.util.*;

class Room4 {

	String name;
	String type;
	int NOOfMembers;
	double rate;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNOOfMembers() {
		return NOOfMembers;
	}

	public void setNOOfMembers(int nOOfMembers) {
		NOOfMembers = nOOfMembers;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public Room4(String name, String type, int nOOfMembers, double rate) {
		super();
		this.name = name;
		this.type = type;
		NOOfMembers = nOOfMembers;
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "Room [name=" + name + ", type=" + type + ", NOOfMembers=" + NOOfMembers + ", rate=" + rate + "]";
	}

}

public class Room3 {

	public static void main(String[] args) {
		LinkedHashSet<Room4> rooms = new LinkedHashSet<>();
		// Set<Room1>room1 = new LinkedHashSet<>();{
		// LinkedHashSet rooms1 = (LinkedHashSet)rooms.clone();

		Room4 r1 = new Room4("Royal", "Luxury", 4, 300);
		Room4 r2 = new Room4("Royal1", "Luxury", 8, 6000);
		Room4 r3 = new Room4("Royal2", "Luxury", 12, 3000);

		rooms.add(r1);
		rooms.add(r2);
		rooms.add(r3);

		Iterator<Room4> aa = rooms.iterator();
		while (aa.hasNext()) {
			Room4 i = aa.next();
			System.out.println(i);

		}
	}

}
