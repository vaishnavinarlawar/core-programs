package com.java;

public class DuplicateArray {

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 3, 5, 2, 6, 7, 7, 8, };
		System.out.println("Duplicate array");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					System.out.println(arr[j]);
			}
		}
	}

}
