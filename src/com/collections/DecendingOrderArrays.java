package com.collections;

public class DecendingOrderArrays {

	public static void main(String[] args) {
		// initialize array
		int[] arr = new int[] { 5, 2, 8, 7, 1 };
		int temp = 0;
		// Displaying elements of original array
		System.out.println("Elements of original array");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		// sort the array in decending order
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}
		System.out.println();
		System.out.println("Sorted array in decending order");
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
	}
}
