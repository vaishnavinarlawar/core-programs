package com.java;

public class MinAndMax {

	public static void main(String[] args) {
		int[] arr= {6,-2,3,5,6,7,8,9,10};
		
        int max =0, min=arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
				if(arr[i]<min) {
					min=arr[i];
					
				}
			}
		
		
		System.out.println("minimum value: "+max);
		
		System.out.println("minimum value: "+min);
	}
	
}
