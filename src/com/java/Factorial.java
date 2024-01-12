package com.java;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		/*Scanner scanner = new Scanner(System.in);       //using scanner
		System.out.println("Enter The Number:");
		int num = scanner.nextInt();
		int factorial = fact(num);
		System.out.println("Factroal of entered number is: "+factorial);
	}
	static int fact(int n) {
	int output;
	if(n==1) {
		return 1;
	}
		output = fact(n-1)*n;
		return output;*/
		
		int fact=1,i,n=5;
		for( i=1; i<=n; i++) {
			
				fact=fact*i;
								}
		System.out.println("factorial "+fact);

	}
		
	}


