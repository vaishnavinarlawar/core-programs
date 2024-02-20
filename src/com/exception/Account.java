package com.exception;

import java.util.Scanner;

public class Account {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int b = sc.nextInt();
		if(h>=0 && b>=0) {
			int a=h*b;
			System.out.println(a);
		}
		else {
			System.out.println("java.lang.exception: Breadth and Height must be psitive");
		}
		
		
	}

}
