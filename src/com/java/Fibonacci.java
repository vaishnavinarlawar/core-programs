package com.java;

public class Fibonacci {

	public static void main(String[] args) {

		int n = 5, t1 = 0, t2 = 1;
		// System.out.println("upto "+n + ": ");
		while (t1 <= n) {
			System.out.println(t1 + " ");
			int sum = t1 + t2;
			t1 = t2;
			t2 = sum;

		}
	}

}
