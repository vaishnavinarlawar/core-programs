package com.multithreading;

class Demo4{
	int x =10;
	synchronized public void sync(int y) {
		System.out.println(y);//10
		try {
			wait();
		}catch(Exception e) {
			
		}
		System.out.println("Continue sync method");
		}
	synchronized public void notifyMethod() {
		System.out.println("Calling notify()");
		notify();
	}
	}

public class ThreadWaitEx extends Thread{
	public void run() {
		System.out.println("calling run method");
	}


	public static void main(String[] args) {
		Demo4 ex=new Demo4();
		new Thread() {
			public void run() {
				ex.sync(10);
				}
			}.start();
			new Thread() {
				public void run() {
					ex.notifyMethod();
				}
			}.start();
		
	}

}
