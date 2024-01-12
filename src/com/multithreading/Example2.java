package com.multithreading;

public class Example2 {

	public static void main(String[] args) {
		Ex1 obj=new Ex1();
		Thread obj1=new Thread(obj);
obj1.start();

	}

}
class Ex1 implements Runnable{

	@Override
	public void run() {
		System.out.println("Hello");
		

	}

}
