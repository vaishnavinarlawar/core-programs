package com.java;

public class RandomNumber {

	public static void main(String[] args) {
		 int min=200,max=400;
		 System.out.println("Math.random");
		 System.out.println((int)(Math.random()*(max-min+1)+min));
		 
		 int b=(int)(Math.random()*(max-min+1)+min);
	}

}
