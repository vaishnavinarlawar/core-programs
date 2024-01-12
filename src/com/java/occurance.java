package com.java;

public class occurance {

	public static void main(String[] args) {
		
		/*	int n= 5634,d=9, count = 0;
			while(n>0) {
				int a=n%10;
				if(a==d)
					
					count++;
				n/=10;
			}
			System.out.println(count);*/
		
				int[] arr= {1,2,2,2,3,4,5};
		int count = 0;
		for(int i=0; i<arr.length; i++) 
		{
			 
			
				if(arr[i]==2) 
				{
					count++;
				}
			}
		
			System.out.println(count);
	}

}
