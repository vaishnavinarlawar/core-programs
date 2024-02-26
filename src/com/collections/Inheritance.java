package com.collections;

public class Inheritance {

	public static void main(String[] args) {
		c1 obj1 = new c1();
		obj1.m();
		obj1.m1();
	}
}

class C {

	void m() {
		System.out.println("m");
	}
}

class c1 extends C {
	void m1() {
		System.out.println("m1");
	}
}

class c2 extends C {
	void m2() {
		System.out.println("m2");
	}
}

class c3 extends C {
	void m3() {
		System.out.println("m3");
	}

}
