package com.java;
import java.lang.reflect.Array;
import java.util.*;

public class ComparableEx {

	public static void main(String[] args) {
		Room r1=new Room("premier","single","5");
		Room r2=new Room("duplex","double","6");
		Room r3=new Room("premier","single","8");
		
		ArrayList<Room>l1=new ArrayList<>();
		l1.add(r1);
		l1.add(r2);
		l1.add(r3);
        System.out.println(l1);
        Collections.sort(l1);
        System.out.println(l1);
	}

}
class Room implements Comparable <Room>{

	 public int compareTo(Room o) {
		int res=(o.getName().compareTo(this.getName()));
		return res;
		
			}
	String Name, Type, Capacity;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getCapacity() {
		return Capacity;
	}
	public void setCapacity(String capacity) {
		Capacity = capacity;
	}
	public Room(String name, String type, String capacity) {
		super();
		Name = name;
		Type = type;
		Capacity = capacity;
	}
	public Room(String name2, String type2, int i) {
	}
	@Override
	public String toString() {
		return "Room [Name=" + Name + ", Type=" + Type + ", Capacity=" + Capacity + "]";
	}
	

}