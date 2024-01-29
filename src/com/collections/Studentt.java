package com.collections;

public class Studentt {
	int Student_RollNo;
	String Student_Name;
	String Department_Name;
	String College_Name;

	Studentt(int SR, String SN, String DN, String CN) {
		Student_RollNo = SR;
		Student_Name = SN;
		Department_Name = DN;
		College_Name = CN;

	}

	void Display() {
		System.out.println(Student_RollNo + " " + Student_Name + " " + Department_Name);
	}

	public static void main(String[] args) {
		System.out.println("***Student Details***");
		Studentt s1 = new Studentt(101, "Vaishnavi", "Computer Departmment", "JSPM College Pune");
		Studentt s2 = new Studentt(102, "Ravi", "Mechanical Departmment", "Sinhgad College Pune");
		Studentt s3 = new Studentt(103, "Ganesh", "civil Departmment", "PICT College Pune");
		s1.Display();
		s2.Display();
		s3.Display();

	}

}
