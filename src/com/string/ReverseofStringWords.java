package com.string;

public class ReverseofStringWords {

	public static void main(String[] args) {

		String s = "Hello I'm Java Developer";
		String[] sarr = s.split(" ");
		System.out.println(sarr[1]);

		String s2 = sarr[1];
		System.out.println(s2);
		System.out.println("----");

		for (int i = sarr.length - 1; i >= 0; i--) {
			System.out.println(sarr[i]);
		}
	}

}
