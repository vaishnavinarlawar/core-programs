package com.java;

import java.util.*;

public class LargestValue {

	public static void main(String[] args) { 
	int[] arr= {1,2,5,7,6,8,15,25,14};
				int size=arr.length;

		Arrays.sort(arr);
		
		System.out.println("second largest number is: "+arr[size-2]);
	}

}
