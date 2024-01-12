package com.collections;

public class DuplicateArray {

	public static void main(String[] args) {
		// Initialize array
		int[] arr = new int[] { 51, 2, 3, 4, 28, 7, 8, 3, 8 };
		System.out.println("Duplicate element in givenarray: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])

					System.out.println(arr[j]);
			}
		}

	}

}
