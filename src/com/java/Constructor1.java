package com.java;

import java.util.*;

class Animal {
	String name;// null//Dog

	public Animal() {
		System.out.println("Animal Constructor");
	}

	public void Animal(String name) {
		this.name = name;
	}
}

class Dog extends Animal {
	public Dog() {
		System.out.println("Dog Constructor");
	}
}

class Labrador extends Dog {
	public Labrador() {
		System.out.println("Labrador Constructor");
	}
}

public class Constructor1 {

	public static void main(String[] args) {
		Labrador lab = new Labrador();
		Animal obj = new Animal();
		System.out.println(obj.name);
		System.out.println(obj.name);
	}
}
