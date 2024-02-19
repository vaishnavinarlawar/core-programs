package com.java;
import java.util.*;

public class ComparatorEx {

	public static void main(String[] args) {
		
		ComparatorEx1 r1=new ComparatorEx1("premier","Single","2");
		ComparatorEx1 r2=new ComparatorEx1("duplex","double","6");
		ComparatorEx1 r3=new ComparatorEx1("premier","single","8");
		
		ArrayList<ComparatorEx1>l1=new ArrayList<>();
		l1.add(r1);
		l1.add(r2);
		l1.add(r3);
System.out.println(l1);
l1.sort(ComparatorEx1.comp.reversed());
System.out.println(l1);
l1.sort(ComparatorEx1.comp);
System.out.println(l1);


	}

}

class ComparatorEx1 implements Comparable<ComparatorEx1> {
	public static Comparator<ComparatorEx1> comp = Comparator.comparing(ComparatorEx1::getName)
			.thenComparing(ComparatorEx1::getType).thenComparing(ComparatorEx1::getCapacity);

	@Override
	public int compareTo(ComparatorEx1 o) {
		int res = o.getName().compareTo(this.getName());

		return res != 0 ? res : o.getType().compareTo(this.getType());
	}

	String name, type, capacity;

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

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public ComparatorEx1(String name, String type, String capacity) {
		super();
		this.name = name;
		this.type = type;
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "ComparatorEx1 [name=" + name + ", type=" + type + ", capacity=" + capacity + "]";
	}

}