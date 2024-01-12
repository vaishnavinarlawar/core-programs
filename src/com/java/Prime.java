package com.java;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			int n=  sc.nextInt();
		for(int i=0; i<=n/2; ++i) {
			if(n%i==0) {
			
			System.out.println(n);
		}
		}
		//program for reverse string
		/*String s="vaishnavi";
		String str1="";
		for(int i=s.length()-1;i>=0;i--) {
			str1=str1+s.charAt(i);
			
		}*/
		/*StringBuilder sb=new StringBuilder();
		sb.append(s);
		sb.reverse();
		System.out.println(sb);
		//System.out.println(str);*/
		/*int i,j,row=6;
		for(i=0;i<=6;i++) {
			for(j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}*/

		/*int i,j,row=6;
		for(i=6;i<=1;i--) {
			for(j=1;j<=i-1;j++) {
				System.out.print("");
			}
			for(int j=0;j<=6-i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}*/
	}

}
