package com.java;
import java.util.*;

public class Sort {

	public static void main(String[] args) {
		int[] arr = { 10, 7, 6, 2, 1, 5 };
		int temp = 0;
		int l = arr.length;

		for (int i = 0; i <= l - 1; i++) {

			for (int j = i + 1; j <= l - 1; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

		}
		System.out.println(Arrays.toString(arr));
	}

}
