package com.collections;

abstract class Demo{ 

	 abstract void ex();

	}
	class implementation extends  Demo{
		 void ex() {
			System.out.println("abstract");
		}
	}

public class Abstraction {

	public static void main(String[] args) {
		implementation obj1 = new implementation();
		obj1.ex();
	}

}
