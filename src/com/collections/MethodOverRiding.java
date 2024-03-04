package com.collections;

public class MethodOverRiding {

	public static class Animal {

		public String bark() {
			return "Dont Know";
		}
	}

	public static class Cat extends MethodOverRiding {

		public String bark() {
			return "Meow Meow";
		}
	}

	public static void main(String[] args) {
		Cat cat = new Cat();
		System.out.println(cat.bark());

	}

}
