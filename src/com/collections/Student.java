package com.collections;



public class Student {

	int rollno;
	String name;

	Student(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;

	}

	public static void main(String args[]) {

		Student s1 = new Student(1, "vaishnavi");

		System.out.println(s1.rollno + " " + s1.name);

	}

}
