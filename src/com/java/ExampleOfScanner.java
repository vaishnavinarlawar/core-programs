package com.java;

import java.util.Scanner;

public class ExampleOfScanner {

	public static void main(String[] args) {
		Scanner aa = new Scanner(System.in);

		System.out.println("enter two numbers");
		int a = aa.nextInt();
		int b = aa.nextInt();
		int c = a + b;
		System.out.println(c);
	}

}
