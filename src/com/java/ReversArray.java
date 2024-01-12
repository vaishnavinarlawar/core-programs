package com.java;

import java.util.*;

public class ReversArray {

	public static void main(String[] args) {
		int[]arr= {1,2,3,4,5};
		int i1=arr.length;
		ArrayList<Integer> a=new ArrayList<>();
		//int j=0;

        for(int i=i1-1; i>=0; i--) 
		
		{
		a.add(arr[i]);

			}
		System.out.println(a);
	}
}