package com.java;

import java.util.*;

public class DecimalToBinary {

	public static void main(String[] args) {
		int n = 103, j, i, k;
		int[] a = new int[50];

		ArrayList<Integer> arr = new ArrayList<>();

		for (i = n, j = 0; n != 0; n = n / 2, j++) {

			arr.add(n % 2);
			System.out.println(arr);
		}

		for (k = arr.size() - 1; k >= 0; k--) {
			System.out.print(arr.get(k));
		}
		System.out.println();
		System.out.println(arr.size());
	}
}
