package com.java;

import java.util.Arrays;

public class DuplicateNumber {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 2, 3, 4, 4, 5 };
		int l = arr.length;
		int[] arr1 = new int[l];
		int j = 0;
		for (int i = 0; i < l - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				arr1[j++] = arr[i];
			}
		}
		arr1[j++] = arr[l - 1];

		System.out.println(Arrays.toString(arr1));
	}

}

