package com.collections;

public class Student2 {
	int RollNo;
	String Name;
	String College = "ITS";
Student2(int R,String n ){
	RollNo = R;
	Name = n;
}
 void display() {
 System.out.println(RollNo+ " "+Name+ " "+College);
 }

	public static void main(String[] args) {
		Student2 s1 = new
				Student2(111,"Karan");
				
				Student2 s2 = new
				Student2(222,"Aryan");
				s1.display();
				s2.display();
				
	}

}
