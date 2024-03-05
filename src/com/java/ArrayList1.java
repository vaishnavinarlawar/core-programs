package com.java;

import java.util.*;

public class ArrayList1 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 2, 3, 4, 4, 5 };
		int i1 = arr.length;
		ArrayList<Integer> a = new ArrayList<>();
		// int j=0;

		for (int i = 0; i < i1 - 1; i++) {

			if (arr[i] != arr[i + 1]) {
				a.add(arr[i]);
			}

		}
		a.add(arr[i1 - 1]);
		System.out.println(a);
	}
}
