package com.string;

public class ReverseWords2 {
	
	public static String rev(String s) {
		String s1 = "";
		for (int a = s.length() - 1; a >= 0; a--) {
			s1 = s1 + s.charAt(a);
		}
		return s1;
	}


	public static void main(String[] args) {
		
		String str = "Vaishnavi is  cute girl";

		String[] arr = str.split(" ");

		String result = "";

		for (int i = arr.length - 1; i >= 0; i--) {

			result = result + rev(arr[i]);
			result = result + " ";

		}

		System.out.println(result);
	}



		
	

}
