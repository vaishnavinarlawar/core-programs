package com.java;

public class LargestNumber {

	public static void main(String[] args) {
	long a=45, b=89, c=122,temp;
	
	temp =a>b?a:b;
	long largest=c>temp?c:temp;
	System.out.println("largest number is:"+ largest);	

	temp =a<b?a:b;
	long smallest = temp<c?temp:c;
	System.out.println("largest number is:"+ smallest);	
	}

}
