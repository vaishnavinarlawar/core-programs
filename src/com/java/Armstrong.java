package com.java;

import java.util.*;

public class Armstrong {

	public static void main(String[] args) {

		int sum = 0, digit = 0, n = 123;
		int temp1 = n;
		int temp = n;
		while (temp > 0) {
			temp = temp / 10;
			digit++;

		}
		System.out.println(digit);
		System.out.println(temp);

		while (temp1 != 0) {
			sum += Math.pow(temp1 % 10, digit);
			temp1 = temp1 / 10;

		}
		System.out.println(sum);
		if (sum == n) {
			System.out.println(n + "Armstrong");
		} else {
			System.out.println("Not Armstrong");
		}
	}

}
