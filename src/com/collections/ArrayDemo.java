package com.collections;

import java.util.ArrayList;
import java.util.List;

class Room1{
	String Name;
	long Rate;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public long getRate() {
		return Rate;
	}
	public void setRate(long rate) {
		Rate = rate;
	}
	public Room1(String name, long rate) {
		super();
		Name = name;
		Rate = rate;
		
	}
	@Override
	public String toString() {
		return "Room1 [Name=" + Name + ", Rate=" + Rate + "]";
	}
	
	
}

public class ArrayDemo {

	public static void main(String[] args) {
		List<Room1>l1= new ArrayList<Room1>();
		Room1 r1 = new Room1("vaishnavi",500l);
		Room1 r2 = new Room1("Swarali",600l);
		l1.add(r1);
		l1.add(r2);
		System.out.println(l1);
	

	}

}
