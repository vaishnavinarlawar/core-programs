package com.string;

public class ReverseofTheString {

	public static String ReversoftheString(String s1) {
		String s = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			s = s + s1.charAt(i);
		}
		return s;
	}

	public static void main(String[] args) {
		String s = "Hello I'm Java Developer";
		// String s1 = ReversoftheString("Swap");

		String str1 = "";
		String[] s1 = s.split(" ");

		for (int i = 0; i <= s1.length - 1; i++) {
//			System.out.println(s1[i]);

			String st = s1[i];
			String strev = ReversoftheString(st);

			str1 = str1 + strev;
			str1 = str1 + " ";

		}

		System.out.println(str1.trim());
	}

}
